
import java.util.Date;

public  class fileTest{
	public static void main(String[] ss)
	{
		fileClass testFile=new fileClass("test.txt","1kb");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testFile.changeName("change.txt");
		testFile.output();
	}
}
class fileClass{
	String fileName;
	String size;
	Date creatDate=null;
	Date modifiDate=null;
	fileClass(String fileName,String size)
	{
		this.fileName=fileName;
		this.size=size;
		this.creatDate=new Date();
		this.modifiDate=this.creatDate;
		System.out.print("�����ļ��ɹ���");
		output();
	}
	void changeName(String newName)
	{
		this.fileName=newName;
		this.modifiDate=new Date();
		System.out.print("�ļ���Ϣ�ѱ��޸ģ��޸�֮��"+"\n");
		output();
	}
	void output()
	{
		System.out.print("�ļ���Ϣ����:"+
				                      "�ļ���:"+this.fileName+"\n"+
	                                  "��С:"+this.size+"\n"+
				                      "��������:"+ this.creatDate+"\n"+
	                                  "����޸�����:"+this.modifiDate+"\n"+"\n");
	}
}