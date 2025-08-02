import java.util.Scanner;
class program_5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        primeNumber(num);
    }

    static void primeNumber(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}

/*

prime Number

*/