
//------------------Arrays--------------

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // creating an array
        int [] arr = new int [n]; 

        System.out.println("Enter the value you want to insert: ");

        // Storing the data in array
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("the values are ");

         // Retriving data from array.
        for(int i = 0; i <= n-1; i++) {
           
            System.out.println(arr[i]);
        }
    }
}