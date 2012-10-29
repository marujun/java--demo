import java.util.*;
public class bookTask_TWO_2{
	public static void main(String[] args){
		TreeSet<Integer> tree=new TreeSet<Integer>();
		for(int i=0;i<10;i++){
			Integer data=new Integer(10-i);//²åÈëË³ĞòÊÇ10£¬9£¬8£¬7 ..........
			tree.add(data);
		}
		Iterator<Integer> it=tree.iterator();
		while(it.hasNext()){
			int b=it.next();//Ë³ĞòÊä³ötreeÀïÃæµÄÊı¾İ
			String a = null;
			switch(b){
			   case 1:a="Çâ";break;
			   case 2:a="º¤";break;
			   case 3:a="ï®";break;
			   case 4:a="îë";break;
			   case 5:a="Åğ";break;
			   case 6:a="Ì¼";break;
			   case 7:a="µª";break;
			   case 8:a="Ñõ";break;
			   case 9:a="·ú";break;
			   case 10:a="ÄÊ";break;
			}
			 System.out.print(b+":"+a+" ");  
		}
	}
}