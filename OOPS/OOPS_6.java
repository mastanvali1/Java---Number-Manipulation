class count {
    int count = 0;
    {
        count++;
        System.out.println(count);
    }
    void work(){
            System.out.println("hai");
    }
}
class OOPS_6{
public static void main(String[] args) {
        count c = new count();
        c.work();
        count c2 = new count();
        c2.work();
 }    
}

/*

code is pending

*/