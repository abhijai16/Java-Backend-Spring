package in.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int rollNo;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll : " + this.rollNo);
        System.out.println("Address : " + this.address);
    }
}
