
            //------constructor chainging using super()----------

class Parent {
    int x;

    Parent(int x) {
        this.x = x;
    }

    void displayParent() {
        System.out.println("This the parent ");
    }
  
}

class child extends Parent {
    int y;
    void displayChild() {
        System.out.println("This the Child ");
    }
    child(int y) {
      super(20);
      this.y = y;
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
