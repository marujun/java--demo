//2��	��дһ�������������ı����н����û������������������Ҫ�����0-255֮�䣬����ʱ�����ܹ����飩��
//       ���Դ���ΪR��G��B������ɫֵ��Ȼ�������������ť�ı���ɫ��

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class two extends JFrame implements ActionListener{
		 JLabel RLab=new   JLabel ("R :");
		 JLabel GLab=new   JLabel ("G :");
		 JLabel BLab=new   JLabel ("B :");
		 JTextField R=new JTextField(13);
		 JTextField G=new JTextField(13);
		 JTextField B=new JTextField(13);
		 JPanel panel1=new JPanel();
		 JPanel panel2=new JPanel();
		 JPanel panel3=new JPanel();
		 JButton comd=new JButton("����");
		 two(){
			 panel1.add(RLab); panel1.add(R);
			 panel2.add(GLab); panel2.add(G);
			 panel2.add(BLab); panel2.add(B); 
			 setVisible(true);
//			 setResizable(false);
			 setSize(200,300);
			 R.setSize(100,100);   G.setSize(100,100);   B.setSize(100,100);
			 getContentPane().add(panel1,"North");
			 getContentPane().add(panel2,"Center");
			 getContentPane().add(comd,"South");
			 comd.addActionListener((ActionListener) this);
		 }

	public void actionPerformed(ActionEvent event){
		if(event.getSource()==comd)
		{
			String rr=R.getText();
			int r=Integer.valueOf(rr);
			String gg=G.getText();
			int g=Integer.valueOf(gg);
			String bb=B.getText();
			int b=Integer.valueOf(bb);
			if(r>255||g>255||b>255||r<0||g<0||b<0)
			{
				String text1="0<R��G��B��ֵ<255";
				JOptionPane.showMessageDialog(null, text1,"��ʾ��",JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			Color c=new Color(r,g,b);
			comd.setBackground(c);
		}
	}
	public static void main(String args[]){
		two frame=new two();
	}
}