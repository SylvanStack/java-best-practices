package com.yuanstack.apollo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class Demo {

    @Value("${p.a}")
    String a;
}
