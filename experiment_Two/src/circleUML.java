
class circleUML extends ellipse
{

	double x,y;//圆心坐标
	double r;//圆的半径
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
		 System.out.print("圆的面积:"+cr.getArea());
	}
}
class ellipse
{
	double m,n;  //椭圆 左焦点的坐标
	double p,q;  //椭圆右焦点的坐标
	double r;   // 椭圆上的点到两焦点距离之和 
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




