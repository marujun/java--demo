import java.util.*;
import java.io.*;
public class taskFirst{
	static String filePath="testl.txt";
	public static void main(String[] args){
		String fileTxt="",sortedStr;
		System.out.println("��������Ҫд���ļ������ݣ�");
	    Scanner in=new Scanner(System.in);
	    String v=in.nextLine();
		writeFile(filePath,v);
		fileTxt=readFile(filePath);
		System.out.println("�ļ��������"+fileTxt);
		sortedStr=sort(fileTxt);
		writeFile("test2.txt",sortedStr);
	}
	public static void writeFile(String path,String v){
		RandomAccessFile rf;
	     try{
	       rf=new RandomAccessFile(path,"rw");
	       rf. seek(rf.length()); 
	       rf.writeBytes("\n "+v); 
	       System.out.println("��д���ļ�"+path);
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
	    tmp = str.split("[\\s]+|[\\.]+|[\\,]+");//�ö��ţ��ո񣬾�ŷָ���
	    Arrays.sort(tmp);//����
	    for (String c : tmp) {
	    	boolean tf= c.equals(tmpStr);
	    	tmpStr=c;
	    	sortedStr+=(c+" ");
	     }  
	    System.out.println("����֮��"+sortedStr);
		return sortedStr;
	}
}