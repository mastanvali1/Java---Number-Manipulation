  /* program for finding n even numbers(it not like finding even number like,  let say n=5; then output will show the 2,4,6,8,10. it means first five even numbers ) */

import java.util.*;
public class program_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        System.out.println("The first " + n + " even numbers:");
        for (int i = 1; i<=n; i++) {
            System.out.println(i*2);
        }
	}	
}

/*
Output;

5
The first 5 even numbers:
2
4
6
8
10

*/