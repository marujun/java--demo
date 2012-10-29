//设计一个名片管理的用户界面。当用户提交输入信息时，弹出一个消息框将输入的内容显示在其中。

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class p183_two_4 extends JFrame implements ActionListener{
	JLabel[] labels=new JLabel[6];
	JTextField[] text=new JTextField[6];
    String[] strs={"姓名","工作单位","职务","住宅电话","手机号码","办公室电话"};
    JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();	
	JButton comd=new JButton("保存");
	
	p183_two_4(){
		for(int i=0;i<6;i++){
			labels[i]=new JLabel(strs[i]);
			text[i]=new JTextField(10);
			panel2.add(labels[i]);
			panel2.add(text[i]);
		}
		panel3.add(comd);
		 setVisible(true);
//		 setResizable(false);
		 setSize(220,300);
		 getContentPane().add(panel1,"North");
		 getContentPane().add(panel2,"Center");
		 getContentPane().add(panel3,"South");
		 comd.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==comd)
		{
			String []t=new String[6];
			String tmp = "";
			for(int i=0;i<6;i++){
			      t[i]=text[i].getText();
			      tmp+=(strs[i]+": "+t[i]+"\n");
			}
			JOptionPane.showMessageDialog(null,tmp,"电话簿信息",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String args[]){
		p183_two_4 frame=new p183_two_4();
	}
}