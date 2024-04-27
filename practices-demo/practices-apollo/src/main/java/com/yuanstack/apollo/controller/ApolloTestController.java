package com.yuanstack.apollo.controller;

import com.yuanstack.apollo.config.Demo;
import com.yuanstack.apollo2.Config1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sylvan
 * @date 2024/04/21  22:34
 */
@RestController
public class ApolloTestController {

    final Demo demo;
    final Config1 conf;

    public ApolloTestController(Config1 conf, Demo demo) {
        this.conf = conf;
        this.demo = demo;
    }

    @GetMapping("/cf")
    public String cf() {
        System.out.println(demo.getA());
        System.out.println(conf);
        return demo.getA() + ",\n" + conf + ",\n" + System.identityHashCode(conf);
    }
}
