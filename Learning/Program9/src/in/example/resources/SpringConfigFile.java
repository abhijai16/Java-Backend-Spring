package in.example.resources;

import in.example.beans.Address;
import in.example.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Student createStudentObj(){
        Student std = new Student();

        std.setName("Abhijai");
        std.setRollNo(3);
//        std.setAddress(createAddressObj()); // Manually dependency injection.

        return std;
    }
}
