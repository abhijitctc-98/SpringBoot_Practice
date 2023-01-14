package org.cody.demo;

import org.springframework.stereotype.Component;

@Component
public class StringPallindrome {
    void checkPallidrome(String str) {
        String s = str.toLowerCase();
        if(s.length() == 0) {
            System.out.println("\nInvalid String\n");
        } else if(s.length() == 1) {
            System.out.println(s+"\tis Pallindrome\n");
        } else {
            int low = 0;
            int high = s.length() - 1; 

            while(low < high) {
                if(s.charAt(low) == s.charAt(high)) {
                    low++;
                    high--;
                }
            }
            if(low == high) {
                System.out.println(s+"\tis Pallindrome\n");
            }
        }
    }
}
