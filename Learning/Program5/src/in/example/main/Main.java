package in.example.main;

// GOAL:
// How to inject dependency using setter method in xml config.

import in.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main() {

        String location = "/in/example/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);

        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}
