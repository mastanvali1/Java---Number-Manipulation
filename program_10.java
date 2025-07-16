class program_10{
    public static void main(String[] args) {
       sumOfOdd();
    }
    
   static void sumOfOdd(){
        int sum = 0;
        for (int i = 1; i <= 50; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("sum of odd numbers from 1 to 50 : " + sum);
   } 
   
}

/*

sum of odd numbers from 1 to 50

*/