import java.util.Scanner;
public class program_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Eneter the value of b:");
		int b = scan.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swaping numbers: " + "\n" + "value of a is : " + a + "\n" + "value of b is : " + b);
	}

}


/*

swaping of two numbers using XOR bitwise operator 

Note:-  it is most efficient program of  swaping because it not take much memory 
        and it is more efficient when compared to other logic.

*/
