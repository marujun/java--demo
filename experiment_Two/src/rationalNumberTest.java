import java.util.Scanner;

public class rationalNumberTest {
	public static void main(String[] args) {
		rationalNumber r=new rationalNumber();
		Scanner in=new Scanner(System.in);
		System.out.println("��������ӣ�");
		int a=in.nextInt();
		r.setFenzi(a);
		System.out.println("�������ĸ��");
		int b=in.nextInt();
		r.setFenmu(b);
		if(r.jisuanMaxDivisor(r.getFenzi(),r.getFenmu())==1){//
			System.out.println("�������������Ϊ"+r.getFenzi()+"/"+r.getFenmu());
		}
		else{
			System.out.println("û����ǰ����������"+r.getFenzi()+"/"+r.getFenmu());
			r.jisuanRationalNumber(r.getFenzi(), r.getFenmu());
		}

	}

}


class rationalNumber {//һ��������������ת���ɷ�������ʽ��
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
	
	public int jisuanMaxDivisor(int a,int b){//������ӷ�ĸ�����Լ��������a,��ĸb;
		int common;//�������Լ����
		if(a>b){
			common=b;
		}
		else
			common=a;
		while(a%common!=0||b%common!=0){
			common--;	
		}
		return common;//�ô�����Լ����
	}
	
	public void jisuanRationalNumber(int a,int b){
		int common=this.jisuanMaxDivisor(a, b);//���Լ����
		a=a/common;
		b=b/common;
		System.out.println("������������Ϊ��"+a+"/"+b);
	}

}
