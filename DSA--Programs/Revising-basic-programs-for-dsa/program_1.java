import java.util.Scanner;
public class program_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        cheackTemparature(n);
	}
    static void cheackTemparature(int n){
        if (n  > 30) {
            System.out.println("Hot");
        }
        System.out.println("Program ended");
    }

}


/*

Time complexity is : O(1) ---> because if value of n (input) gets increased then if -else get excute only one time so we conclude that O(1) contant time.

Output: -

35
Hot
Program ended

*/