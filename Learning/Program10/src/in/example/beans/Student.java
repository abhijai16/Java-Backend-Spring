package in.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int rollNo;
    @Autowired
    private Address address; //no need of setter or getter.
    @Autowired
    private Subjects subjects; //no need of setter or getter.

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }



    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll : " + this.rollNo);
        System.out.println("Address : " + this.address);
        System.out.printf("Subject : " + this.subjects);
    }
}
