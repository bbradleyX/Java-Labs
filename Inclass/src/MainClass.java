import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Computer Science");
        strList.add("Philosophy");
        strList.add("Economics");
        strList.add("Religion");
        for (int n =0; n<strList.size(); n++){
            String word = strList.get(n);
            System.out.print(word + " ");
        }
        System.out.println();
        String newCourse = strList.get(1) + "/" + strList.get(3);
        strList.remove(1);
        strList.remove(2);
        for (int n =0; n<strList.size(); n++){
            String word = strList.get(n);
            System.out.print(word + " ");
        }
        System.out.println();
        strList.add(newCourse);
        for (int n =0; n<strList.size(); n++){
            String word = strList.get(n);
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
