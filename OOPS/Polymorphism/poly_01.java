
//----------Polymorphism----------

//def: 
// Polymorphism is the ability of one method or object to take many forms. 
// It allows a single reference to call different methods depending on the actual object it refers to.


//In this program we have achieved upcasting , one ratio to many relationships (1:many) and flexiybility but there is code redundancy.

class Developer {
	void work() {
		System.out.println("Developer is working");
	}
	void project() {
		System.out.println("Developer is doing project");
	}
}

class JavaDeveloper extends Developer {
	void project() {
		System.out.println("Java Developer is doing Java project");
	}
}


class PythonDeveloper extends Developer {
	void project() {
		System.out.println("Python Developer is doing Python project");
	}
}
public class poly_01 {

	public static void main(String[] args) {
		Developer dev = new JavaDeveloper();
		dev.work();
		dev.project();
		dev = new PythonDeveloper();
		dev.work();
		dev.project();

	}

}