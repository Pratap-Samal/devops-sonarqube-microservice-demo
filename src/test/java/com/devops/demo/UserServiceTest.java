package com.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.devops.demo.service.UserService;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService service;

    @Test
    void testDiscount(){

        int result = service.calculateDiscount(150);

        assertEquals(10, result);

    }

}