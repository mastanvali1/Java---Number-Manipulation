//-------------- In this program you will see the both concepts, they are ------
// ------------------  1)Encapsulation.
// ------------------  2)Constructor.

class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double height;
    private String email;

    //Constructor: - it is special method which will set the values to data members(used as setter method),
    // dont have return type and name must be same as class name.
    // can called only while creation of object.

    Person(int a,String b, int c, String d, double e, String f) {
        id = a;
        name = b;
        age = c;
        gender = d;
        height = e;
        email = f;

    }

    void displayinfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(email);
    }
}

class OOPS_8 {
    public static void main(String[] args) {
       Person p1 = new Person(12, "Ajay", 18, "Male", 5.8, "Ajay@gmail.com");
       p1.displayinfo();
        System.out.println("________________");
       Person p2 = new Person(13, "ravi", 20, "Male", 5.6, "ravi@gmail.co");
        p2.displayinfo();
    }
}


/*

Constructor:- 

it is special method which will set the values to data members(used as setter method),
 dont have return type and name must be same as class name,
 can called only while creation of object.


 */
