
        // ---------- Write a program to count no. of objects are created. ---------------

class count {
    static int count = 0; // static variable to keep no.of objects created.
    
    //non - static block used to increament the count value. 
    {
        // every time object is created , non - static block will be executed and increment the count value.
        count++; 
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
        count c3 = new count();
        System.out.println("the number of objects created " + count.count);
 }    
}

/*

Write a program to count no. of objects are created.

*/