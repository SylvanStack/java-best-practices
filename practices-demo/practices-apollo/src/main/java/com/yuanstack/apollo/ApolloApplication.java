package com.yuanstack.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.yuanstack.apollo.listener.ApolloChangedListener;
import com.yuanstack.apollo.model.Demo;
import com.yuanstack.apollo2.Config1;
import com.yuanstack.apollo2.Config2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.properties.ConfigurationPropertiesRebinder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@EnableApolloConfig
@Import({Config2.class}) //OK
//@ConfigurationPropertiesScan({"com.yuanstack.apollo","com.yuanstack.apollo2"}) //OK
//@EnableConfigurationProperties(Config1.class) //OK
@SpringBootApplication
public class ApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class, args);
    }

    @Bean
    ApolloChangedListener listener() {
        return new ApolloChangedListener();
    }

    @Resource
    Demo demo;
    @Resource
    Config1 conf;
    @Resource
    Environment environment;

    @Bean
    ApplicationRunner applicationRunner(@Autowired ApplicationContext context) {
        return x -> {
            System.out.println(demo.getA());
            System.out.println(conf);

            String pa = environment.getProperty("p.a");
            System.out.println(pa);

            //ConfigurationPropertiesRebinder rebinder = context.getBean(ConfigurationPropertiesRebinder.class);
            //System.out.println(rebinder);
        };
    }
}
