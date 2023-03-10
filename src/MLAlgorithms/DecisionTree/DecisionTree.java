package MLAlgorithms.DecisionTree;

import MLData.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisionTree {
    private Node startNode;
    private int dataColCount;

    public DecisionTree(){
        this.startNode = new Node();
    }
    public static double log2(double N)
    {
        // calculate log2 N indirectly
        // using log() method
        double result = (double)(Math.log(N) / Math.log(2));

        return result;
    }
    public static Map<Integer, Double> getEntropies(List<List<Object>> data, List<String> columnNames, int resultColumn){
        Map<Integer, Double> entropies = new HashMap<>();
        for(int col = 0; col < data.get(0).size(); col++){
            if(col == resultColumn) continue;
            int totalOccurences = data.size();
            Map<Object, Integer> valueOccurences = new HashMap<>();
            for(List<Object> row : data){
                Object val = row.get(col);
                valueOccurences.merge(val, 1, Integer::sum);
            }
            Map<Object, Double> sums = new HashMap<>();
            for(Map.Entry<Object, Integer> entry : valueOccurences.entrySet()){
                double sum = 0;
                Map<Object, Integer> occPerResult = new HashMap<>();
                for(List<Object> row : data){
                    if(row.get(col).equals(entry.getKey())){
                        occPerResult.merge(row.get(resultColumn), 1, Integer::sum);
                    }
                }
                for(Map.Entry<Object, Integer> entry1 : occPerResult.entrySet()){
                    double surp = Double.valueOf((int)entry1.getValue())/((int)entry.getValue());
                    double entropy = -surp*log2(surp);
                    sum+= entropy;
                }
                sums.put(entry.getKey(), sum);
            }
            Map<Object, Double> gains = new HashMap<>();

            for(Map.Entry<Object, Double> entry : sums.entrySet()){
                gains.put(entry.getKey(), entry.getValue()*valueOccurences.get(entry.getKey())/totalOccurences);
            }
            double entropy = 0;

            for(Map.Entry<Object, Double> entry : gains.entrySet()){
                entropy += Double.valueOf(valueOccurences.get(entry.getKey()))/totalOccurences * entry.getValue();
            }
            entropies.put(col, entropy);
        }
        return entropies;
    }
    public static Node buildNodeTree(List<List<Object>> data, List<String> columnNames, int resultColumn) throws Exception{
        Map<Integer, Double> entropies = getEntropies(data, columnNames, resultColumn);
        Map.Entry<Integer, Double> max = null;
        for(Map.Entry<Integer, Double> entry : entropies.entrySet()){
            if(max == null || entry.getValue() < max.getValue()){
                max = entry;
            }
        }
        ArrayList<Object> possibleValues = new ArrayList<>();
        for(List<Object> row : data){
            Object val = row.get(max.getKey());
            if(!possibleValues.contains(val)){
                possibleValues.add(val);
            }
        }

        /// test if  result is homogeneous
        Node node = new Node();

        if(max.getValue() == 0 || max.getValue() == 1){
//            node.setName(  String.valueOf(    data.get(0).get(resultColumn)   )   );
//            node.setResult(true);
            Map<Object, Node> children = new HashMap<>();
            for(Object val : possibleValues){
                int col = max.getKey();
                String result = "";
                for(List<Object> row : data){
                    if(row.get(col).equals(val)){
                        result = String.valueOf(row.get(resultColumn));
                        break;
                    }
                }
                children.put(val, new Node(result, true));
            }
            node.setName(columnNames.get(max.getKey()));
            node.setChildren(children);
        }else{
            node.setName(String.valueOf(  columnNames.get((int)max.getKey())  ));
            Map<Object, Node> children = new HashMap<>();
            for(Object val : possibleValues){
                List<List<Object>> newData = Data.filter(data, max.getKey(), val);
                newData = Data.dropColumn(newData, max.getKey());
                List<String> newColumnNames = new ArrayList<>(columnNames);
                newColumnNames.remove((int)max.getKey());
                int newResultColumn = newData.get(0).size()-1;
                children.put(val, buildNodeTree(newData, newColumnNames, newResultColumn));
            }
            node.setChildren(children);
        }


        return node;
    }

    public static DecisionTree buildDecisionTree(List<List<Object>> data, List<String> columnNames, int resultColumn)throws Exception{
        DecisionTree tree = new DecisionTree();
        tree.startNode = buildNodeTree(data, columnNames, resultColumn);
        tree.dataColCount = data.get(0).size();
        return tree;
    }
    public DecisionTree(List<List<Object>> data, List<String> columnNames, int resultColumn) throws Exception{
        this.startNode = buildNodeTree(data, columnNames, resultColumn);
        this.dataColCount = data.get(0).size();
    }

    public Object predict(Map<String, Object> row)throws Exception{
        if(row.entrySet().size() < dataColCount -1){
            throw new Exception("inconsistent data");
        }
        Node node = this.startNode;
        while(!node.isResult()){//while not result
            node = node.getChildren().get(row.get(node.getName()));
        }
        return node.getName();
    }

    public Node getStartNode(){
        return startNode;
    }
}
