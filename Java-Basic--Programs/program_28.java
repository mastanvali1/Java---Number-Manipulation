
   //------------ using Recursion find sum of numbers-------

class program_28 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    } 

    public static int sum(int num) {
        if(num == 1) {
            return 1;
        }
        return num + sum(num-1);
    }
}