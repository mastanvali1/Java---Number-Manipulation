import java.util.Scanner;
class program_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sumOfSquares(n);
    }
    static void sumOfSquares(int a){
        int sum = 0;
       
       for (int i = 1; i<=a; i++) {
        
        sum = sum + (i * i);
       }
       System.out.println(sum);
    }
}

/*

Sum of the Squares of the N numbers.

*/