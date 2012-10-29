abstract class Shape{
	public abstract double area();
}

public class Trapezia extends Shape{
	protected double up, down, height;
	public Trapezia(double a,double b,double d){
		up=a;down=b;height=d;
	}
	public double area() {
		double area=0;
		area=(up+down)*height/2;
		return area;
	}
	public static void main(String args[]){
			Trapezia trap=new Trapezia(3,5,2.4);
			System.out.print("梯形的面积为: "+trap.area());
		}
}