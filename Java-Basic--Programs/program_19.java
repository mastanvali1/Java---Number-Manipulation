
//--------- Convert decimal to binary-----

import java.util.Scanner;
public class program_19 {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String res = "";
        
        while(num >= 1) {
            int rem = num % 2;
            res = rem + res;
            num = num / 2;
        }
        System.out.println("the binary of given number is :" +  res);
   
    }

}
