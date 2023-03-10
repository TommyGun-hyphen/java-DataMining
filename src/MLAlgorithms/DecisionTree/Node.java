package MLAlgorithms.DecisionTree;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private static int nextUnnamedNode = 0;
    private Map<Object, Node> children;    //  result => Node path // eg LOW => [Node] || HIGH => [Node]
    private String name;
    private boolean isResult;

    public Node(){
        this.name = "NODE-"+String.valueOf(++nextUnnamedNode);
        this.children = new HashMap<>();
        this.isResult = false;
    }
    public Node(String name){
        this.name = name;
        this.children = new HashMap<>();
        this.isResult = false;
    }
    public Node(boolean isResult){
        this.name = "NODE-"+String.valueOf(++nextUnnamedNode);
        this.isResult = isResult;
        if (isResult) this.children = null;
        else this.children = new HashMap<>();
    }
    public Node(String name, boolean isResult){
        this.name = name;
        this.isResult = isResult;
        if (isResult) this.children = null;
        else this.children = new HashMap<>();
    }

    public Map<Object, Node> getChildren() {
        return children;
    }

    public void setChildren(Map<Object, Node> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isResult() {
        return isResult;
    }

    public void setResult(boolean result) {
        isResult = result;
    }
    public void printAll(int indent){
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        if(this.isResult){
            System.out.print("RESULT: ");
        }
        System.out.println(name);
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.println("_________");
        if(this.isResult)return;
        for(Map.Entry<Object, Node> entry : children.entrySet()){
            for(int i = 0; i < indent; i++){
                System.out.print("\t");
            }
            System.out.println("---" + String.valueOf(entry.getKey()));
            entry.getValue().printAll(indent+1);
        }
    }
}
