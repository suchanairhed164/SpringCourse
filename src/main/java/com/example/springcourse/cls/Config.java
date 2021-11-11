package com.example.springcourse.cls;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)

public class Config {
    @Bean
    public Address getAddress() {

        Address address = new Address("High Street", 1000);
        System.out.println(address.getStreet()+" "+address.getNumber());
        return address;
    }

    @Bean
    public int PrintMSG(){
        System.out.println("MO IKKAI");
        return 0;
    }
}
