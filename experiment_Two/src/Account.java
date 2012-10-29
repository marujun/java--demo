public class Account{
	protected String accountName="user",account="0000 0000 0000 0000";
	protected float balance=0;
	Account(String accountName,String account,float balance){
		this.accountName=accountName;
		this.account=account;
		this.balance=balance;
	}
	public void query(){
		System.out.print("�û�:"+accountName+"\n�˻����Ϊ:  "+balance+"\n");
	}
	public void drawMoney(float money){
		if(balance>=money){
		      balance -=money;
		      System.out.print("�û�:"+accountName+"\n����ȡ����Ϊ: "+money+"\n�˻����Ϊ:"+balance+"\n");
		}else{
			System.out.print("�û�:"+accountName+"\n�˻�����!\n�˻����Ϊ:  "+balance+"\n����������!\n");
		}
	}
	public void deposit(float money){
		balance +=money;
		  System.out.print("�û�:"+accountName+"\n���δ����Ϊ: "+money+"\n�˻����Ϊ:"+balance+"\n");
	}
	public static void main(String args[]){
		Account zhangSan=new Account("zhangSan","6222 0000 0000 0000",100);
		zhangSan.query();
		zhangSan.deposit(1000);
		zhangSan.drawMoney(200);
	}
}