import java.util.Scanner;
class FindingTimecomplexity_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // ----> consider as 1 unit
        System.out.println(n * (n+1) / 2);  // ---> consider as 1 unit
    }
}

/*

now timecomplexity of above program is calculated as 

time complexity = 1 + 1
                = 2

therefore ---> O(1) --- it is having constant time even we change input size

*/
