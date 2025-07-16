import java.util.Scanner;
public class program_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		cubeOfnNumbers(n);
	}
	static void cubeOfnNumbers(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res = i * i * i;
			System.out.println("The cube of " + i + " is: " + res);
		}
	}
}

/*

Cube of n numbers

Output:-

5
The cube of 1 is: 1
The cube of 2 is: 8
The cube of 3 is: 27
The cube of 4 is: 64
The cube of 5 is: 125

*/