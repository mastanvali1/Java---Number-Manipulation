class OOPS_5 {
    static {
        System.out.println("static block 1");
        {
            System.out.println("nested non-static block");
        }
    }
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 1");
    }
    {
        System.out.println("non-static block 2");
        {
            System.out.println("nested non-static block");
        }
    }
    {
        System.out.println("non-static block 2");
    }
    {
        System.out.println("non-static block 3");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        OOPS_5 op = new OOPS_5();

    }
}


/*

output:

static block 1
static block 1
static block 1
Main method
non-static block 2
non-static block 2
non-static block 3

--> the execution of blocks will be in sequence that is why the blocks get executed in sequence.

*/
