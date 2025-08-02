import java.util.Scanner;
class program_8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       NthTerm(n);
    }
    static void NthTerm(int n) {
        int sum = n*(n+1)/2;
        System.out.println("The " + n + "th term of series is "+ sum + ".");
    }
}

/*
finding the nth term of series

1,3,6,10,15,21,..........

here the 5th term is 15 
like this we will get the output.

*/