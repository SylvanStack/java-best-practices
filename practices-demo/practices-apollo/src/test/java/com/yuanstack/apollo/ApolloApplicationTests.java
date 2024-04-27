package com.yuanstack.apollo;

import com.ctrip.framework.apollo.core.ApolloClientSystemConsts;
import com.ctrip.framework.apollo.mockserver.ApolloTestingServer;
import com.yuanstack.apollo.config.Demo;
import com.yuanstack.apollo2.Config1;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApolloApplicationTests {


    static ApolloTestingServer apolloTestingServer = new ApolloTestingServer();

//    @ClassRule  // junit4
//    public static EmbeddedApollo apollo = new EmbeddedApollo();

    @BeforeAll
    @SneakyThrows
    static void init() {
        System.out.println(" ====================================== ");
        System.out.println(" ====================================== ");
        System.out.println(" =============     Before    ========== ");
        System.out.println(" ====================================== ");
        System.out.println(" ====================================== ");
        apolloTestingServer.start();
    }

    @Autowired
    Demo demo;
    @Autowired
    Config1 conf;

    @Test
    void contextLoads() {
        System.out.println("....  ApolloClientSystemConsts.APOLLO_CONFIG_SERVICE  .....");
        System.out.println(System.getProperty(ApolloClientSystemConsts.APOLLO_CONFIG_SERVICE));
        System.out.println("....  ApolloClientSystemConsts.APOLLO_CONFIG_SERVICE  .....");
    }

    @Test
    void test01(@Autowired ApplicationContext context) {
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("  ====>>> demo.getA() = " +demo.getA());
        System.out.println("  ====>>>        conf = " +conf);
    }

    @AfterAll
    @SneakyThrows
    static void destory() {
        apolloTestingServer.close();
    }
}
