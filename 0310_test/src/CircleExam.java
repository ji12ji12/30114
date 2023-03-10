import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Circle cir = new Circle(radius);
		
		cir.area();
	}

}

class Circle{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void area() {
		 System.out.println(radius*radius*3.14);
	}
	
}