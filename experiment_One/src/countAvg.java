
import java.util.*;
public class countAvg {
	public static void main(String[] args) {
			ArrayList v=new ArrayList();
	    	enterVotes(v);
	    	System.out.println("��������ֵΪ:"+maxVotes(v).intValue());
	    	System.out.println("������С��ֵΪ:"+minVotes(v));
	    	System.out.println("ƽ��ֵΪ:"+avgVotes(v));
	    	System.out.println("����ƽ��ֵ����������:"+countMore(v));
	    	System.out.println("С��ƽ��ֵ����������:"+countLess(v));
	}
	
	public static void enterVotes(ArrayList v){//��������
    	Scanner in= new Scanner(System.in);
    	System.out.println("�Ӽ����������ɸ�������0��Ϊ������־:");
    	int vote;
    	do{
    		vote=in.nextInt();
    		v.add(new Integer(vote));
    	}while(1<=vote&&vote!=0);
    }
	public static Integer maxVotes(ArrayList v){//����������
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
	public static Integer minVotes(ArrayList v){//����С������
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
	public static double avgVotes(ArrayList v){//��ƽ����
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
    public static int countMore(ArrayList v){//ͳ�ƴ���ƽ��ֵ����������
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
    public static int countLess(ArrayList v){//ͳ�ƴ���ƽ��ֵ����������
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