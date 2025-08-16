
        //----------- Multi - level inheritance ----------
class FresherEmployee {
    int newID;
    void display1() {
        System.out.println(newID + " is new id of fresher");
    }
}

class employee extends FresherEmployee {
    int id;
    String name;
    void display2() {
        System.out.println("Name: " + name + ", Roll: " + id);
    }
}

class manager extends employee {
    String managerName;
    void display3() {
        System.out.println("Name: " + managerName);
    }
}


class multi_level {
    public static void main(String[] args) {
        manager mg = new manager();
        mg.id = 1234;
        mg.name = "mastan";
        mg.managerName = "baji";
        mg.newID = 122;
        mg.display1();
        mg.display2();
        mg.display3();
    }
}