public class Dog implements Animal{
    private String name;

    public Dog(String cutePetName){
        this.name=cutePetName;
    }

    public String move(){
        return "walk";
    }
    public String vocalize(){
        return "Woof, Woof";
    }
    public String consume(String consumed){
        return "chew "+consumed;
    }
    public String getName(){
        return this.name;
    }
}
