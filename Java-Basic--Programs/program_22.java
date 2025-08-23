
 //-----------------repeatedly sum the digits of the number until a single digit is obtained.--------

import java.util.*;
class program_22 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        while(num >= 9) {
            int sum = 0;
            while(num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            num = sum;
        }
        System.out.println("hai" + num);
    }
}