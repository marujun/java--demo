import java.util.Scanner;

public class replaceOldWord_StringBuffer{
	public static StringBuffer articleBuffer=new StringBuffer();
	public static String article=" ",  newArticle=" ";
	public static int index=0;
	public static void main(String[] ss)
	{
		System.out.println("请输入文章:");
		Scanner in=new Scanner(System.in);   
		articleBuffer.append(in.nextLine());
		System.out.println("输入原始单词:");
		in=new Scanner(System.in);
		article=in.nextLine();
		System.out.println("输入新单词:");
		newArticle=in.nextLine();
		System.out.println("输入的文章为:"+articleBuffer+"\n"+
		                                 "原始单词为:"+article+"\n"+
                                         "新单词为:"+newArticle);
		replace(); //替换单词
		System.out.println("新文章为:\n"+articleBuffer);
			 
	}
	
	static void replace()
	{
	    int b;
		b=articleBuffer.indexOf(article, index);
		if(b==-1){
			System.out.println("您输入的旧单词在该文章不存在！");
		}else{
			articleBuffer.delete(b,b+article.length());
			articleBuffer.insert(b,newArticle);
		}
	}	
}