package in.example.main;

//Goal - how to configure spring container with xml.

import in.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main() {

        String location = "/in/example/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location); //this starts the spring container.

        //how to get the object
        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}
