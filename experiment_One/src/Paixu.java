

import java.util.*;
public class Paixu {
    
    public static void main(String[] args) {
    	int a[]=new int[3];
    	Scanner in=new Scanner(System.in);
    	System.out.print("����������3�������ÿո�������֣����س���������ʼ����:");
    	a[0]=in.nextInt();
		a[1]=in.nextInt();
		a[2]=in.nextInt();
		Arrays.sort(a);
		System.out.print("����֮��Ľ��Ϊ:"+a[0]+" "+a[1]+" "+a[2]);
    }
}
