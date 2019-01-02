import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class EmployeeListDriver {
    public static void main(String[] args) {
        File fileIn = null;
        Scanner in = new Scanner(System.in);
        boolean realFile = false;
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");
        String choice = in.nextLine();
        while (!choice.equals("6")) {
            if (choice.equals("1")) {
                System.out.println("Add file");
                String input = in.nextLine();
                while (!realFile) {
                    try {
                        //fileIn = new File("src/" + input);
                        fileIn = new File("Files/"+input);
                        in = new Scanner(fileIn);
                        realFile=true;
                    } catch (FileNotFoundException e) {
                        //System.out.println(e);
                        System.out.println("File not found");
                        System.out.println("Add file");
                        input = in.nextLine();
                    }
                    while(in.hasNext()){
                        String employeeScan = in.nextLine();
                        if (employeeScan.equals("waged")) {
                            String firstNameIn = employeeScan;
                            String lastNameIn = employeeScan;
                            String idIn = employeeScan;
                            String streetIn = employeeScan;
                            String cityIn = employeeScan;
                            String stateIn = employeeScan;
                            String phoneIn = employeeScan;
                            double wageIn = in.nextDouble();
                            double hoursWorkedIn = in.nextDouble();
                            employeeList.add(new WagedEmployee(firstNameIn, lastNameIn, idIn, streetIn, cityIn, stateIn, phoneIn, wageIn, hoursWorkedIn));
                        }

                        else if (employeeScan.equals("salaried")) {
                            String firstNameIn = employeeScan;
                            String lastNameIn = employeeScan;
                            String idIn = employeeScan;
                            String streetIn = employeeScan;
                            String cityIn = employeeScan;
                            String stateIn = employeeScan;
                            String phoneIn = employeeScan;
                            double salaryIn = in.nextDouble();
                            employeeList.add(new SalariedEmployee(firstNameIn, lastNameIn, idIn, streetIn, cityIn, stateIn, phoneIn, salaryIn));
                        }
                        else if (employeeScan.equals("commissioned")) {
                            String firstNameIn = employeeScan;
                            String lastNameIn = employeeScan;
                            String idIn = employeeScan;
                            String streetIn = employeeScan;
                            String cityIn = employeeScan;
                            String stateIn = employeeScan;
                            String phoneIn = employeeScan;
                            double commissionIn = in.nextDouble();
                            double salesIn = in.nextDouble();
                            employeeList.add(new CommissionedEmployee(firstNameIn, lastNameIn, idIn, streetIn, cityIn, stateIn, phoneIn, commissionIn, salesIn));
                        }
                        in.close();
                    }
                }
                System.out.println("Employee file added");
                System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");
                choice = in.nextLine();
            }
            if (choice.equals("2")) {
                for (int i = 0; i < employeeList.size(); i++) {
                    Employee temp = employeeList.get(i);
                    temp.getWeeklyPay();
                }
            } else if (choice.equals("3")) {
                for (int i = 0; i < employeeList.size(); i++) {
                    if(employeeList.get(i).getWeeklyPay()==0){
                        System.out.println("Weekly Pay has not been determined");
                    }
                    else {
                        System.out.println(employeeList.get(i).getFirstName());
                        System.out.println(employeeList.get(i).getLastName());
                        System.out.println(employeeList.get(i).getWeeklyPay());
                    }
                    System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");
                    choice = in.nextLine();
                }

            } else if (choice.equals("4")) {
                for (int i = 0; i < employeeList.size(); i++) {
                    Employee temp = employeeList.get(i);
                    System.out.println("Which employee type");
                    String eType = in.next();
                    if (eType.equals("salaried")) {
                        employeeList.remove(1);
                        System.out.println("Salaried employee removed");
                    } else if (eType.equals("waged")) {
                        employeeList.remove(0);
                        System.out.println("Waged employee removed");
                    } else if (eType.equals("commissioned")) {
                        employeeList.remove(2);
                        System.out.println("Commissioned employee removed");
                    }
                }
                System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");
                choice = in.nextLine();

            }
            else if (choice.equals("5")) {
                Scanner scanFile=new Scanner(System.in);
                System.out.println("Enter new file name:");
                String fileName=scanFile.next();
                try {
                    PrintWriter out = new PrintWriter(fileName);
                    realFile = true;
                    for (int i = 0; i < employeeList.size(); i++) {
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
                    System.out.println("File saved");
                    System.out.println("Would you like to\n1.Add file\n2.Calculate weekly pay\n3.Print list\n4.Remove employee\n5.Save employee\n6.Quit");
                    choice = in.nextLine();
                }
                catch (FileNotFoundException d) {
                    System.out.println("Error with file name");
                    realFile= false;
                }

            }
        }
        if (choice.equals("6")) {
            System.out.println("Quit Program");
            //for (int i = 0; i < employeeList.size(); i++) {
                //Employee temp = employeeList.get(i);
            //}
        }
    }
}
