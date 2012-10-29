import java.util.*;

public class quadraticEquationsTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		quadraticEquations f=new quadraticEquations();
		while(true){
		System.out.println("请输入二次项系数：");
		double a=in.nextDouble();
		f.setA(a);
		if(f.getA()!=0){
			break;
		}
		else
			System.out.println("请重新输入。二次项系数不能为0！");
		}
		System.out.println("请输入一次项系数：");
		double b=in.nextDouble();
		f.setB(b);
		System.out.println("请输入常数项：");
		double c=in.nextDouble();
		f.setC(c);
		f.creatFunction();
		f.calculate();
	}

}

 class quadraticEquations {
	private double a=1;//二次项系数
	private double b;//一次项系数
	private double c;//常数
	private double x1;
	private double x2;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
    
	public void calculate(){//计算一元二次方程组的值
		if((b*b-4*a*c)>0){
			x1=((-b)+Math.sqrt(b*b-4*a*c))/2*a;
			x2=((-b)-Math.sqrt(b*b-4*a*c))/2*a;
			System.out.println("两个根为："+x1+"\t"+x2);
		}else{
			System.out.println("此方程无解！");
		}	
	}
    
	public void creatFunction(){
		System.out.println("您输入的一元二次函数为: "+"  y="+a+"x*x+"+b+"x+"+c);
	}
}
