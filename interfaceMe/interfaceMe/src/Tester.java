public class Tester {
    public static void main(String[] args) {
        Fish goldfish=new Fish("freshwater");
        System.out.println("\nFish lives in :"+goldfish.getWater());
        System.out.println("Moves: "+goldfish.move());
        System.out.println("Says: "+goldfish.vocalize());
        System.out.println("Eat: "+goldfish.consume("smaller fish"));

        Dog molly=new Dog("Molly");
        System.out.println("\nDog named :"+molly.getName());
        System.out.println("Moves: "+molly.move());
        System.out.println("Says: "+molly.vocalize());
        System.out.println("Eat: "+molly.consume("smaller fish"));

        Zombie jeff=new Zombie("bloody and rotted");
        System.out.println("\nZombie :"+jeff.getGore());
        System.out.println("Moves: "+jeff.move());
        System.out.println("Says: "+jeff.vocalize());
        System.out.println("Eat: "+jeff.consume("brains"));
    }
}
