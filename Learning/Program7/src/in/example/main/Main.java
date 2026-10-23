package in.example.main;

// GOAL
// How to inject dependency using setter method in java config.

import in.example.beans.Student;
import in.example.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean(Student.class);

        std.display();
    }
}
