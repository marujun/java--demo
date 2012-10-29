import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat; 

public class taskSecond{
	static String filePath="就业统计.txt";
	public static void main(String[] args){
		int name,num,birth,point,diretion;
		Random tmp = new Random();
		String recordStr="";
		//因为写入文件时有中文所以换行符写成"\r\n"
		recordStr="学号: "+tmp.nextInt(100000000)+"\r\n"
		                   +"姓名: "+randomStr(1,5)+"\r\n"
		                   +"出生日期: "+tmp.nextInt(2000)+"年"+tmp.nextInt(12)+"月"+tmp.nextInt(30)+"日"+"\r\n"
		                   +"目前绩点: "+ (float)(Math.round(tmp.nextFloat()*4*100))/100+"\r\n"
		                   +"就业去向:"+randomStr(3,5)+"\r\n"
		                   +"                                                                                                                    "
		                   +"打印日期: "+currentTime();
		writeFile(filePath,recordStr);
		System.out.println(readFile(filePath));
	}
	public static void writeFile(String path,String v){//写文件
		RandomAccessFile rf;
	     try{
	       rf=new RandomAccessFile(path,"rw");
	       rf. seek(rf.length()); 
	     //避免写入中文时出现乱码
	       rf.write(("\r\n"+v).getBytes("UTF-8"));  
	       System.out.println("已写入文件 : "+path);
	       rf.close();
	   } catch(Exception e){
	       System.out.println("  errores");
		   System.exit(0);  
	  }   
	}
	public static String readFile(String path){//读取文件
		String st = "";
		try{
			InputStream inputStream = new FileInputStream(path);
			// txt文件是UTF-8编码存储的.
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String temp = null;
			while ((temp = bufferedReader.readLine()) != null) {
			   st+=(temp+"\n");
			}
		}catch(Exception e){
		       System.out.println("read file  errores");
			   System.exit(0);  
		  }
		return st;   
	}
	public static String  currentTime(){//获取系统当前时间
//      第一种方法:
		Calendar currentDate=Calendar.getInstance();
		String dateStr=currentDate.get(Calendar.YEAR)+"年"+currentDate.get(Calendar.MONTH)+"月"+currentDate.get(Calendar.DAY_OF_MONTH)+"日"+currentDate.get(Calendar.HOUR)+":"+currentDate.get(Calendar.MINUTE)+":"+currentDate.get(Calendar.SECOND);
//       第二种方法:
//        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); 
//        System.out.println("现在时间是:"+dateStr); 
        return dateStr;
	}
    public static String  randomStr(int num,int wordNum){//产生随机字符串
//num 为产生的单词数 ，wordNum为每个单词含有的字符数
    	String tmpStr="";
    	for(int i=0;i<num;i++){
    		String word="";
    		for(int j=0;j<wordNum;j++){
            	char tmpRandom=(char)('a'+Math.random()*('z'-'a'+1));
            	word+=tmpRandom;
        	}
    		tmpStr+=(word+"  ");
    	}
    	return tmpStr;
    }
}