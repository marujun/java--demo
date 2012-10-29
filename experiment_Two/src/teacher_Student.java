
class teacher
{
	String no, name, sex, birth, job, data;
	teacher(String no,String name, String sex,String birth,String job,String data)
	{
		this.no=no;
		this.name=name;
		this.sex=sex;
		this.birth=birth;
		this.job=job;
		this.data=data;
	}
}

class student extends teacher
{
	String tie, registerInfomation;
	student(String tie,String registerInfomation,String no, String name, String sex, String birth, String job,String data) {
		super(no, name, sex, birth, job, data);
		this.tie=tie;
		this.registerInfomation=registerInfomation;
	}
}