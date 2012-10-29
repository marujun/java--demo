import java.util.Scanner;

public class rationalNumberTest {
	public static void main(String[] args) {
		rationalNumber r=new rationalNumber();
		Scanner in=new Scanner(System.in);
		System.out.println("请输入分子：");
		int a=in.nextInt();
		r.setFenzi(a);
		System.out.println("请输入分母：");
		int b=in.nextInt();
		r.setFenmu(b);
		if(r.jisuanMaxDivisor(r.getFenzi(),r.getFenmu())==1){//
			System.out.println("您输入的有理数为"+r.getFenzi()+"/"+r.getFenmu());
		}
		else{
			System.out.println("没化简前的有理数："+r.getFenzi()+"/"+r.getFenmu());
			r.jisuanRationalNumber(r.getFenzi(), r.getFenmu());
		}

	}

}


class rationalNumber {//一切有理数都可以转化成分数的形式；
	private int fenzi;
	private int fenmu;
	public int getFenzi() {
		return fenzi;
	}
	public void setFenzi(int fenzi) {
		this.fenzi = fenzi;
	}
	public int getFenmu() {
		return fenmu;
	}
	public void setFenmu(int fenmu) {
		this.fenmu = fenmu;
	}
	
	public int jisuanMaxDivisor(int a,int b){//计算分子分母的最大公约数；分子a,分母b;
		int common;//定义最大公约数；
		if(a>b){
			common=b;
		}
		else
			common=a;
		while(a%common!=0||b%common!=0){
			common--;	
		}
		return common;//得大的最大公约数；
	}
	
	public void jisuanRationalNumber(int a,int b){
		int common=this.jisuanMaxDivisor(a, b);//最大公约数；
		a=a/common;
		b=b/common;
		System.out.println("化简后的有理数为："+a+"/"+b);
	}

}
