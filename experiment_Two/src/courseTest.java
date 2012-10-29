
import java.util.Scanner;

public class courseTest { //测试类
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    courseBook course=new courseBook();
		System.out.println("请输入课程类名称:(“1 : JAVA”或者“2 : JAVA EE ”)");
	    int i=in.nextInt();
	    System.out.println("教材信息如下: \n");
	    switch(i)
	    {
	  	      case 1: course.java_EE_Course();
	  		        break;
	  		   case 2: course.javaCourse();
	  		    	break;
	  		   default:System.out.println("没有该课程名！");
	  				break;
	    } 
	}
}
class Book { //教材类
	private String name;		//教材名；
	private String author;		//作者；
	private String publish;		//出版社；
	Book(String name,String author,String publish){
		this.name=name;
		this.author=author;
		this.publish=publish;
	}
	public void show(){
		System.out.println("教材名："+name+";作者:"+author+";出版社："+publish);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	
}
class Course {  //课程类
	private String courseName;
	Course(String courseName){
		this.courseName=courseName;	
	}
	public String getcourseName() {
		return courseName;
	}
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	public void show(){
		System.out.println("课程名为："+this.courseName);	
	}
}


 class courseBook {//为课程指定参考教材类
	public void java_EE_Course()
	{
		Book book1=new Book("java","叶乃文 王丹","机械工业出版社");
	    book1.show();
	}
	public void javaCourse(){
		Book book1=new Book("JAVA EE","黄开枝","清华大学出版社");
		book1.show();
	}
}

