import java.util.Scanner;
class program_9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       fibnaci(n);
    }
    static void fibnaci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1 + "\n" + fib2);
        // System.out.println(fib2);
        for (int i = 3; i <= n; i++){
            int fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1 = fib2;
            fib2 = fib3;

        }
    }
}


/*

printing the fibnacci series upto n value.

*/