
        //---------- class and object -----------

import java.util.Scanner;

//class : - class is the definition of object that which contains properties and behaviours.

class student{
    int roll;
    String name;
    String destination;
    double salary;
    void work() {
        System.out.println("working");
    }
    void eat() {
        System.out.println("Eating");
    }
}


 public class OOPS_1 {
    public static void main(String[] args) {
        // object : -  object is the programatical representation of class or instace of class.

        student st = new student();
        Scanner scan = new Scanner(System.in);
        st.roll = scan.nextInt();
        st.name = scan.next();
        st.destination = scan.next();
        st.work();
        st.eat();
    }
}

/*
Basics of class and object creation with defination.

*/