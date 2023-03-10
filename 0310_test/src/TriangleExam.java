import java.util.Scanner;

public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Triangle tri = new Triangle(10.2,17.3);
		System.out.println(tri.area());
		tri.getDouble(7.5, 9.2);
		System.out.println(tri.area());
		
	}

}

class Triangle{
	double width;
	double high;
	public Triangle(double width, double high) {
		this.width = width;
		this.high = high;
	}
	
	public void getDouble(double newWidth, double newHigh) {
		width = newWidth;
		high = newHigh;
	}
	public double area() {
		return (width*high)/2;
	}
}