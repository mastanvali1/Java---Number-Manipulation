

// -------------Perfect Square---------

import java.util.*;
class program_25 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i*i <= num; i++) {
            if(i*i == num) {
                System.out.println("The given number is perfect Square.");
                return;
            }
        }
        System.out.println("Not a perfect Square.");
    }
}