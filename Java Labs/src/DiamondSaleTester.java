public class DiamondSaleTester {
    public static void main(String[] args) {
        //Test for D color
        System.out.println("Test 1: flawless fo for D color rating");
        DiamondSale test1 = new DiamondSale(1.5, "yes", "D");
        test1.basePrice();
        test1.finalPrice();
        if (test1.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test1.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly\n");
        }

        System.out.println("Test 1: flawed fo for D color rating");
        DiamondSale test2 = new DiamondSale(1.5, "no", "D");
        test2.basePrice();
        test2.finalPrice();
        if (test2.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test2.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly \n");
        }

        //Test for K color
        System.out.println("Test 2: flawless fo for K color rating");
        DiamondSale test3 = new DiamondSale(1.5, "yes", "K");
        test3.basePrice();
        test3.finalPrice();
        if (test3.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test3.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly\n");
        }
        System.out.println("Test 2: flawed fo for K color rating");
        DiamondSale test4 = new DiamondSale(1.5, "no", "K");
        test4.basePrice();
        test4.finalPrice();
        if (test4.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test4.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly\n");
        }

        //Test for T color
        System.out.println("Test 3: flawless fo for T color rating");
        DiamondSale test5 = new DiamondSale(1.5, "yes", "T");
        test5.basePrice();
        test5.finalPrice();
        if (test5.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test5.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly\n");
        }
        System.out.println("Test 3: flawed fo for T color rating");
        DiamondSale test6 = new DiamondSale(1.5, "no", "T");
        test6.basePrice();
        test6.finalPrice();
        if (test6.basePrice()<0) {
            System.out.println("Base Price method failed test");
        } else {
            System.out.println("Base Price method works properly");
        }
        if (test6.finalPrice()<0) {
            System.out.println("Final Price method failed test");
        } else {
            System.out.println("Final Price method works properly \n");
        }
    }
}
