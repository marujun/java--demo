
class circleUML extends ellipse
{

	double x,y;//Բ������
	double r;//Բ�İ뾶
	double area;
	circleUML(double myX,double myY,double myR,double m, double n, double p, double q,  double r) {
		super(m,n, p, q,  r);
		this.x=myX;
		this.y=myY;
		this.r=myR;
	}
	double getArea()
	{
		area=3.1415*r*r;
		return area;
	}
	public static void main(String args[]){
		circleUML cr=new circleUML(4,5,7,6,9,2,2,3);
		 System.out.print("Բ�����:"+cr.getArea());
	}
}
class ellipse
{
	double m,n;  //��Բ �󽹵������
	double p,q;  //��Բ�ҽ��������
	double r;   // ��Բ�ϵĵ㵽���������֮�� 
	ellipse(double m,double n,double p,double q,double r)
	{
		this.m=m;
		this.n=n;
		this.p=p;
		this.q=q;
		this.r=r;
	}
	double getM()
	{
		return m;}
	
	double getN()
	{
		return n;}
	
	double getP()
	{
		return p;}
	
	double getQ()
	{
		return q;}
	
	double getR()
	{
		return r;}
	
}




