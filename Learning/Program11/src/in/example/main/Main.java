package in.example.main;

// GOAL
// Autowiring concept to inject dependency automatically  (Annotation Based).
// using attribute autowire="mode".
// Mode = 1. byName = the name of the bean should be same as the name of the property to be injected.
//        2. byType = database type should be same for autowiring.
//        3. constructor = we will have to use constructor DI, needed to provide index for the constructor parameters.

import in.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main() {

        String location = "/in/example/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);

        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}
