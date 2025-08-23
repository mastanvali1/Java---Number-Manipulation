
    // -------------GCD----------


import java.util.*;
class program_23 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The gcd of give numbers: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while(b > 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}