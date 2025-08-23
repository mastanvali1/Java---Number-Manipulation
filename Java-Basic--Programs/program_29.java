
     //------------ using Recursion find factorial of number-------

import java.util.Scanner;
class program_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();
        System.out.println(factorialNum(n));
    } 

    public static int factorialNum(int num) {
        if(num == 0) {
            return 1;
        }
        return num * factorialNum(num-1);
    }
}