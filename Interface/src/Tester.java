public class Tester {
    public static void main(String[] args) {
        Fish goldfish=new Fish("freshwater");
        System.out.println("\nFish lives in: "+goldfish.getWater());
        System.out.println("Moves: "+goldfish.move());
        System.out.println("Says: "+goldfish.vocalize());
        System.out.println("Eats: "+goldfish.consume("smaller fish"));

        Dog molly=new Dog("Molly");
        System.out.println("\nFish lives in: "+molly.getName);
        System.out.println("Moves: "+molly.move());
        System.out.println("Says: "+molly.vocalize());
        System.out.println("Eats: "+molly.consume("smaller fish"));

        Zombie undead=new Zombie("Zombitius");
        System.out.println("\nFish lives in: "+undead.getName);
        System.out.println("Moves: "+undead.move());
        System.out.println("Says: "+undead.vocalize());
        System.out.println("Eats: "+undead.consume("smaller fish"));
    }
}
