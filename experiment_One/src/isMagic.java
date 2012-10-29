
import java.util.*;
public class isMagic {
	public static final int N=5;
	public static void main(String[] args) {
		    int[][] v=new int[N][N];
	    	enterMagic(v);
	    	System.out.println("是否为魔方阵:"+judgeMagic(v));
	}
	
	public static void enterMagic(int[][] v){//输入一个N次方的二维数组
		Scanner in= new Scanner(System.in);
    	System.out.println("请输入输入一个"+N+"x"+N+"的阵列:");
    	int value;
    	for(int i=0;i<N;i++){
    		for(int j=0;j<N;j++){
    			value=in.nextInt();
    			v[i][j]=value;
    		}
    	}
	}
	public static boolean judgeMagic(int[][] v){//判断是否为魔方阵
		int s=0;//第一行的和
		for(int i=0;i<N;i++){
			s+=v[0][i];
		}
		for(int i=1;i<N;i++){//从第二行开始判断每一行的和是否和第一行相等
			int rows=0;//每一行的和
			for(int j=0;j<N;j++){
				rows+=v[i][j];
			}
			if(rows!=s){
				return false;
			}
		}
		int slash=0,backlash=0;//判断斜线是否相等
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