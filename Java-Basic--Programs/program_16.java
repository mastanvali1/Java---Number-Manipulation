           /*------- Find given char is vowel or consonent----------*/

import java.util.*;
public class program_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')  {
            System.out.println(ch + " is a vowel");
        } 
        else if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')) {
            System.out.println(ch + " is consonent");
        }
        
        else 
        {
            System.out.println(ch + " is not a valid character");
        }
	}	
}

/*

Output:-

Test Case-1:-

A
A is a vowel

_________________________________
Test Case-2:-

a
a is a vowel

____________________________
Test Case-3:-

1
1 is not a valid character

_____________________________
Test Case-4:-

s
s is consonent
*/


