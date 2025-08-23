

//-------------N prime numbers-------


import java.util.*;
class program_26 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("The first " + num + " prime numbers: ");
        findPrimeNumbers(num);
    }

    public static void findPrimeNumbers(int num) {
        int primeCount = 0;
        int number = 2;
        while(primeCount < num) {
            if(isPrime(number)) {
                System.out.println(number);
                primeCount++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}