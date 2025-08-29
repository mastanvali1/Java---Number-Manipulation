
//------------polymorphism downcasting---------

class Developer {
	void work() {
		System.out.println("Developer is working");
	}
	void project() {
		System.out.println("Developer is doing project");
	}
}

class JavaDeveloper extends Developer {
    // In this we have 1-inherited method, 1-ovrriden method, 1-child spefied method.
        @Override
	void project() {
		System.out.println("Java Developer is doing Java project");
	}
    void learnJava() {
        System.out.println("Java developer is learning Java");
    }
}


class PythonDeveloper extends Developer {
     // In this we have 1-inherited method, 1-ovrriden method, 1-child spefied method.
        @Override
	void project() {
		System.out.println("Python Developer is doing Python project");
	}
     void learnPython() {
        System.out.println("Python developer is learning Python");
    }
}
public class poly_03 {

	public static void main(String[] args) {
		Developer dev = new JavaDeveloper();
		dev.work();
		dev.project();
        ((JavaDeveloper)(dev)).learnJava();
        // dev.learnJava(); ---ERROR bcz using parent ref cannot call child specified methods.
		
        //Performing downcasting to call shild specific method using parent ref 
        // DOWNCASTING - > converting parent reference to child type 
        dev = new PythonDeveloper(); // calling child specific method
		dev.work();
		dev.project();
        // dev.learnPython();
        ((PythonDeveloper)(dev)).learnPython();

	}
}