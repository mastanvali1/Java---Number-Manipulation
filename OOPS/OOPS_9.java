class student {
    private int roll;
    private String name;
    private int marks;
  

    //Constructor: - it is special method which will set the values to data members(used as setter method),
    // dont have return type and name must be same as class name.
    // can called only while creation of object.

    student(int a,String b, int c) {
        roll = a;
        name = b;
        marks = c;
       
    }

    void displayinfo() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
        
    }
}

class OOPS_9 {
    public static void main(String[] args) {
       student p1 = new student(12, "Ajay", 99);
       p1.displayinfo();
        System.out.println("________________");
       student p2 = new student(); //this is the error because it is zero parameterized constructor , 
                                   // in the class we have three parameterized constructor.
        p2.displayinfo();
    }
}

/*

This program will give the error.

Note:- Because there are two objects , one is three parameterized constructor call and other is zero parameterized constructor call
from this second object will give error because empty objects are executed if there are no constructors in class.


*/