    /*---------Count number of digits in a given number---------- */

import java.util.*;
public class program_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = num;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("The number of digits in give "+ a +" is " + count);

	}	
}