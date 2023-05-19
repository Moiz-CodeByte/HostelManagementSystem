public abstract class  Person {
    private String name;
    private long ID;
    private long phoneNo;
    private long JoiningDate;
    private String Address;
    public Person(){
        name = null;
        ID = 0;
        phoneNo = 0;
        JoiningDate = 0;
        Address = null;
    }
    public Person(String name , long ID, long PhoneNO, long JoiningDte, String Address ){
        setname(name);
        setID(ID);
        setPhoneNo(PhoneNO);
        setJoiningDate(JoiningDte);
        setAddress(Address);
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public long getID() {
        return ID;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setJoiningDate(long JoiningDate) {
        this.JoiningDate=JoiningDate;
    }
    public long getJoiningDate() {
        return JoiningDate;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getAddress() {
        return Address;
    }
    public abstract void display();



}
