//    ----------------Copy Constructor---------

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    Student(Student s1) {  // copy constructor
       name = s1.name;
        roll = s1.roll;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Roll no: " + roll);
    } 


}

class OOPS_12 {
    public static void main(String[] args) {
        Student s1 = new Student("Mastan", 48);
        s1.displayInfo();
        
        System.out.println("____________________");
        Student s2= new Student("Mastan", 48);
        s2.displayInfo();

         System.out.println("____________________");
        Student s3= new Student("Mastan", 48);
        s3.displayInfo();
        
        System.out.println("____________________");
        Student s4 = new Student(s1);  // copy constructor 
        s4.displayInfo();

    }
}