
import java.util.Scanner;

public class courseTest { //������
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    courseBook course=new courseBook();
		System.out.println("������γ�������:(��1 : JAVA�����ߡ�2 : JAVA EE ��)");
	    int i=in.nextInt();
	    System.out.println("�̲���Ϣ����: \n");
	    switch(i)
	    {
	  	      case 1: course.java_EE_Course();
	  		        break;
	  		   case 2: course.javaCourse();
	  		    	break;
	  		   default:System.out.println("û�иÿγ�����");
	  				break;
	    } 
	}
}
class Book { //�̲���
	private String name;		//�̲�����
	private String author;		//���ߣ�
	private String publish;		//�����磻
	Book(String name,String author,String publish){
		this.name=name;
		this.author=author;
		this.publish=publish;
	}
	public void show(){
		System.out.println("�̲�����"+name+";����:"+author+";�����磺"+publish);
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
class Course {  //�γ���
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
		System.out.println("�γ���Ϊ��"+this.courseName);	
	}
}


 class courseBook {//Ϊ�γ�ָ���ο��̲���
	public void java_EE_Course()
	{
		Book book1=new Book("java","Ҷ���� ����","��е��ҵ������");
	    book1.show();
	}
	public void javaCourse(){
		Book book1=new Book("JAVA EE","�ƿ�֦","�廪��ѧ������");
		book1.show();
	}
}

