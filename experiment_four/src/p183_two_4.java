//���һ����Ƭ������û����档���û��ύ������Ϣʱ������һ����Ϣ�������������ʾ�����С�

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class p183_two_4 extends JFrame implements ActionListener{
	JLabel[] labels=new JLabel[6];
	JTextField[] text=new JTextField[6];
    String[] strs={"����","������λ","ְ��","סլ�绰","�ֻ�����","�칫�ҵ绰"};
    JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();	
	JButton comd=new JButton("����");
	
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
			JOptionPane.showMessageDialog(null,tmp,"�绰����Ϣ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String args[]){
		p183_two_4 frame=new p183_two_4();
	}
}