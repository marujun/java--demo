
import java.util.*;
public class countExamResult {
	public static final int N=29;
	public static void main(String[] args) {
		    int[] v=new int[N];
	    	enterVotes(v);
	    	failTest(v);
	    	
	}
	
	public static void enterVotes(int[] v){//����ѧ���ĳɼ�
    	Scanner in= new Scanner(System.in);
    	System.out.println("�Ӽ�����������"+N+"��ѧ���ĳɼ�:");
    	int vote;
    	for(int i=0;i<N;i++){
    		vote=in.nextInt();
    		v[i]=vote;
    	}
    }
	public static void failTest(int[] v){//����ͳ�Ʋ����������
		Arrays.sort(v);
		int fail=0;
		for(int element : v){
			System.out.printf("%6d",element);
			if(element<60){
				fail++;
			}
		}
		System.out.println("\n�����������Ϊ��"+fail);
	}
}