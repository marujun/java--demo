
import java.util.*;
public class countWord {
	public static final int N=5;
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String v;
    	System.out.println("������һ�仰���س�������:");
    	v=in.nextLine();
	    System.out.println("���ʵĸ���Ϊ:"+countWord(v));
	}
	
	public static int countWord(String v){//ͳ�Ƶ��ʵĸ���
	    String[] tmp = null;
	    tmp = v.split("[\\s]+|[\\.]+|[\\,]+");//�ö��ţ��ո񣬾�ŷָ���
		return tmp.length;
	}
}