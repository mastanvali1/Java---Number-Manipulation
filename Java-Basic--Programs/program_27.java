
// ------------- Finding Factors of each number and Their HCF and 
// --------------Check whether the hcf number is present in fibanocii series or not ---------

import java.util.*;
class program_27 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num value:");
        int num1 = scan.nextInt();
        System.out.println("Enter the num2 value");
        int num2 = scan.nextInt();
        findFactors(num1);
        System.out.println();
        findFactors(num2);
        System.out.println();
        System.out.println("The HCF of given two numbers are:");
        int hcf = findHCF(num1, num2);
        System.out.println(hcf);
        fibnaciiOrNot(hcf);
    }

    public static int findHCF(int num1, int num2) {
        while(num2 > 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }

    public static void findFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
         for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void fibnaciiOrNot(int hcf) {
        int fib1 = 0, fib2 =1;
            while(hcf > 0) {
                int fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                if(fib3 == hcf) {
                    System.out.println("The given is in fibanacii");
                    return;
                }
                hcf--;
            }
            System.out.println("The hcf number is not present in fibonacii ");
    }
}