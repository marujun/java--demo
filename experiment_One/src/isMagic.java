
import java.util.*;
public class isMagic {
	public static final int N=5;
	public static void main(String[] args) {
		    int[][] v=new int[N][N];
	    	enterMagic(v);
	    	System.out.println("�Ƿ�Ϊħ����:"+judgeMagic(v));
	}
	
	public static void enterMagic(int[][] v){//����һ��N�η��Ķ�ά����
		Scanner in= new Scanner(System.in);
    	System.out.println("����������һ��"+N+"x"+N+"������:");
    	int value;
    	for(int i=0;i<N;i++){
    		for(int j=0;j<N;j++){
    			value=in.nextInt();
    			v[i][j]=value;
    		}
    	}
	}
	public static boolean judgeMagic(int[][] v){//�ж��Ƿ�Ϊħ����
		int s=0;//��һ�еĺ�
		for(int i=0;i<N;i++){
			s+=v[0][i];
		}
		for(int i=1;i<N;i++){//�ӵڶ��п�ʼ�ж�ÿһ�еĺ��Ƿ�͵�һ�����
			int rows=0;//ÿһ�еĺ�
			for(int j=0;j<N;j++){
				rows+=v[i][j];
			}
			if(rows!=s){
				return false;
			}
		}
		int slash=0,backlash=0;//�ж�б���Ƿ����
		for(int i=0;i<N;i++){
			slash+=v[i][i];
		}
		if(slash!=s){
			return false;
		}
		for(int i=0;i<N;i++){
			backlash+=v[i][N-i-1];
		}
		if(backlash!=s){
			return false;
		}
		return true;
	}
}