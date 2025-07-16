import java.util.Scanner;
class program_11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n;
        sumingDigits(n,a);
    }
    
   static void sumingDigits(int n,int a){
    int rem = 0;
    int sum = 0;
        while(n > 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("suming the digits " + a +":" + sum );
   }
   
}

/*

Summing digits.
ex:- 123 -----> 1 + 2 + 3 = 6

*/

