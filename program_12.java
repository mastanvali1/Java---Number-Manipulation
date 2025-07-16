import java.util.Scanner;
class program_12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibnacci(n);
    }
    static void fibnacci(int n){
        
        if (n == 0){
            System.out.println("the 0th term of fibonacci is : 0");
        }else if(n == 1){
            System.out.println("The 1th term of  fibonacci is : 1");
        }else{
            int fib1 = 0;
            int fib2 = 1;
            int fib3 = 0;
            for (int i = 2; i <= n; i++){
             fib3 = fib1 + fib2;
             fib1 = fib2;
             fib2 = fib3;
            
            }
            System.out.println("The " + n +"th term of fibonacci is: " + fib3);
        }
    } 
}


/*
Finding the nth term of fibonaci series

*/