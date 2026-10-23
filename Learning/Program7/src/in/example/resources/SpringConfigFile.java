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
        addr.setCity("Bokaro");
        addr.setHouseNo(33);
        addr.setPincode(829112);

        return addr;
    }

    @Bean
    public Student createStudentObj(){
        Student std = new Student();
        std.setRollNo(3);
        std.setName("Abhijai");
        std.setAddress(createAddressObj());

        return std;
    }
}
