package in.example.resources;

import in.example.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Student stdId(){
        Student std = new Student();

        std.setName("Abhijai");
        std.setRollNo(3);
        std.setEmail("abhijaijaiss@gmail.com");

        return std;
    }
}
