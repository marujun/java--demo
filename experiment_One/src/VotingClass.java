
 import java.util.*;
public class VotingClass {
	
    public static final int N=20;
    public static void main(String[] args) {
        int[] v=new int[N];
        enterVotes(v);
        printVotes(v);
        int most=statistics(v);
        if(v[most-1]>=10){
        	System.out.println("投票有效,"+ most+"号选手当选学生会主席");//显示最终获胜者
        }else{
        	System.out.println("未超半数，选举无效。");//提示选取无效
        }
    }
    public static void enterVotes(int[] v){//输入每张选票
    	Scanner in= new Scanner(System.in);
    	System.out.println("请输入投票总人数: ");
    	int sum,count=0;
    	sum=in.nextInt();
    	int vote;
    	for (int i=0;i<N;i++){
    		v[i]=0;
    	}System.out.println("请输入支持选手的编号(当输入的值大于20时将不再允许输入):");//显示输入提示信息
    	do{
    		vote=in.nextInt();
    		count++;//统计已投票的人数
    		if(1<=vote && vote<=N){
    			v[vote-1]++;
    		}
    		if(count>=sum){//判断输入的次数是否达到投票人数，如果达到则退出
    			break;
    		}
    	}while(1<=vote&&vote<=N);
    }
    public static void printVotes(int[]v){//显示每位候选人获选票情况
    	System.out.print("1-"+N+"号选手的得票情况:( ");
    	for (int i=0;i<N;i++){
    		if(i!=N-1){
    			System.out.print(v[i]+",");
    		}else{
    			System.out.print(v[i]);
    		}
    	}
    	System.out.print(" )\n");
    }
    public static int statistics(int[]v){//统计最终获胜者
    	int index=0;
    	for (int i=1;i<N;i++){
    		if(v[i]>v[index]){
    			index=i;
    		}
    	}
    	return index+1;
    }
    
}
