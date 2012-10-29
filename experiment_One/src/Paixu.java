

import java.util.*;
public class Paixu {
    
    public static void main(String[] args) {
    	int a[]=new int[3];
    	Scanner in=new Scanner(System.in);
    	System.out.print("请依次输入3个数，用空格隔开数字，按回车键结束开始排序:");
    	a[0]=in.nextInt();
		a[1]=in.nextInt();
		a[2]=in.nextInt();
		Arrays.sort(a);
		System.out.print("排序之后的结果为:"+a[0]+" "+a[1]+" "+a[2]);
    }
}
