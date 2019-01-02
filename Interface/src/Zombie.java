public class Zombie implements Animal {
    private String sick;
    private String name;

    public Zombie(String diseaseIn) {
        this.sick = diseaseIn;
    }

    public String move() {
        return "sluggish";
    }

    public String vocalize() {
        return "mehhhhhhh";
    }

    public String getDisease() {
        return this.sick;
    }

    public String consume(String food) {
        return food;
    }

    public String getName(String word) {
        return word;
    }
}
