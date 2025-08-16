

        //------constructor chainging using super()----------

class Parent {
    int x;
    void displayParent() {
        System.out.println("This the parent ");
    }
    void Parent(int a) {
        this.x = a;
       
    }
}

class child extends Parent {
    int y;
    void displayChild() {
        System.out.println("This the Child ");
    }
    void child(int b) {
      this.y = b;
    }
   
}

class constructorChangingSuper {
    public static void main(String [] args) {
        child ch = new child(10);
        ch.y = 20;
        ch.x = 5;
        System.out.println(ch.x);
        System.out.println(ch.y);
        ch.displayParent();
        ch.displayChild();

        Parent p = new Parent(40);
        p.x=50;
        System.out.println(p.x);
        
        p.displayParent();
        
    }
}
