package org.cody.demo;

import org.springframework.stereotype.Component;

@Component
public class Test {
    void prime(int n) {
        if(n == 0) {
            System.out.println("\nNot a Prime Number\n");
        } else {
            for(int i = 1 ; i <= n ; i++) {
                int c = 0;
                for(int j = 1 ; j <= i ; j++) {
                    if(i % j == 0) {
                        c++;
                    }
                }
                if(c == 2) {
                    System.out.println("\t"+i+"\t");
                }
            }
        }
    }
}
