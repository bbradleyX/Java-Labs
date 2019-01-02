import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.ArrayList;

import java.util.Scanner;



public class EmployeeListDriverr {
    public static void main(String[] args) {
        int finish= 1;

        boolean realFile=false;

        ArrayList<Employee> employeeList= new ArrayList<Employee>();

        while (finish==1) {

            System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");

            Scanner scan = new Scanner(System.in);

            String choice = scan.nextLine();

            String fileName= null;



            if (choice.equals("1")) {

                System.out.println("Add file");
                fileName=scan.nextLine();

                Scanner in= null;
                while(!realFile) {
                    try {

                        File choiceFile = new File(fileName);
                        in = new Scanner(choiceFile);
                        realFile= true;
                    } catch (FileNotFoundException e) {

                        System.out.println("File not found");
                        System.out.println("Add file");
                        fileName = scan.nextLine();
                        realFile= false;

                    }

                }

                while (in.hasNext()){

                    String employeeScan= in.nextLine();

                    if (employeeScan.equals("waged")){

                        String firstNameIn= in.nextLine();

                        String lastNameIn= in.nextLine();

                        String IDNumberIn= in.nextLine();

                        String streetIn= in.nextLine();

                        String cityIn= in.nextLine();

                        String stateIn= in.nextLine();

                        String phoneIn= in.nextLine();

                        double wageIn= in.nextDouble();

                        double hoursWorkedIn= in.nextDouble();

                        WagedEmployee EmployW= new WagedEmployee(firstNameIn, lastNameIn, IDNumberIn, streetIn, cityIn, stateIn, phoneIn, wageIn, hoursWorkedIn);

                        employeeList.add(EmployW);





                    }

                    else if (employeeScan.equals("salaried")){

                        String firstNameIn= in.nextLine();

                        String lastNameIn= in.nextLine();

                        String IDNumberIn=in.nextLine();

                        String streetIn=in.nextLine();

                        String cityIn=in.nextLine();

                        String stateIn= in.nextLine();

                        String phoneIn=in.nextLine();

                        double salaryIn= in.nextDouble();

                        SalariedEmployee employS= new SalariedEmployee(firstNameIn, lastNameIn, IDNumberIn, streetIn, cityIn, stateIn, phoneIn, salaryIn);

                        employeeList.add(employS);



                    }

                    if (employeeScan.equals("commissioned")){

                        String firstNameIn= in.nextLine();

                        String lastNameIn=in.nextLine();

                        String IDNumberIn=in.nextLine();

                        String streetIn=in.nextLine();

                        String cityIn=in.nextLine();

                        String stateIn=in.nextLine();

                        String phoneIn=in.nextLine();

                        double commissionIn=in.nextDouble();

                        double salesIn=in.nextDouble();

                        CommissionedEmployee employC= new CommissionedEmployee(firstNameIn, lastNameIn,IDNumberIn, streetIn, cityIn, stateIn, phoneIn, commissionIn,salesIn);

                        employeeList.add(employC);
                    }

                }

                System.out.println("Employee file added");

            }
            else if (choice.equals("2")) {

                for (int i=0; i<employeeList.size();i++){

                    employeeList.get(i).determineWeeklyPay();
                }

            }
            else if (choice.equals("3")) {

                if (employeeList.get(1).getWeeklyPay()==0){
                    System.out.println("Weekly Pay has not been determined");

                }
                else{

                    for(int i=0; i< employeeList.size(); i++){

                        System.out.println(employeeList.get(i).getFirstName());

                        System.out.println(employeeList.get(i).getLastName());

                        System.out.println(employeeList.get(i).getWeeklyPay());
                    }
                }
            }
            else if (choice.equals("4")) {
                for (int i = 0; i < employeeList.size(); i++) {
                    Scanner eType= new Scanner(System.in);
                    int removeemp= eType.nextInt();
                    employeeList.remove(removeemp);
                    //Employee temp = employeeList.get(i);
                    System.out.println("Which employee type");
                    if (removeemp==1) {
                        employeeList.remove(1);
                        System.out.println("Salaried employee removed");
                    } else if (removeemp==0) {
                        employeeList.remove(0);
                        System.out.println("Waged employee removed");
                    } else if (removeemp==2) {
                        employeeList.remove(2);
                        System.out.println("Commissioned employee removed");
                    }
                }
            }
            else if (choice.equals("5")) {

                Scanner scanFile=new Scanner(System.in);
                System.out.println("Enter new file name:");
                fileName=scanFile.next();

                try {

                    PrintWriter out= new PrintWriter(fileName);

                    File choiceFile = new File(fileName);

                    Scanner sc = new Scanner(choiceFile);

                    realFile= true;

                    for(int i=0; i< employeeList.size(); i++){

                        out.println(employeeList.get(i).getFirstName());

                        out.println(employeeList.get(i).getLastName());

                        out.println(employeeList.get(i).getWeeklyPay());

                        out.println(employeeList.get(i).getIDNumber());

                        out.println(employeeList.get(i).getStreet());

                        out.println(employeeList.get(i).getCity());

                        out.println(employeeList.get(i).getState());

                        out.println(employeeList.get(i).getPhone());
                    }
                    out.close();
                } catch (FileNotFoundException d) {
                    System.out.println("Error with file name");
                    realFile= false;

                }
            }
            else if (choice.equals("6")) {
                finish=0;
                System.out.println("Quit Program");
            }
            else {

                System.out.println("invalid choice!");
            }
        }
    }
}

