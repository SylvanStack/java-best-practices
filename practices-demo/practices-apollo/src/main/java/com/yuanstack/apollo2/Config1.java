package com.yuanstack.apollo2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Data
//@Configuration
@ConfigurationProperties(prefix = "p")
//@RefreshScope
public class Config1 {
    String a;
    String b;
    Map<String, String> c;
}
