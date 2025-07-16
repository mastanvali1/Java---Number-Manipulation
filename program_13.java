import java.util.Scanner;
public class program_13{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		squareOfnNumbers(n);
	}
	static void squareOfnNumbers(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res = i * i;
			System.out.println("The square of " + i + " is: " + res);
		}
	}

}

/*

the squares of n numbers 

Output:-

5
The square of 1 is: 1
The square of 2 is: 4
The square of 3 is: 9
The square of 4 is: 16
The square of 5 is: 25

*/