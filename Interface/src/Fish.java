public class Fish implements Animal {
    private String water;

    public Fish(String waterIn){
        this.water=waterIn;
    }

    public String move(){
        return "swim";
    }

    public String vocalize(){
        return"";
    }
    public String getWater(){
        return this.water;
    }
    public String consume(String food){
        return food;
    }
}
