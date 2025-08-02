  
  /* From here we will see little more complex programs */

import java.util.Scanner;
public class program_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int leapYear = scan.nextInt();
        if ((leapYear % 4 == 0 && leapYear % 100 !=0 ) || leapYear % 100 == 0 && leapYear % 400 == 0) {
            System.out.println(leapYear + " is a Leapyear");
        } else {
            System.out.println(leapYear + " is not a leap year");
        }
	}
	
}


/*

oUTPUT:

Test Case-1:-

2000
2000 is a Leapyear
_________________________________
Test Case-2:- 

1900
1900 is not a leap year

*/