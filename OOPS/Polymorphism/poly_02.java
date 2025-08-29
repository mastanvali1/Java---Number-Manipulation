

//------------------polymorphism-----------

//In this program we have achieved upcasting , one ratio to many relationships (1:many) and 
// flexiybility and also there is no code redundancy compared to previous program.

class Teacher {
	void teach() {
		System.out.println("Teacher is teaching");
	}
	void takeAttendence() {
		System.out.println("Teacher is taking Attendence");
	}
}
class MathTeacher extends Teacher {
	void teach() {
		System.out.println("MathTeacher is Teaching");
	}
}
class ScienceTeacher extends Teacher {
	void teach() {
		System.out.println("ScienceTeacher is Teaching");
	}
}
public class Main1 {
	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher();
		ScienceTeacher st = new ScienceTeacher();
		doActivity(mt);
		doActivity(st);
	}
	static void doActivity(Teacher ref) {
		ref.teach();
		ref.takeAttendence();
	}
}
