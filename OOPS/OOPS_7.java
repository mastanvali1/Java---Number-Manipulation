class student {
   private int roll;
   private String name;
   private int marks;

   public void setData(int x,int y, String z) {
    if(x > 0){
         roll = x;
    } else {
        System.out.println("Cannot assign");
        return;
    }
   if (y > 0) {
         marks = y;
   } else {
        System.out.println("Cannot assign");
        return;
   }
   
    name = z;
   }
   public int getRoll() {
     
        return roll;
   }
    public int getMarks() {
     
        return marks;
   }
    public String getName() {
     
        return name;
   }
}

class OOPS_7{
public static void main(String[] args) {
      student st = new student();
      st.setData(-1,99,"mastan");
     
      System.out.println(st.getRoll());
      System.out.println(st.getMarks());
      System.out.println(st.getName());
 }    
}

/*

Program to represent the encapsulation, how it works actually.

*/