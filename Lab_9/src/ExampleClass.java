import java.util.ArrayList;
public class ExampleClass {
    private boolean trueOrFalse;
    private ArrayList<anotherClass> truthVals;
    public ExampleClass(boolean TorF){
        this.truthVals = new ArrayList<anotherClass>();
        this.trueOrFalse = TorF;
    }
    public void addToList(Boolean value){
        anotherClass valObj = new anotherClass(value);
        truthVals.add(valObj);
    }
    public void determineTruth(){
        for (int ndx = 0; ndx < truthVals.size(); ndx++){
            trueOrFalse = trueOrFalse && truthVals.get(ndx).getTruth();
        }
    }
    public boolean getTrueOrFalse(){
        return trueOrFalse;
    }
}
