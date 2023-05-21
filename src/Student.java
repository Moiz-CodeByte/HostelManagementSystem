import java.util.Scanner;
public class Student extends Person {
    protected int RoomNo;
    private double Rent;
    int Studentcount;
    Student[] studentsList = new Student[100];

    Scanner sc = new Scanner(System.in);
    public Student(){
        super();
        RoomNo = 0;
        Rent  = 0;
        Studentcount = 0;
        //System.out.println("constructor of student");
    }
    public Student(String name, long ID, long PhoneNO, long JoiningDate, String Address, int RoomNO , double Rent) {
        super(name, ID, PhoneNO, JoiningDate, Address);
        setRoomNo(RoomNO);
        setRent(Rent);
    }
     public void setRoomNo(int RoomNo){
        this.RoomNo=RoomNo;
     }
     public int getRoomNo(){
    return RoomNo;
    }

    public void setRent(double Rent) {
        this.Rent = Rent;
    }
    public double getRent(){
        return Rent;
    }

    public  void addstudent() {

        System.out.println("Enter Name [String type 'Two words' allowed] :");
        String name = sc.nextLine();

        System.out.println("Enter Address [String type  'line' allowed] :");
        String Address = sc.nextLine();


        System.out.println("Enter CNIC ID [long type 13 numbers allowed] :");
        long ID = sc.nextLong();

        System.out.println("Enter Phone Number [long type 11 numbers allowed] :");
        long PhoneNo = sc.nextLong();

        System.out.println("Enter Joining date, format [DDMMYYYY]:");
        long JoiningDate = sc.nextLong();

        System.out.println("Enter room number [int type]");
        int RoomNO = sc.nextInt();
        System.out.println("Enter rent  [double type] ");
         double Rent= sc.nextDouble();
        sc.nextLine();

        Student student = new Student(name, ID,PhoneNo,JoiningDate, Address, RoomNO, Rent);
        studentsList[Studentcount] = student;
        Studentcount++;

        System.out.println("Student added successfully.\n");
    }

    public void deleteStudent() {
        System.out.println("Enter the CNIC ID number of the student to remove:");
        long ID = sc.nextLong();
        for (int i = 0; i < Studentcount; i++) {
            if (studentsList[i].getID() == ID) {
                System.out.println("Student deleted successfully:");
                System.out.println(studentsList[i].getname() + " with ID " + studentsList[i].getID()
                        + " from room number " + studentsList[i].getRoomNo()
                        +"With joining date "+ studentsList[i].getJoiningDate() +
                        ", Phone Number : " + studentsList[i].getPhoneNo()+
                        ", Address : " + studentsList[i].getAddress()+
                        ", Rent: "+ studentsList[i].getRent());
                // Move all students after the deleted student up one index in the array
                for (int j = i; j < Studentcount - 1; j++) {
                    studentsList[j] = studentsList[j + 1];
                }
                // Set the last index in the array to null and decrement the student count
                studentsList[Studentcount - 1] = null;
                Studentcount--;
                return; // exit the method after deleting the first matching student
            }
        }
        System.out.println("No student found with CNIC ID number " + ID);
    }


    public void updateStudent() {
        System.out.println("Enter the CNIC ID number of the student to update:");
        long ID = sc.nextLong();
        for (int i = 0; i < Studentcount; i++) {
            if (studentsList[i].getID() == ID) {

                System.out.println("Enter new room number for " + studentsList[i].getname() + ":");
                int newRoomNumber = sc.nextInt();
                studentsList[i].setRoomNo(newRoomNumber);

                System.out.println("Enter new Phone Number for " + studentsList[i].getname() + ":");
                long newPhoneNo = sc.nextLong();
                studentsList[i].setPhoneNo(newPhoneNo);

                System.out.println("Enter new Rent for " + studentsList[i].getname() + ":");
                double Rent  = sc.nextDouble();
                studentsList[i].setRent(Rent);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("No student found with CNIC ID number " + ID);
    }

    public void searchStudent() {
        System.out.println("Enter the CNIC ID of the student to search for:");
        long ID = sc.nextLong();
        for (int i = 0; i < Studentcount; i++) {
            if (studentsList[i].getID() == ID) {
                System.out.println("Student found! Name: " + studentsList[i].getname()+
                ", ID  : " + studentsList[i].getID() +
                        ", Phone Number : " + studentsList[i].getPhoneNo()+
                        ", Address : " + studentsList[i].getAddress()+
                        ", Room Number: " + studentsList[i].getRoomNo() + ", Rent: "+ studentsList[i].getRent()
                        +" Joining date: "+studentsList[i].getJoiningDate());
                return;
            }
        }
        System.out.println("No student found with the ID " + ID);
    }


         @Override
    public void display() {
        if (Studentcount == 0) {
            System.out.println("No students found \n" );
            return;
        }
        System.out.println("List of all students:\n");
        for (int i = 0; i < Studentcount; i++) {
            System.out.println((i+1)+". Name: " + studentsList[i].getname()+
                    ", ID  : " + studentsList[i].getID() +
                            ", Phone Number : " + studentsList[i].getPhoneNo()+
                            ", Address : " + studentsList[i].getAddress()+
                    ", Room Number: " + studentsList[i].getRoomNo() + ", Rent: "+ studentsList[i].getRent()
                    +", joining date: "+studentsList[i].getJoiningDate() +"\n");
        }
}

}
