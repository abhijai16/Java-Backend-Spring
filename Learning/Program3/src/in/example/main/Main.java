package in.example.main;
// GOAL:
// Configuration using annotations in xml file.
// use of @Component and @Value.

import in.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main() {

        String path = "/in/example/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        Student std = (Student) context.getBean("student");
        std.display();

    }

}
