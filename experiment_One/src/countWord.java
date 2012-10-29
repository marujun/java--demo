
import java.util.*;
public class countWord {
	public static final int N=5;
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String v;
    	System.out.println("请输入一句话按回车键结束:");
    	v=in.nextLine();
	    System.out.println("单词的个数为:"+countWord(v));
	}
	
	public static int countWord(String v){//统计单词的个数
	    String[] tmp = null;
	    tmp = v.split("[\\s]+|[\\.]+|[\\,]+");//用逗号，空格，句号分隔开
		return tmp.length;
	}
}