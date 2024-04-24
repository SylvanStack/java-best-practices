package com.yuanstack.apollo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({Config1.class})
public class Config2 {

     @Bean
     public Config3 cc() {
         return new Config3();
     }

}
