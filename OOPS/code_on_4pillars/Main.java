
//-------All 4 pillars program--


// In this program we can see the all 4 pillars of oops they are , 
// class, object, encapsulation, inheritance, ployemorphism, abstraction


import java.util.*;

//----Shape--
abstract class Shape {
    double area;
    abstract void takeInput();
    abstract void calculateArea();
    abstract void displayArea();
}

//------Square-----
final class Square extends Shape {
     private double side;
     @Override
     public void takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side value");
        side = scan.nextInt();
     }
     @Override
     public void calculateArea() {
    	 area = side * side;
     }
     @Override
     public void displayArea() {
    	 System.out.println("Area of Square is " + area);
     }
}

//-------circle--- 
final class Circle extends Shape {
     private double radius;
     final double pie  = Math.PI;
     @Override
     public void takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius value");
        radius = scan.nextInt();
     }
     @Override
     public void calculateArea() {
    	area = pie * (radius * radius);
     }
     @Override
     public void displayArea() {
    	 System.out.println("Area of circle is " + area);
     }
}

//------Rectangle-----
final class Rectangle extends Shape {
    private double length;
    private double width;
    @Override
    public void takeInput(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter length value");
       length = scan.nextInt();
       System.out.println("Enter width value");
       width = scan.nextInt();
    }
    @Override
    public void calculateArea() {
   	 area = length * width;
    }
    @Override
    public void displayArea() {
   	 System.out.println("Area of Rectangle is " + area);
    }
}

//-----Main-------
public class Main {

	public static void main(String[] args) {
		Shape sh = new Rectangle();
		sh.takeInput();
		sh.calculateArea();
		sh.displayArea();
		
		sh = new Square();
		sh.takeInput();
		sh.calculateArea();
		sh.displayArea();
		
		sh = new Circle();
		sh.takeInput();
		sh.calculateArea();
		sh.displayArea();
	}
}
