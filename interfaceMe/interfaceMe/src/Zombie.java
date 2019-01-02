public class Zombie implements Animal {
    private String gore;

    public Zombie(String goreIn){
        this.gore=goreIn;
    }
    public String getGore(){
        return this.gore;
    }
    public String move(){
        return "shamble";
    }
    public String vocalize(){
        return "COOOOFFFFFFFEEEEEEEE, COOOOOOOFFFFFFEEEEEEEE";
    }
    public String consume(String consumed){
        return "consume "+consumed;
    }
}
