import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat; 

public class taskSecond{
	static String filePath="��ҵͳ��.txt";
	public static void main(String[] args){
		int name,num,birth,point,diretion;
		Random tmp = new Random();
		String recordStr="";
		//��Ϊд���ļ�ʱ���������Ի��з�д��"\r\n"
		recordStr="ѧ��: "+tmp.nextInt(100000000)+"\r\n"
		                   +"����: "+randomStr(1,5)+"\r\n"
		                   +"��������: "+tmp.nextInt(2000)+"��"+tmp.nextInt(12)+"��"+tmp.nextInt(30)+"��"+"\r\n"
		                   +"Ŀǰ����: "+ (float)(Math.round(tmp.nextFloat()*4*100))/100+"\r\n"
		                   +"��ҵȥ��:"+randomStr(3,5)+"\r\n"
		                   +"                                                                                                                    "
		                   +"��ӡ����: "+currentTime();
		writeFile(filePath,recordStr);
		System.out.println(readFile(filePath));
	}
	public static void writeFile(String path,String v){//д�ļ�
		RandomAccessFile rf;
	     try{
	       rf=new RandomAccessFile(path,"rw");
	       rf. seek(rf.length()); 
	     //����д������ʱ��������
	       rf.write(("\r\n"+v).getBytes("UTF-8"));  
	       System.out.println("��д���ļ� : "+path);
	       rf.close();
	   } catch(Exception e){
	       System.out.println("  errores");
		   System.exit(0);  
	  }   
	}
	public static String readFile(String path){//��ȡ�ļ�
		String st = "";
		try{
			InputStream inputStream = new FileInputStream(path);
			// txt�ļ���UTF-8����洢��.
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
	public static String  currentTime(){//��ȡϵͳ��ǰʱ��
//      ��һ�ַ���:
		Calendar currentDate=Calendar.getInstance();
		String dateStr=currentDate.get(Calendar.YEAR)+"��"+currentDate.get(Calendar.MONTH)+"��"+currentDate.get(Calendar.DAY_OF_MONTH)+"��"+currentDate.get(Calendar.HOUR)+":"+currentDate.get(Calendar.MINUTE)+":"+currentDate.get(Calendar.SECOND);
//       �ڶ��ַ���:
//        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); 
//        System.out.println("����ʱ����:"+dateStr); 
        return dateStr;
	}
    public static String  randomStr(int num,int wordNum){//��������ַ���
//num Ϊ�����ĵ����� ��wordNumΪÿ�����ʺ��е��ַ���
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