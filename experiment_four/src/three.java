//3��	���2���ı������������һ���ı������������ɸ���ʱ����һ���ı���ͬʱ����������������������
//       �����ƽ��ֵ��Ҳ����˵����������ı仯����һ���ı������ϵظ�����ͼ�ƽ��ֵ��

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
		calculator=new JButton("����");
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		label1=new JLabel("����:");
		label2=new JLabel("��� :");
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
		text2.append("�������֮����','��ո�ֿ�\n");
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
			text2.append("�������:\n��:  "+sum+"\nƽ��ֵ:  "+avg);
		}
	}
	public static void  main(String[] ss)
	{
		three frame=new three();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
