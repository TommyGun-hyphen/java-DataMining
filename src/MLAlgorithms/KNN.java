package MLAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KNN {
    public static String predict(List<List<Object>> data, ArrayList<Integer> inputs , int K) throws Exception{
        if(data.size() == 0 || data.size() < K){
            throw new Exception("list size error");
        }
        //data for the entry to be predicted
//        ArrayList<Integer> inputs = new ArrayList<>(Arrays.asList(1,0,1,1,1,1));
        int resultColumn = inputs.size();
        //predicted result
        String result;

        //HashMap of distances
        HashMap<Integer, Double> rowDistances = new HashMap<>(); // index => distance

        //populating distances HashMap
        for(int i = 0; i < data.size(); i++){
            List<Object> entry = data.get(i);
//            int ageDistance = Math.abs(entry.get(0) - age);
//            int incomeDistance = Math.abs(entry.get(1) - income);
//            int studentDistance = Math.abs(entry.get(2) - student);
//            int creditDistance = Math.abs(entry.get(3) - credit);
            ArrayList<Integer> columnDistances = new ArrayList<>();
            for(int j = 0; j < inputs.size(); j++){
                columnDistances.add(Math.abs((int)entry.get(j) - inputs.get(j)));
            }
            double sum = 0;
            for(int distance : columnDistances){
                sum += Math.pow(distance,2);
            }
            double distance = Math.sqrt(sum);
            rowDistances.put(i, distance);
        }

        //getting the indices for the K nearest entries (based on distance) and removing them from the distances HashMap
        List<Integer> nearestIndices = new ArrayList<>();
        for(int i = 0; i < K; i ++){
            double minDistance = Double.POSITIVE_INFINITY;
            int minIndex = -1;
            for(Map.Entry<Integer, Double> entry : rowDistances.entrySet()){
                if(entry.getValue() < minDistance){
                    minDistance = entry.getValue();
                    minIndex = entry.getKey();
                }
            }
            nearestIndices.add(minIndex);
            rowDistances.remove(minIndex);
        }

        //getting the nearest entries from the nearest indices
        List<List<Object>> nearestNeighbours = new ArrayList<>();
        for(int i : nearestIndices){
            nearestNeighbours.add(data.get(i));
        }

        //a HashMap that stores the various results and how many times it occurs in the nearest neighbours
        HashMap<String, Integer> resultOccurrences = new HashMap<>(); // result => occurrences (A => 3 times)
        for(List<Object> neighbour : nearestNeighbours){
            if(resultOccurrences.containsKey((String)neighbour.get(resultColumn))){
                resultOccurrences.put((String)neighbour.get(resultColumn), resultOccurrences.get((String)neighbour.get(resultColumn))+1);
            }else{
                resultOccurrences.put((String)neighbour.get(resultColumn), 1);
            }
        }

        //getting the result with the most occurrences
        result = (String)resultOccurrences.keySet().toArray()[0];
        int maxOccur = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : resultOccurrences.entrySet()){
            if(entry.getValue() > maxOccur){
                maxOccur = entry.getValue();
                result = entry.getKey();
            }
        }

        //returning the result
        return result;
    }
}
