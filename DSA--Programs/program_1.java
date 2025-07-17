import java.util.Scanner;
public class program_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("the value of a is : " + a + "\n" + "The value of b is : " + b);
		scan.close();
	}
}


/*

Swaping of two numbers with the help of third variable

note :- by using third varible it will consume more memory so we write another program with different logic.........


*/