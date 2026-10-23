package in.example.main;

//Goal - how to configure spring container with Java.

import in.example.beans.Student;
import in.example.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean("stdId");

        std.display();
 
    }
}
