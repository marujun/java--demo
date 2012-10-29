//3）	设计2个文本区组件，当在一个文本区中输入若干个数时，另一个文本区同时对你输入的数进行求和运算
//       并求出平均值，也就是说随着你输入的变化，另一个文本区不断地更新求和及平均值。

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class three extends JFrame implements ActionListener{
	JButton calculator, exitbutton;
	JPanel panel1, panel2,panel3;
	JTextArea text1,text2;
	JLabel label1,label2;
	StringBuffer strBuffer;
	public three()
	{
		super("three");
		calculator=new JButton("计算");
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		label1=new JLabel("输入:");
		label2=new JLabel("结果 :");
		strBuffer=new StringBuffer();
		getContentPane().add(panel1,"North");
		getContentPane().add(panel2,"Center");
		getContentPane().add(panel3,"South");
		text1=new JTextArea(10,15);
		text2=new JTextArea(10,15);
		panel1.add(label1);
		panel1.add(text1);
		panel2.add(label2);
		panel2.add(text2);
		panel3.add(calculator);
		text2.append("输入的数之间用','或空格分开\n");
		setSize(400,500);
		setVisible(true);
		setResizable(false);
		calculator.addActionListener((ActionListener) this);		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==calculator)
		{
			double sum=0;
			double avg=0;
			int num=0;
			String rr=text1.getText();
		    String[] tmp = null;
		    tmp = rr.split("[\\s]+|[\\,]+");
		    num=tmp.length;
		    for(int i=0;i<num;i++){
		    	sum+=Double.valueOf(tmp[i]);
		    }
			avg=sum/num;
			text2.append("输入的数:\n和:  "+sum+"\n平均值:  "+avg);
		}
	}
	public static void  main(String[] ss)
	{
		three frame=new three();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
