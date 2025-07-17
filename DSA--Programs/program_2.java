import java.util.Scanner;
public class program_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Eneter the value of b:");
		int b = scan.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swaping numbers: " + "\n" + "value of a is : " + a + "\n" + "value of b is : " + b);
	}

}

/*

Swaping the numbers without third variable


*/
