public class Fish implements Animal {
    private String water;

    public Fish(String waterIn){
        this.water=waterIn;
    }

    public String move(){
        return "swim";
    }
    public String vocalize(){
        return "Glub, Glub";
    }
    public String consume(String consumed){
        return "swallow "+consumed;
    }
    public String getWater(){
        return this.water;
    }
}
