//4）	设计一个程序，实现人民币和美元、港币、欧元、英镑的转换。要求在文本框中输入人民币值，
//选择外币类型，在另一文本框中输入汇率后，自动在第3个文本框中显示兑换结果。


import java.awt.event.*;
import javax.swing.*;
public class four extends JFrame implements ActionListener{
	private JTextField text1=new JTextField(5);
	private JTextField text2=new JTextField(5);
	private  JLabel text3= new JLabel();
	private String s[]={"美元 ","港币","欧元","英镑"};
	private JComboBox cb=new JComboBox(s);
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private double sum,sum1;		

	JLabel num=new JLabel("人民币: ");
	JLabel rate=new JLabel("汇率: ");
	JLabel bmoney=new JLabel("兑换至: ");
	JLabel bnum=new JLabel("兑换后的金额为");
	JButton button =new JButton("兑换");

	public void init(){
		p1.add(num);   p1.add(text1);
		p1.add(bmoney);p1.add(cb);
		p1.add(rate);p1.add(text2);
		p1.add(bnum);p1.add(text3);
		p2.add(button);
		getContentPane().add(p1,"Center");
		 getContentPane().add(p2,"South");
		 setVisible(true);
//		 setResizable(false);
		 setSize(600,150);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String txt1=text1.getText();
		sum=Double.valueOf(txt1);
		String rate=text2.getText();
		if(sum>0){
			sum1=sum/Double.valueOf(rate);
			text3.setText(String.valueOf(sum1));
		}else{
			text3.setText("你输入的金额错误");
		}
	}
	public static void main(String args[]){
		four frame=new four();
		frame.init();
	}
}