import java.util.Scanner;

public class replaceOldWord_StringBuffer{
	public static StringBuffer articleBuffer=new StringBuffer();
	public static String article=" ",  newArticle=" ";
	public static int index=0;
	public static void main(String[] ss)
	{
		System.out.println("����������:");
		Scanner in=new Scanner(System.in);   
		articleBuffer.append(in.nextLine());
		System.out.println("����ԭʼ����:");
		in=new Scanner(System.in);
		article=in.nextLine();
		System.out.println("�����µ���:");
		newArticle=in.nextLine();
		System.out.println("���������Ϊ:"+articleBuffer+"\n"+
		                                 "ԭʼ����Ϊ:"+article+"\n"+
                                         "�µ���Ϊ:"+newArticle);
		replace(); //�滻����
		System.out.println("������Ϊ:\n"+articleBuffer);
			 
	}
	
	static void replace()
	{
	    int b;
		b=articleBuffer.indexOf(article, index);
		if(b==-1){
			System.out.println("������ľɵ����ڸ����²����ڣ�");
		}else{
			articleBuffer.delete(b,b+article.length());
			articleBuffer.insert(b,newArticle);
		}
	}	
}