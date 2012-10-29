
import java.util.*;
public class countAvg {
	public static void main(String[] args) {
			ArrayList v=new ArrayList();
	    	enterVotes(v);
	    	System.out.println("其中最大的值为:"+maxVotes(v).intValue());
	    	System.out.println("其中最小的值为:"+minVotes(v));
	    	System.out.println("平均值为:"+avgVotes(v));
	    	System.out.println("大于平均值的整数个数:"+countMore(v));
	    	System.out.println("小于平均值的整数个数:"+countLess(v));
	}
	
	public static void enterVotes(ArrayList v){//输入整数
    	Scanner in= new Scanner(System.in);
    	System.out.println("从键盘输入若干个整数以0作为结束标志:");
    	int vote;
    	do{
    		vote=in.nextInt();
    		v.add(new Integer(vote));
    	}while(1<=vote&&vote!=0);
    }
	public static Integer maxVotes(ArrayList v){//求最大的整数
		Integer max=(Integer)v.get(0);
		Integer v_a,v_b;
		for(int i=0;i<v.size()-1;i++){
			v_a=(Integer)v.get(i+1);
			v_b=(Integer)v.get(i);
			if(v_a.intValue() > v_b.intValue()){
				max=v_a;
			}
		}
		return max;
	}
	public static Integer minVotes(ArrayList v){//求最小的整数
		Integer min=(Integer)v.get(0);
		for(int i=0;i<v.size()-2;i++){
			Integer v_a=(Integer)v.get(i+1),
					v_b=(Integer)v.get(i);
			if(v_a.intValue() < v_b.intValue()){
				min=v_a;
			}
		}
		return min;
	}
	public static double avgVotes(ArrayList v){//求平均数
		int sum=0;double avg;
		for(int i=0;i<v.size()-1;i++){
			sum+=((Integer)v.get(i)).intValue();
		}
		if((v.size()-1)!=0){
			avg=(double)sum/(v.size()-1);
		}else{
			avg=0;
		}
		return avg;
	}
    public static int countMore(ArrayList v){//统计大于平均值的整数个数
    	int sum=0,count=0;
    	double avg;
		for(int i=0;i<v.size()-1;i++){
			sum+=((Integer)v.get(i)).intValue();
		}
		if((v.size()-1)!=0){
			avg=(double)sum/(v.size()-1);
		}else{
			avg=0;
		}
		for(int i=0;i<v.size()-1;i++){
			int valueI=((Integer)v.get(i)).intValue();
			if(valueI>avg){
				count++;
			}
		}
    	return count;
    }
    public static int countLess(ArrayList v){//统计大于平均值的整数个数
    	int sum=0,count=0;
    	double avg;
		for(int i=0;i<v.size()-1;i++){
			sum+=((Integer)v.get(i)).intValue();
		}
		if((v.size()-1)!=0){
			avg=(double)sum/(v.size()-1);
		}else{
			avg=0;
		}
		for(int i=0;i<v.size()-1;i++){
			int valueI=((Integer)v.get(i)).intValue();
			if(valueI<avg){
				count++;
			}
		}
    	return count;
    }
}