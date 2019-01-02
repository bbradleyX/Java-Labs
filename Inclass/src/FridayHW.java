import java.util.ArrayList;
    public class FridayHW {
        public static double total(ArrayList<Item> itemsIn){
            double out=0;
            for (int i=0;i<itemsIn.size();i++){
                out+=itemsIn.get(i).getValue();
            }
            return out;
        }
        public static void main(String[] args) {
            ArrayList <Item> items=new ArrayList<Item>();
            Item temp=new Item("pencil",.8);
            items.add(temp);
            temp=new Item("pen",.5);
            items.add(temp);
            double out=total(items);
            System.out.println(out);
        }
    }
