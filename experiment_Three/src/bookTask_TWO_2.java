import java.util.*;
public class bookTask_TWO_2{
	public static void main(String[] args){
		TreeSet<Integer> tree=new TreeSet<Integer>();
		for(int i=0;i<10;i++){
			Integer data=new Integer(10-i);//����˳����10��9��8��7 ..........
			tree.add(data);
		}
		Iterator<Integer> it=tree.iterator();
		while(it.hasNext()){
			int b=it.next();//˳�����tree���������
			String a = null;
			switch(b){
			   case 1:a="��";break;
			   case 2:a="��";break;
			   case 3:a="�";break;
			   case 4:a="��";break;
			   case 5:a="��";break;
			   case 6:a="̼";break;
			   case 7:a="��";break;
			   case 8:a="��";break;
			   case 9:a="��";break;
			   case 10:a="��";break;
			}
			 System.out.print(b+":"+a+" ");  
		}
	}
}