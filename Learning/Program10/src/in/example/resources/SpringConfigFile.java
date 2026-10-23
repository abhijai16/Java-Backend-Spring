package in.example.resources;

import in.example.beans.Address;
import in.example.beans.Student;
import in.example.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddressObj(){
        Address addr = new Address();

        addr.setPincode(829112);
        addr.setHouseNo(33);
        addr.setCity("Bokaro");

        return addr;
    }

    @Bean
    public Subjects createSubjectObj(){
        Subjects sub = new Subjects();

        List<String> subjectList = new ArrayList<String>();
        subjectList.add("English");
        subjectList.add("Math");
        subjectList.add("Science");
        sub.setSubjects(subjectList);

        return sub;
    }

    @Bean
    public Student createStudentObj(){
        Student std = new Student();

        std.setName("Abhijai");
        std.setRollNo(3);

        return std;
    }
}
