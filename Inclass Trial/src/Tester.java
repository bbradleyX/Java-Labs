public class Tester {
    public static void main(String[] args) {
        Item item01 = new Item("Tee Shirt", 15);
        item01.sellItem(4);
        int numberInStock = item01.getNumberInStock();

        Item item02 = new Item("sweat pants", 7);
        boolean reorder = item02.needReorder();
        if (reorder)
            item02.reStock(5);

        item01.sellItem(1);
    }
}
