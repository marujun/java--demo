import java.util.*;
import java.io.*;
public class taskFirst{
	static String filePath="testl.txt";
	public static void main(String[] args){
		String fileTxt="",sortedStr;
		System.out.println("请输入需要写入文件的内容：");
	    Scanner in=new Scanner(System.in);
	    String v=in.nextLine();
		writeFile(filePath,v);
		fileTxt=readFile(filePath);
		System.out.println("文件里的内容"+fileTxt);
		sortedStr=sort(fileTxt);
		writeFile("test2.txt",sortedStr);
	}
	public static void writeFile(String path,String v){
		RandomAccessFile rf;
	     try{
	       rf=new RandomAccessFile(path,"rw");
	       rf. seek(rf.length()); 
	       rf.writeBytes("\n "+v); 
	       System.out.println("已写入文件"+path);
	       rf.close();
	   } catch(Exception e){
	       System.out.println("  errores");
		   System.exit(0);  
	  }   
	}
	public static String readFile(String path){
		String st = "";
		try{
			   RandomAccessFile rf;
		       String in;
		       rf=new RandomAccessFile(path,"rw");
		       while(rf.read()!=-1)
		       { 
		    	   in=new String(rf.readLine());
		           st+=(in+" ");
		       }
		}catch(Exception e){
		       System.out.println("read file  errores");
			   System.exit(0);  
		  }
		return st;   
	}
	public static String sort(String str){
		String sortedStr="",tmpStr="";
		String[] tmp = null;
	    tmp = str.split("[\\s]+|[\\.]+|[\\,]+");//用逗号，空格，句号分隔开
	    Arrays.sort(tmp);//排序
	    for (String c : tmp) {
	    	boolean tf= c.equals(tmpStr);
	    	tmpStr=c;
	    	sortedStr+=(c+" ");
	     }  
	    System.out.println("归类之后："+sortedStr);
		return sortedStr;
	}
}