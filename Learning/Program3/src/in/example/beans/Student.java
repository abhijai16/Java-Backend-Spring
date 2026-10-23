package in.example.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Abhijai")
    private String name;
    @Value("3")
    private int rollNo;
    @Value("abhijaijaiss@gmai.com")
    private String email;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Email : " + this.email);
    }
}
