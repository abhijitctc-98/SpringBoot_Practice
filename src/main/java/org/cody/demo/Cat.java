package org.cody.demo;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Cat Eats");
    }
    
}
