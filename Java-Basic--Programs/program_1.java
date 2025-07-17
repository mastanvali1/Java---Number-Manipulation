import java.util.Scanner;
class program_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        cheackNum(n);
    }
    static void cheackNum(int a){
        if(a > 0) {
            System.out.println(a + " is positive Number.");
        }
        else if(a == 0){
            System.out.println(a + " is Zero");
        }
        else{
            System.out.println(a + " is negative number.");
        }
    }
}

/*

cheack number is positive or not 

*/