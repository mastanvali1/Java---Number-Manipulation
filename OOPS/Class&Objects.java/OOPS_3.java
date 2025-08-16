
      //--------static variable, static method, static block ---------

import java.util.Scanner;

class program{
   static int x, y ;
   static{
    System.out.println("static block");
    x = 10;
    y = 20;
   }
   static void display1() {
    System.out.println("static method");
    System.out.println(x);
    System.out.println(y);
   }
   int a,b;

   {
    System.out.println("non-static block");
    a = 111;
    b = 222;
    x = 333;
    y = 444;
   }

   void display2 (){
    System.out.println("non static method");    
    System.out.println(a);    
    System.out.println(b);    
    System.out.println(x);    
    System.out.println(y);    

   }

}


 public class OOPS_3 {
    public static void main(String[] args) {

       program.display1();   //  calling static method without creating object.
       program pr = new program();  // calling non static method with creating object.
       pr.display2();
    }
}

/*
Static : -  static is a key word used to indicate that a method ,variable and block , to call these we dont need to create object.

static variable:- variable that which is created by using static keyword, loaded once at class loading time, shared across all objects , it stored in static memory.

static method:- method is created by using static keyword, stored in static memory, can be called by using the class name, static methods not able access the non static varibles but non static methos can able to acces the static varibles etc.

static block:- executes only once when the class is first loaded, used to initialize static variables. 
*/