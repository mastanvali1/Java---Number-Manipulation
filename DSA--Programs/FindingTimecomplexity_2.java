import java.util.Scanner;
class FindingTimecomplexity_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // ----> 1 unit
        int sum = 0; //  ----> 1 untit
        for (int i = 1; i <= n; i++){  // [i = 1 has 1 unit] , [i<=n has n+1 unit], [i++ has n+1 unit] out of this we take max one that is n+1.
            sum = sum + i;  // --> n unit
        }
        System.out.println(sum); //---> 1 unit
    }
}

/*
now timecomplexity of above program is calculated as 

time complexity = 1+1+n+1+n+1;
                = 4+2n

therefore ---> O(n) 

*/