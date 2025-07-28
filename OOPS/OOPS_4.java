import java.util.Scanner;
class OOPS_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Operation = scan.next();

        switch (Operation) {
            case "ADDITION" -> Mathoperation.add(scan.nextInt(),scan.nextInt());
            case "SUBTRACTION" -> Mathoperation.sub(scan.nextInt(),scan.nextInt());
            case "MULTIPLICATION" -> Mathoperation.mul(scan.nextInt(),scan.nextInt());
            case "DIVISION" -> Mathoperation.div(scan.nextInt(),scan.nextInt());

        }
        
    }
}


class Mathoperation {
    static void add(int num1, int num2) {
        System.out.println("Addition of two numbers " + (num1 + num2));
    }
    static void sub(int num1, int num2) {
        System.out.println("Addition of two numbers " + (num1 - num2));
    }
    static void mul(int num1, int num2) {
        System.out.println("Addition of two numbers " + (num1 * num2));
    }
    static void div(int num1, int num2) {
        System.out.println("Addition of two numbers " + (num1 / num2));
    }
}

/*
Accessing the static methods without crteating objects.

*/