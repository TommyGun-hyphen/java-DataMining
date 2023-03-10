import MLAlgorithms.DecisionTree.DecisionTree;
import MLData.Data;
import MLAlgorithms.KNN;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(List<Object> row : Data.listRaw){
            for(Object val : row){
                System.out.print(val + " | ");
            }
            System.out.println();
        }

        try{
            ArrayList<Integer> inputs = new ArrayList<>(Arrays.asList(0,1,3,1,0,0));
            String resultKNN = KNN.predict(Data.list, inputs,3);

            DecisionTree decisionTree = DecisionTree.buildDecisionTree(Data.listNominal, Data.columnNames,Data.listNominal.get(0).size()-1);
            decisionTree.getStartNode().printAll(0);
            Map<String, Object> input = new HashMap<>();
            input.put("Age", "A");
            input.put("Sex", "F");
            input.put("BP", "NORMAL");
            input.put("Cholesterol", "HIGH");
            input.put("Na", "A");
            input.put("K", "B");
            String resultDT = String.valueOf(decisionTree.predict(input));
            System.out.println("KNN: " + resultKNN);
            System.out.println("Decision Tree: " + resultDT);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}