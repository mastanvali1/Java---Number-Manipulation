
      //-------- hierarchical Inheritance -------

class robot {
      void work() {
        System.out.println("Working");
    }
    void speak() {
        System.out.println("speaking");
    }
    void charge() {
        System.out.println("charging");
    }
}

class teacherRobot extends robot {
    
    void teach() {
        System.out.println("teaching");
    }
}

class doctorRobot extends robot {

    void doSurgery() {
        System.out.println("Surgery");
    }
}

class hierarchical{

    public static void main(String [] args) {
        teacherRobot t = new teacherRobot();
        t.work();
        t.speak();
        t.charge();
        t.teach();
       System.out.println("_____________________");

        doctorRobot d = new doctorRobot();
        d.work();
        d.speak();
        d.charge();
        d.doSurgery();
    }
}