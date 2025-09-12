
//------------Array----------

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}