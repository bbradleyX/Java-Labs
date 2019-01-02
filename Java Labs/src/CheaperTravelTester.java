public class CheaperTravelTester {
    public static void main(String[] args) {
        //Test for car is cheaper
        System.out.println("Test 1: If car is cheaper");
        CheaperTravel test1=new CheaperTravel(50,25,2,.05,7);
        test1.carCost();
        test1.travelOption(test1.carCost());
        if(test1.carCost()<0){
            System.out.println("CarCost function failed test, a property is equal to 0");
        }else{
            System.out.println("CarCost function works properly");
        }if(test1.travelOption(test1.carCost())==false){
            System.out.println("TravelOption function failed test, a property is equal to 0");
        }else{
            System.out.println("TravelOption function works properly");
        }

        //Test for train is cheaper
        System.out.println("\n Test 2: If train is cheaper");
        CheaperTravel test2=new CheaperTravel(50,25,4,.05,7);
        test2.carCost();
        test2.travelOption(test1.carCost());
        if(test2.carCost()<0){
            System.out.println("CarCost function failed test, a property is equal to 0");
        }else{
            System.out.println("CarCost function works properly");
        }if(test2.travelOption(test1.carCost())==false){
            System.out.println("TravelOption function failed test, a property is equal to 0");
        }else{
            System.out.println("TravelOption function works properly");
        }

        //Test for car equals train
        System.out.println("\n Test 3: If car and train equal");
        CheaperTravel test3=new CheaperTravel(50,25,2,.05,6.5);
        test3.carCost();
        test3.travelOption(test1.carCost());

        if(test2.carCost()<0){
            System.out.println("CarCost function failed test, a property is equal to 0");
        }else{
            System.out.println("CarCost function works properly");
        }if(test3.travelOption(test1.carCost())==false){
            System.out.println("TravelOption function failed test, a property is equal to 0");
        }else{
            System.out.println("TravelOption function works properly");
        }

        //Test for property(ies) equal 0
        System.out.println("\n Test 4: Property values are less than or equal to 0");
        CheaperTravel test4=new CheaperTravel(0,25,4,.05,7);
        test4.carCost();
        test4.travelOption(test1.carCost());
        if(test4.carCost()<0){
            System.out.println("CarCost function failed test, a property is equal to 0");
        }else{
            System.out.println("CarCost function works properly");
        }if(test4.travelOption(test1.carCost())==false){
            System.out.println("TravelOption function failed test, a property is equal to 0");
        }else{
            System.out.println("TravelOption function works properly");
        }
    }
}
