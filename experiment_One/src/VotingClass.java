
 import java.util.*;
public class VotingClass {
	
    public static final int N=20;
    public static void main(String[] args) {
        int[] v=new int[N];
        enterVotes(v);
        printVotes(v);
        int most=statistics(v);
        if(v[most-1]>=10){
        	System.out.println("ͶƱ��Ч,"+ most+"��ѡ�ֵ�ѡѧ������ϯ");//��ʾ���ջ�ʤ��
        }else{
        	System.out.println("δ��������ѡ����Ч��");//��ʾѡȡ��Ч
        }
    }
    public static void enterVotes(int[] v){//����ÿ��ѡƱ
    	Scanner in= new Scanner(System.in);
    	System.out.println("������ͶƱ������: ");
    	int sum,count=0;
    	sum=in.nextInt();
    	int vote;
    	for (int i=0;i<N;i++){
    		v[i]=0;
    	}System.out.println("������֧��ѡ�ֵı��(�������ֵ����20ʱ��������������):");//��ʾ������ʾ��Ϣ
    	do{
    		vote=in.nextInt();
    		count++;//ͳ����ͶƱ������
    		if(1<=vote && vote<=N){
    			v[vote-1]++;
    		}
    		if(count>=sum){//�ж�����Ĵ����Ƿ�ﵽͶƱ����������ﵽ���˳�
    			break;
    		}
    	}while(1<=vote&&vote<=N);
    }
    public static void printVotes(int[]v){//��ʾÿλ��ѡ�˻�ѡƱ���
    	System.out.print("1-"+N+"��ѡ�ֵĵ�Ʊ���:( ");
    	for (int i=0;i<N;i++){
    		if(i!=N-1){
    			System.out.print(v[i]+",");
    		}else{
    			System.out.print(v[i]);
    		}
    	}
    	System.out.print(" )\n");
    }
    public static int statistics(int[]v){//ͳ�����ջ�ʤ��
    	int index=0;
    	for (int i=1;i<N;i++){
    		if(v[i]>v[index]){
    			index=i;
    		}
    	}
    	return index+1;
    }
    
}
