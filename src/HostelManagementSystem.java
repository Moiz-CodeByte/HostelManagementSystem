import java.util.Scanner;
public class HostelManagementSystem {

    Student student = new Student();
    Employee employee = new Employee();
    Expenditure expenditure = new Expenditure();

    Scanner sc = new Scanner(System.in);

    public void login() {

        System.out.println("\t\t\t\t\t\t\t\t\t\tEnter your Username.");
        String inputUsername = sc.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\tEnter your Password");
        String inputPassword = sc.next();
        if (inputUsername.equals("admin") && inputPassword.equals("admin")) {
            System.out.println("login successfully");
        } else {
            System.out.println( "Invalid username and password");
            login();
        }
    }

    public void mainmenu() {
        boolean start = true;
        while (start) {
            //System.out.println("\t\t\t\t\t\t\t\t\t\tWelcome to Hostel Management System");
            System.out.println("  Please Select one of the following options.  \n ");
            System.out.println("1. Hostelites Management. ");
            System.out.println("2. Employees Management.");
            System.out.println("3. Expenditure");
            System.out.println("4. Back to login");
            System.out.println("5. Exit \n");
            System.out.print("Enter your Choice..");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hostlitemenu();
                    //System.out.println("in first option");
                    break;
                case 2:
                    Employeemenu();
                    break;
                case 3:
                    Expendituremenu();
                    break;
                case 4:
                    login();
                    break;
                case 5:
                    start = false;
                    System.out.println("Existing the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

    public void hostlitemenu() {
        boolean start = true;
        while (start) {
            System.out.println("  Please Select one of the following options.  \n ");
            System.out.println("1. Add a new student.");
            System.out.println("2. Remove a student.");
            System.out.println("3. Update Student Details");
            System.out.println("4. Search student.");
            System.out.println("5. Display all students.");
            System.out.println("6. Back to main menu \n");

            System.out.print("Enter your Choice..");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    student.addstudent();
                    break;
                case 2:
                    student.deleteStudent();
                    break;
                case 3:
                    student.updateStudent();
                    break;
                case 4:
                    student.searchStudent();
                    break;
                case 5:
                    student.display();
                    break;
                case 6:
                    mainmenu();
                    start = false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

    public void Employeemenu() {
        boolean start = true;
        while (start) {
            System.out.println("  Please Select one of the following options.  \n ");
            System.out.println("1. Add a new Employee.");
            System.out.println("2. Remove a Employee.");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Display all Employees.");
            System.out.println("5. Back to main menu \n");

            System.out.print("Enter your Choice..");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    employee.addEmployee();
                    break;
                case 2:
                    employee.deleteEmployee();
                    break;
                case 3:
                    employee.updateEmploye();
                    break;
                case 4:
                    employee.display();
                    break;
                case 5:
                    mainmenu();
                    start = false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }
    }


    public void Expendituremenu() {
        boolean start = true;
        while (start) {
            System.out.println("  Please Select one of the following options.  \n ");
            System.out.println("1. Add Expense.");
            System.out.println("2. Display all Expenses.");
            System.out.println("3. Back to main menu \n");

            System.out.print("Enter your Choice..");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    expenditure.addExpense();
                    break;
                case 2:
                    expenditure.DisplayExpenses();
                    break;
                case 3:
                    mainmenu();
                    start = false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}