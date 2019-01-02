import java.util.ArrayList;
public class tryArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer>();
        myList.add(4);
        myList.add(-4);
        myList.add(13);
        System.out.println(myList);
        Integer max= myList.get(0);
        for (int x=0;x<myList.size();x++){
            if(myList.get(x)>max){
                max=myList.get(x);
            }
        }
        System.out.println("Max value is " + max);
    }
}
