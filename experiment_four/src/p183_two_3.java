//设计一个简易的排雷游戏的用户界面

import java.awt.GridLayout;
import javax.swing.*;
public class p183_two_3 extends JFrame{
	JLabel label;
	JTextField text;
	JPanel panel1;
	JPanel panel2;
	JButton[] button;
	
	public p183_two_3(){
	this.setTitle("扫雷游戏");
	button=new JButton[225];
	label=new JLabel("雷的数量");
	text=new JTextField("10");
	panel1=new JPanel();
	panel2=new JPanel();
	this.getContentPane().add(panel1,"Center");
	this.getContentPane().add(panel2,"South");
	panel1.setLayout(new GridLayout(9,9));
	for(int i=0;i<81;i++){
		button[i]=new JButton();
	    panel1.add(button[i]);
	}
	
	panel2.add(label);
	panel2.add(text);
	
	this.setSize(500,500);
	this.setVisible(true);
	this.setResizable(false);
	}
  public static void main(String[] args) {
	  p183_two_3 s=new p183_two_3();
  }
}