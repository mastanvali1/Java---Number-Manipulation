import java.util.Scanner;
public class program_19 {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        int n = decimal;

        // Convert decimal to binary
        String res = "";
        while(decimal != 0){
            int rem = decimal%2;
            res = rem + res;
            decimal= decimal/2;
       }
        System.out.println("The binary equivalent of " + n + " is " + res + ".");
}

}
