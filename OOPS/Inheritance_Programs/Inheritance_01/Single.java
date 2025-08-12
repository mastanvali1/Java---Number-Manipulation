class employee{
    int id;
    String name;
    void display() {
        System.out.println("Name: " + name + ", Roll: " + id);
    }
}

class manager extends employee {
    String managerName;
    void display2() {
        System.out.println("Name: " + managerName);
    }
}

class Single {
    public static void main(String[] args) {
        manager mg = new manager();
        mg.id = 1234;
        mg.name = "mastan";
        mg.managerName = "baji";
        mg.display();
        mg.display2();
    }
}