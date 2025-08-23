

// ----------Smallest digit from a given number----------------

import java.util.*;
class program_24 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int smallestDigit = 9;
        while(num != 0) {
            int Digit = num % 10;
            if(Digit < smallestDigit) {
                smallestDigit = Digit;
            }
            num = num / 10;
        }
        System.out.println(" the Smallest digit from the given number is : " + smallestDigit);
    }
}