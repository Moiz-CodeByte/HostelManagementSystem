import java.util.Scanner;
public class Employee extends Person {
    private double salary;
    private String Role;
    int Employeecount;
    Employee[] EmployeeList = new Employee[20];
    Scanner sc = new Scanner(System.in);
    public Employee(){
        super();
        salary = 0;
        Role = null;
        //System.out.println("constructor of Employee");
    }
    public Employee(String name, long ID, long PhoneNO,long JoiningDate, String Address, double Salary , String Role) {
        super(name, ID, PhoneNO, JoiningDate ,Address);
        setSalary(Salary);
        setRole(Role);
        //System.out.println("Parameter constructor of employee");
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setRole(String Role){
        this.Role= Role;
    }
    public String getRole() {
        return Role;
    }
    public  void addEmployee() {

        System.out.println("Enter Name [String type 'Two words' allowed] :");
        String name = sc.nextLine();

        System.out.println("Enter Address  [String type  'line' allowed] :");
        String Address = sc.nextLine();

        System.out.println("Enter Role [string type 'word' allowed] :");
        String Role = sc.nextLine();

        System.out.println("Enter Joining date  Format [DDMMYYYY] :");
        long JoiningDate = sc.nextLong();

        System.out.println("Enter CNIC ID [long type 13 numbers allowed] :");
        long ID = sc.nextLong();

        System.out.println("Enter Phone Number [long type 11 numbers allowed] :");
        long PhoneNo = sc.nextLong();

        System.out.println("Enter Salary [double type] ");
        double Salary = sc.nextDouble();

        sc.nextLine(); // To create empty new line

        Employee employee = new Employee(name, ID,PhoneNo,JoiningDate, Address,Salary , Role);
        EmployeeList[Employeecount] = employee ;
        Employeecount++;

        System.out.println("Emloyee added successfully.\n");
    }

    public void deleteEmployee() {
        System.out.println("Enter the CNIC ID number of the Employee to remove:");
       long ID = sc.nextLong();
        for (int i = 0; i < Employeecount; i++) {
            if (EmployeeList[i].getID() == ID) {
                System.out.println("Employee deleted successfully:");
                System.out.println(EmployeeList[i].getname() + " with ID " + EmployeeList[i].getID()
                        +"With joining date " + EmployeeList[i].getJoiningDate()
                        + ", Phone Number  : " + EmployeeList[i].getPhoneNo()+
                        ", Address  : " + EmployeeList[i].getAddress()+
                        ", Salary " + EmployeeList[i].getSalary() +
                        ", Role, : "+ EmployeeList[i].getRole()  );
                // Move all employee after the deleted employee up one index in the array
                for (int j = i; j < Employeecount - 1; j++) {
                    EmployeeList[j] = EmployeeList[j + 1];
                }
                EmployeeList[Employeecount - 1] = null;
                Employeecount--;
                return;
            }
        }
        System.out.println("No Employee found with CNIC ID number " + ID+"\n");
    }

    public void updateEmploye() {
        System.out.println("Enter the CNIC ID number of the Employee to update:");
         long ID = sc.nextLong();
        for (int i = 0; i < Employeecount; i++) {
            if (EmployeeList[i].getID() == ID) {
                System.out.println("Enter new Role for " + EmployeeList[i].getname() + ":");
                String newRole  = sc.nextLine();
                EmployeeList[i].setRole(newRole);

                System.out.println("Enter new Salary for " + EmployeeList[i].getname() + ":");
                double newSalary = sc.nextDouble();
                EmployeeList[i].setSalary(newSalary);

                System.out.println("Enter new Phone Number for " + EmployeeList[i].getname() + ":");
                long newPhoneNo = sc.nextLong();
                EmployeeList[i].setPhoneNo(newPhoneNo);


                System.out.println("Employee information updated successfully.");
                return;
            }
        }
        System.out.println("No Employee found with CNIC ID number " + ID);
    }


    @Override
    public void display() {
        if (Employeecount == 0) {
            System.out.println("No Employee found \n" );
            return;
        }
        System.out.println("List of all Employee:");
        for (int i = 0; i < Employeecount; i++) {
            System.out.println((i+1)+".Name: " + EmployeeList[i].getname()+
                    ", ID  : " + EmployeeList[i].getID() + ", Phone Number  : " + EmployeeList[i].getPhoneNo()+
                    ", Address  : " + EmployeeList[i].getAddress()+
                    ", Salary " + EmployeeList[i].getSalary() + ", Role"+ EmployeeList[i].getRole() +
                    ", Joining date "+EmployeeList[i].getJoiningDate()+ "\n");
        }
    }

}
