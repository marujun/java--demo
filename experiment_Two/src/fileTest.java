
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
		System.out.print("创建文件成功！");
		output();
	}
	void changeName(String newName)
	{
		this.fileName=newName;
		this.modifiDate=new Date();
		System.out.print("文件信息已被修改，修改之后"+"\n");
		output();
	}
	void output()
	{
		System.out.print("文件信息如下:"+
				                      "文件名:"+this.fileName+"\n"+
	                                  "大小:"+this.size+"\n"+
				                      "创建日期:"+ this.creatDate+"\n"+
	                                  "最近修改日期:"+this.modifiDate+"\n"+"\n");
	}
}