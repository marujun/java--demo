
import java.util.*;
public class countChar {
	public static final int N=5;
	public static void main(String[] args) {
		String v=" ";
		Scanner in= new Scanner(System.in);
    	System.out.println("请输入一段短文(以~结束): ");
    	String a="";String b="~";
    	do{
    		a=in.next();
    		v+=a;
    	}while(a.equals(b)==false);
	     //v = v.toLowerCase() ;  //如果要统计不区分大小写的话 ，就统一转换为小写或者大写
	     int [] character = new int[256] ;
	     List<Character> list = new ArrayList<Character>() ;
	     char[] page = v.toCharArray();
	     for (char c : page) {   
	         if (character[c] == 0 && c!=',' && c!=' ' && c!='.' && c!='~'){
	             list.add(c) ;
	         }
	         character[c] =  character[c] + 1;   
	     }   
	    
	     char ch ;
	     for (int i = 0; i < list.size(); i++){
	         ch = (Character) list.get(i) ;
	         System.out.println(ch + " 出现次数:" + character[ch]) ;
	     }
	}
}