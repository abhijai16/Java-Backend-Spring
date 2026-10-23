package in.example.main;

// GOAL
// Autowiring concept to inject dependency automatically  (Annotation Based).

import in.example.beans.Student;
import in.example.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std = (Student) context.getBean(Student.class);

        std.display();
    }
}
