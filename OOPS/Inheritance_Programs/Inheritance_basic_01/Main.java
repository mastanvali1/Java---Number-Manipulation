
            /*  --------------------Inheritance--------------*/
            
class Main{

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