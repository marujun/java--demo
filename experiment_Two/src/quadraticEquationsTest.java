import java.util.*;

public class quadraticEquationsTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		quadraticEquations f=new quadraticEquations();
		while(true){
		System.out.println("�����������ϵ����");
		double a=in.nextDouble();
		f.setA(a);
		if(f.getA()!=0){
			break;
		}
		else
			System.out.println("���������롣������ϵ������Ϊ0��");
		}
		System.out.println("������һ����ϵ����");
		double b=in.nextDouble();
		f.setB(b);
		System.out.println("�����볣���");
		double c=in.nextDouble();
		f.setC(c);
		f.creatFunction();
		f.calculate();
	}

}

 class quadraticEquations {
	private double a=1;//������ϵ��
	private double b;//һ����ϵ��
	private double c;//����
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
    
	public void calculate(){//����һԪ���η������ֵ
		if((b*b-4*a*c)>0){
			x1=((-b)+Math.sqrt(b*b-4*a*c))/2*a;
			x2=((-b)-Math.sqrt(b*b-4*a*c))/2*a;
			System.out.println("������Ϊ��"+x1+"\t"+x2);
		}else{
			System.out.println("�˷����޽⣡");
		}	
	}
    
	public void creatFunction(){
		System.out.println("�������һԪ���κ���Ϊ: "+"  y="+a+"x*x+"+b+"x+"+c);
	}
}
