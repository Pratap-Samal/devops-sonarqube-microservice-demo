package com.devops.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public int calculateDiscount(int price){

        int discount = 0;

        if(price > 100){
            discount = 10;
        } else if(price > 200){
            discount = 20;
        }

        return discount;
    }

    public String getUserEmail(String name){

        String email = null;

        if(name.equals("admin")){
            email = "admin@test.com";
        }

        return email.toLowerCase();
    }

}