
import java.util.*;
public class countExamResult {
	public static final int N=29;
	public static void main(String[] args) {
		    int[] v=new int[N];
	    	enterVotes(v);
	    	failTest(v);
	    	
	}
	
	public static void enterVotes(int[] v){//输入学生的成绩
    	Scanner in= new Scanner(System.in);
    	System.out.println("从键盘依次输入"+N+"名学生的成绩:");
    	int vote;
    	for(int i=0;i<N;i++){
    		vote=in.nextInt();
    		v[i]=vote;
    	}
    }
	public static void failTest(int[] v){//排序并统计不及格的人数
		Arrays.sort(v);
		int fail=0;
		for(int element : v){
			System.out.printf("%6d",element);
			if(element<60){
				fail++;
			}
		}
		System.out.println("\n不及格的人数为："+fail);
	}
}