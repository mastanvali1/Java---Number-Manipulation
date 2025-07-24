import java.util.Scanner;
public class program_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        cheackPositiveOrNegative(n);
	}
    static void cheackPositiveOrNegative(int n){
        if (n  > 0) {
            System.out.println("Positive");
        }else if(n == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }

}


/*

Time complexity is : O(1) ---> because if value of n (input) gets increased then if -else get excute only one time so we conclude that O(1) contant time.


Output: -

test case-1 :-

12
Positive
--------------------
test case-2 :-

0
Zero
-------------------
test case-3 :-

-12
Negative
------------------

*/