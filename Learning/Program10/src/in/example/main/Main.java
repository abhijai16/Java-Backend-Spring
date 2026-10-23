package in.example.main;

// GOAL
// Autowiring but what if there is more than 1 bean object.  i.e UnsatisfiedDependencyInjection error.
// Use of @Qualifier("Bean name")
// Annotation based.

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
