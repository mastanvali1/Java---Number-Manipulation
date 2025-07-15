import java.util.Scanner;
class program_7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       calcFact(n);
    }
    static void calcFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact  *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}