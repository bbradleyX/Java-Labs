public class mainClass {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass(true);
        obj.addToList(false);
        obj.addToList(true);
        obj.determineTruth();
        boolean result = obj.getTrueOrFalse();
        System.out.println("The value is " + result);
    }
}
