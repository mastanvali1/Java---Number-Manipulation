class Person {
    String name;

    Person() {
        this("Rohit");
        System.out.println("0 - parameterized Person constructor");
    }

    Person(String name) {
        //super();
        this.name = name;
        System.out.println("1 - parameterized Person constructor");
    }
  
}

class Student extends Person {
    int roll;
    int marks;
   
   Student() {
    super("Amit");
    System.out.println("0 - parameterized Student constructor");
   }

    Student(int roll) {
      this();
     System.out.println(" - parameterized Person constructor");
    }
   
}

class constructorChaingingSuper {
    public static void main(String [] args) {
        child ch = new child(10);
    
        System.out.println(ch.x);
        System.out.println(ch.y);
        ch.displayParent();
        ch.displayChild();
        
    }
}