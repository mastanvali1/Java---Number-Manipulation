class student {
    int roll;
    String name;
    int marks;

    student (int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        //for above three varible we have seen the shadowing problem , so to solve that we used "this" keyword.
        /*
        Let see what is exactly shadowing problem,

        Shadowing Problem:- 
                            When ever local variable names and Instance variable names will be same 
                            at that time local variable value is assign to local variable itself, 
                            local variable values will not be assigned to instance variable, This is called as shadowing problem.

        Solution:- 
                just use the "this" key word as like above in constructor.
        */
    }

    void displayInfo() {
        System.out.println("Roll: " + roll);
        System.out.println("name: " + name);
        System.out.println("marks: " + marks);
    }
}

class Shadowing_Problem {
    public static void main(String[] args) {
       student p1 = new student(12, "Ajay", 99);
       p1.displayInfo();
    }
}
