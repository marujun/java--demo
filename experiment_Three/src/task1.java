//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
public class task1{
	public static void main(String[] args){
		System.out.println("«Î ‰»Î“ªæ‰ª∞£∫");
		String v=" ";
        Scanner in=new Scanner(System.in);
        v=in.next();
        String last="";
//	    List<Character> list = new ArrayList<Character>() ;
	    char[] page = v.toCharArray();
	    for (char c : page) {  
	    	if('0'<=c && c<='9'){
//	    		list.add(c) ;
	    		last+=c;
	    	}
	     }  
	     System.out.println("last: "+last);  
	}
}