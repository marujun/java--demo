public class Account{
	protected String accountName="user",account="0000 0000 0000 0000";
	protected float balance=0;
	Account(String accountName,String account,float balance){
		this.accountName=accountName;
		this.account=account;
		this.balance=balance;
	}
	public void query(){
		System.out.print("用户:"+accountName+"\n账户余额为:  "+balance+"\n");
	}
	public void drawMoney(float money){
		if(balance>=money){
		      balance -=money;
		      System.out.print("用户:"+accountName+"\n本次取款金额为: "+money+"\n账户余额为:"+balance+"\n");
		}else{
			System.out.print("用户:"+accountName+"\n账户金额不足!\n账户余额为:  "+balance+"\n请重新输入!\n");
		}
	}
	public void deposit(float money){
		balance +=money;
		  System.out.print("用户:"+accountName+"\n本次存款金额为: "+money+"\n账户余额为:"+balance+"\n");
	}
	public static void main(String args[]){
		Account zhangSan=new Account("zhangSan","6222 0000 0000 0000",100);
		zhangSan.query();
		zhangSan.deposit(1000);
		zhangSan.drawMoney(200);
	}
}