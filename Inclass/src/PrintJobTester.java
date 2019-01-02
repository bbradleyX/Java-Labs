import java.util.ArrayList;

public class PrintJobTester {
    public static void main(String[] args) {
        PrintJob test1=new PrintJob("greyscale","matte","single",1);
        test1.determineCostPerPage();
        test1.determineTotalCost();
        if (.15 != test1.getCostPerPage() || .15 !=test1.getTotalCost()){
            System.out.println("Failed test greyscale matte single 1");
        }

        PrintJob test2=new PrintJob("greyscale","matte","single",2);
        test2.determineCostPerPage();
        test2.determineTotalCost();
        if (.15 != test2.getCostPerPage() || .3 !=test2.getTotalCost()){
            System.out.println("Failed test greyscale matte single 2");
        }

        PrintJob test3=new PrintJob("greyscale","matte","double",2);
        test3.determineCostPerPage();
        test3.determineTotalCost();
        if (.25 != test3.getCostPerPage() || .5 !=test3.getTotalCost()){
            System.out.println("Failed test greyscale matte double 2");
        }

        PrintJob test4=new PrintJob("greyscale","glossy","single",2);
        test4.determineCostPerPage();
        test4.determineTotalCost();
        if (.2 != test4.getCostPerPage() || .4 !=test4.getTotalCost()){
            System.out.println("Failed test greyscale glossy single 2");
        }

        PrintJob test5=new PrintJob("P1","matte","single",2);
        test5.determineCostPerPage();
        test5.determineTotalCost();
        if (.35 != test5.getCostPerPage() || .7 !=test5.getTotalCost()){
            System.out.println("Failed test P1 matte single 2");
        }

        PrintJob test6=new PrintJob("P2","matte","single",2);
        test6.determineCostPerPage();
        test6.determineTotalCost();
        if (.5 != test6.getCostPerPage() || 1.0 !=test6.getTotalCost()){
            System.out.println("Failed test P2 matte single 2");
        }

        PrintJob test7=new PrintJob("P3","matte","single",2);
        test7.determineCostPerPage();
        test7.determineTotalCost();
        if (.7 != test7.getCostPerPage() || 1.4 !=test7.getTotalCost()){
            System.out.println("Failed test P3 matte single 2");
        }
        ArrayList <Double> costPerPage=new ArrayList<>();
        costPerPage.add(.15);
        costPerPage.add(.15);
        costPerPage.add(.25);

        ArrayList <Double> totalCost=new ArrayList<>();
        totalCost.add(.15);
        totalCost.add(.3);
        totalCost.add(.3);

        ArrayList <PrintJob> tests=new ArrayList<>();
        tests.add(test1);

        boolean passedTest=true;
//        for(int i=0;i<totalCost.size();i++){
//            tests.get(i).determineCostPerPage();
//            tests.get(i).determineTotalCost();
//            if(costPerPage.get(i)==tests.get(i)){
//                System.out.println("Failed test: " +i);
//                passedTest=false;
//            }
        }
    }

        /*
        HOW TO MAKE LISTS IN TESTS:
        1) Make list of objects as test cases
        2) Make lists for expected values for and from each method
        3) For loops to check if expected method values matches each test case (object)


        PrintJob <Integer> myList=new PrintJob <Integer>(paperTypeIn);
    }
    for (int x=0;x<myList.size();x++){
        if(myList.get(x)>max){
            max=myList.get(x);
        }
    }
}
*/