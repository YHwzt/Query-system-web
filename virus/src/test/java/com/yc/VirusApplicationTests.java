package com.yc;

import com.yc.service.impl.VirusServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class VirusApplicationTests {

    @Autowired
    VirusServiceImpl virusService;
    @Test
    void contextLoads() {
    }

}
