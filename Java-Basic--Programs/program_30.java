

// ---------GCD using recursion----------

import java.util.Scanner;
class program_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();
        System.out.println(findGCD(num1, num2));
    } 

    public static int findGCD(int num1,int num2) {
        if (num2 == 0) {
            return num2; 
        }
        else{
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
            findGCD(num1,num2);
            return num1;
        }
        
    }
}