
//        ------------------ Constructor Overloading ----------------

class Student {
  
    int roll;
    String name;
    double marks;

    Student(){

    }

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    
    Student(int roll) {
        this.roll = roll;
    }
    void displayInfo(){
            System.out.println(roll);
            System.out.println(name);
            System.out.println(marks);
    }
}
class OOPS_11{
public static void main(String[] args) {
       Student st1 = new Student();
       st1.displayInfo();
        Student st2 = new Student(1,"Ajay",84.4);
        st2.displayInfo();
        Student st3 = new Student(2,"Rhoit");
        st3.displayInfo();

        Student st4 = new Student(3);
        st4.displayInfo();

 }    
}


