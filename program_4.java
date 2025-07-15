import java.util.Scanner;
class program_4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        reversNum(num);
    }

    static void reversNum(int num){
        int rvs =0;
        while (num > 0 ){
            int rem = num % 10;
            rvs = (rvs*10) + rem;
            num = num / 10;
        }
        System.out.println(rvs);
    }
    
}

/*

reversing of number

*/