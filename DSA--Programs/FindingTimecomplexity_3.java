class FindingTimecomplexity_3{
    public static void main(String[] args){
        int n = 5; //--> 1 unit
        for (int i = 1; i<=n; i++){  // ---> [i=1 has 1 unit],[i<=n has n+1 unit],[i++ has n+1],Totaly it has max value as n+1.
            for (int j = 1; j <= n; j++){  // -- > [j=1 has 1 unit],[j<=n has (n+1)*n unit], [j++ has (n+1)*n unit],Totally max value as (n+1)*n.
                System.out.print("*"); // --> n*n unit
            }
            System.out.println();// --> n unit
        }
    }
}

/*
 now timecomplexity of above program is calculated as 

 time complexity = 1 + (n+1) + (n^2 + n) + n^2 + n;
                 = 2n^2 + 3n + 1

 therefore ---> O(n^2) 

*/