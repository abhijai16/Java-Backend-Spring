package in.example.main;
// GOAL:
// Configuration using annotations in Java file.
// use of @Configuration, @ComponentScan, @Component and @Value.

import in.example.beans.Student;
import in.example.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean("student");
        std.display();

    }

}
