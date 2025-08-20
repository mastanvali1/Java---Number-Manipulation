
        // -----------Palindrome or not-----

import java.util.*;
class program_21 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = num;
        int sum = 0;
        while(num != 0) {
            int rem  = num % 10;
            sum = (sum * 10)+ rem;
            num  =num / 10;
        }
        if (sum == n){
            System.out.println(n + " is a palindrome.");
        } else {
             System.out.println(n + " is not a palindrome.");
        }
  
    }
}