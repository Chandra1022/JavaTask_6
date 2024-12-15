package task6;

public class Circle {

	double radius;

	Circle(){
		this.radius=1.0;
	}

	Circle(double radius){
		this.radius = radius;
	}
	public void circumference() {
		System.out.println(2*Math.PI*radius); //print circumference of circle
	}

	public static void main(String[] args) {

		Circle obj = new Circle();
		Circle obj1 = new Circle(5.0);
		obj.circumference();
		obj1.circumference();
	}

}
