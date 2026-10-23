package in.example.beans;

public class Student {
    private String name;
    private int rollNo;
    private Address address;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll : " + this.rollNo);
        System.out.println("Address : " + this.address);
    }
}
