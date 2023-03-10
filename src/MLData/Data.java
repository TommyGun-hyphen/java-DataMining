package MLData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    public static final List<List<Object>> listRaw = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(23,"F","HIGH",  "HIGH",0.792535,0.031258,  "drugY" )),
            new ArrayList<>(Arrays.asList(47,"M","LOW",   "HIGH",0.739309,0.056468,  "drugC" )),
            new ArrayList<>(Arrays.asList(47,"M","LOW",   "HIGH",0.697269,0.068944,  "drugC" )),
            new ArrayList<>(Arrays.asList(28,"F","NORMAL","HIGH",0.563682,0.072289,  "drugX" )),
            new ArrayList<>(Arrays.asList(61,"F","LOW",   "HIGH",0.559294,0.030998,  "drugY" )),
            new ArrayList<>(Arrays.asList(22,"F","NORMAL","HIGH",0.676901,0.078647,  "drugX" )) ,
            new ArrayList<>(Arrays.asList(49,"F","NORMAL","HIGH",0.789637,0.048518,  "drugY" )),
            new ArrayList<>(Arrays.asList(41,"M","LOW",   "HIGH",0.766635,0.069461,  "drugC" )) ,
            new ArrayList<>(Arrays.asList(60,"M","NORMAL","HIGH",0.777205,0.05123,   "drugY" )),
            new ArrayList<>(Arrays.asList(43,"M","LOW",   "NORMAL",0.526102,0.027164,"drugY" )),
            new ArrayList<>(Arrays.asList(47,"F","LOW",   "HIGH",0.896056,0.076147,  "drugC" )),
            new ArrayList<>(Arrays.asList(34,"F","HIGH",  "NORMAL",0.667775,0.034782,"drugY" )),
            new ArrayList<>(Arrays.asList(43,"M","LOW",   "HIGH",0.626527,0.040746,  "drugY" )),
            new ArrayList<>(Arrays.asList(74,"F","LOW",   "HIGH",0.792674,0.037851,  "drugY" ))
    ));
    public static final List<List<Object>> list_old = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(1, 3, 0,1,0)),
            new ArrayList<>(Arrays.asList(1, 3, 0,2,0)),
            new ArrayList<>(Arrays.asList(2, 3, 0,1,1)),
            new ArrayList<>(Arrays.asList(3, 2, 0,1,1)),
            new ArrayList<>(Arrays.asList(3, 1, 1,1,1)),
            new ArrayList<>(Arrays.asList(3, 1, 1,2,0)),
            new ArrayList<>(Arrays.asList(2, 1, 1,2,1)),
            new ArrayList<>(Arrays.asList(1, 2, 0,1,0)),
            new ArrayList<>(Arrays.asList(1, 1, 1,1,1)),
            new ArrayList<>(Arrays.asList(3, 2, 1,1,1)),
            new ArrayList<>(Arrays.asList(1, 2, 1,2,1)),
            new ArrayList<>(Arrays.asList(2, 2, 0,2,1)),
            new ArrayList<>(Arrays.asList(2, 3, 1,1,1)),
            new ArrayList<>(Arrays.asList(3, 2, 0,2,0))
    ));

    public static final List<List<Object>> list = new ArrayList(Arrays.asList(
            new ArrayList<>(Arrays.asList( 0, 0, 3, 1, 1, 1, "drugY")),
            new ArrayList<>(Arrays.asList( 1, 1, 1, 1, 1, 1, "drugC")),
            new ArrayList<>(Arrays.asList( 1, 1, 1, 1, 1, 1, "drugC")),
            new ArrayList<>(Arrays.asList( 0, 0, 2, 1, 0, 0, "drugX")),
            new ArrayList<>(Arrays.asList( 1, 0, 1, 1, 0, 0, "drugY")),
            new ArrayList<>(Arrays.asList( 0, 0, 2, 1, 0, 0, "drugX")),
            new ArrayList<>(Arrays.asList( 1, 0, 2, 1, 1, 1, "drugY")),
            new ArrayList<>(Arrays.asList( 0, 1, 1, 1, 1, 1, "drugC")),
            new ArrayList<>(Arrays.asList( 1, 1, 2, 1, 1, 1, "drugY")),
            new ArrayList<>(Arrays.asList( 0, 1, 1, 0, 0, 0, "drugY")),
            new ArrayList<>(Arrays.asList( 1, 0, 1, 1, 1, 1, "drugC")),
            new ArrayList<>(Arrays.asList( 0, 0, 3, 0, 0, 0, "drugY")),
            new ArrayList<>(Arrays.asList( 0, 1, 1, 1, 0, 0, "drugY")),
            new ArrayList<>(Arrays.asList( 1, 0, 1, 1, 1, 1, "drugY")),
            new ArrayList<>(Arrays.asList( 1, 0, 2, 1, 1, 1, "drugX")),
            new ArrayList<>(Arrays.asList( 0, 0, 3, 0, 1, 1, "drugY")),
            new ArrayList<>(Arrays.asList( 1, 1, 1, 0, 1, 1, "drugX")),
            new ArrayList<>(Arrays.asList( 0, 1, 3, 1, 0, 0, "drugA")),
            new ArrayList<>(Arrays.asList( 0, 1, 1, 1, 0, 0, "drugC")),
            new ArrayList<>(Arrays.asList( 0, 0, 3, 0, 0, 0, "drugY"))
    ));
    public static final List<List<Object>> listNominal = new ArrayList(Arrays.asList(
            new ArrayList<>(Arrays.asList( "A","F","HIGH","HIGH","B","A","drugY")),
            new ArrayList<>(Arrays.asList( "B","M","LOW","HIGH","B","B","drugC")),
            new ArrayList<>(Arrays.asList( "B","M","LOW","HIGH","B","B","drugC")),
            new ArrayList<>(Arrays.asList( "A","F","NORMAL","HIGH","A","B","drugX")),
            new ArrayList<>(Arrays.asList( "B","F","LOW","HIGH","A","A","drugY")),
            new ArrayList<>(Arrays.asList( "A","F","NORMAL","HIGH","A","B","drugX")),
            new ArrayList<>(Arrays.asList( "B","F","NORMAL","HIGH","B","A","drugY")),
            new ArrayList<>(Arrays.asList( "A","M","LOW","HIGH","B","B","drugC")),
            new ArrayList<>(Arrays.asList( "B","M","NORMAL","HIGH","B","B","drugY")),
            new ArrayList<>(Arrays.asList( "A","M","LOW","NORMAL","A","A","drugY")),
            new ArrayList<>(Arrays.asList( "B","F","LOW","HIGH","B","B","drugC")),
            new ArrayList<>(Arrays.asList( "A","F","HIGH","NORMAL","A","A","drugY")),
            new ArrayList<>(Arrays.asList( "A","M","LOW","HIGH","A","A","drugY")),
            new ArrayList<>(Arrays.asList( "B","F","LOW","HIGH","B","A","drugY")),
            new ArrayList<>(Arrays.asList( "B","F","NORMAL","HIGH","B","B","drugX")),
            new ArrayList<>(Arrays.asList( "A","F","HIGH","NORMAL","B","B","drugY")),
            new ArrayList<>(Arrays.asList( "B","M","LOW","NORMAL","B","B","drugX")),
            new ArrayList<>(Arrays.asList( "A","M","HIGH","HIGH","A","A","drugA")),
            new ArrayList<>(Arrays.asList( "A","M","LOW","HIGH","A","B","drugC")),
            new ArrayList<>(Arrays.asList( "A","F","HIGH","NORMAL","A","A","drugY"))
    ));
    public static final List<List<Object>> listTennis = new ArrayList(Arrays.asList(
            new ArrayList<>(Arrays.asList("Sunny","Hot","High","False","No")),
            new ArrayList<>(Arrays.asList("Sunny","Hot","High","True","No")),
            new ArrayList<>(Arrays.asList("Overcast","Hot","High","False","Yes")),
            new ArrayList<>(Arrays.asList("Rainy","Mild","High","False","Yes")),
            new ArrayList<>(Arrays.asList("Rainy","Cool","Normal","False","Yes")),
            new ArrayList<>(Arrays.asList("Rainy","Cool","Normal","True","No")),
            new ArrayList<>(Arrays.asList("Overcast","Cool","Normal","True","Yes")),
            new ArrayList<>(Arrays.asList("Sunny","Mild","High","False","No")),
            new ArrayList<>(Arrays.asList("Sunny","Cool","Normal","False","Yes")),
            new ArrayList<>(Arrays.asList("Rainy","Mild","Normal","False","Yes")),
            new ArrayList<>(Arrays.asList("Sunny","Mild","Normal","True","Yes")),
            new ArrayList<>(Arrays.asList("Overcast","Mild","High","True","Yes")),
            new ArrayList<>(Arrays.asList("Overcast","Hot","Normal","False","Yes")),
            new ArrayList<>(Arrays.asList("Rainy","Mild","High","True","No"))
    ));
    public static final List<String> columnNames = new ArrayList<>(Arrays.asList("Age", "Sex", "BP", "Cholesterol", "Na", "K", "Drug"));
    public static final List<String> columnNames2 = new ArrayList<>(Arrays.asList("Outlook","Temperature","Humidity","Windy","Play"));
    public static List<List<Object>> filter(List<List<Object>> initialList, int columnIndex, Object value) throws Exception{
        if(initialList.get(0).size()-1 < columnIndex){
            throw new Exception("List size exception");
        }
        List<List<Object>> newList = new ArrayList<>();
        for(List<Object> row : initialList){
            if(row.get(columnIndex).equals(value)){
                newList.add(row);
            }
        }
        return newList;
    }
    public static List<List<Object>> dropColumn(List<List<Object>> initialList, int columnIndex) throws Exception{
        if(initialList.get(0).size()-1 < columnIndex){
            throw new Exception("List size exception");
        }
        List<List<Object>> newList = new ArrayList<>();
        for(List<Object> initialRow : initialList){
            List<Object> newRow = new ArrayList<>();
            for(int i = 0; i < initialRow.size();i++){
                if(i == columnIndex) continue;
                newRow.add(initialRow.get(i));
            }
            newList.add(newRow);
        }
        return newList;
    }
}
