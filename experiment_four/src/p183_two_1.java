//输入身份证信息的用户界面，当用户提交输入信息后弹出一个消息框，将输入内容显示在其中

import javax.swing.*;
import java.awt.event.*;

public class p183_two_1 extends JFrame implements ActionListener {
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel label=new JLabel("请输入身份证信息: ");
	JTextField text=new JTextField(20);
	JButton button=new JButton("弹出提示框");
	 private void init(){
		p1.add(label);
		p1.add(text);
		p2.add(button);

		this.getContentPane().add(p1,"North");
		this.getContentPane().add(p2,"Center");
		this.setSize(450, 100);
		this.setVisible(true);
		this.setTitle("Display your ID information");
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0) {
			String text1=text.getText();
			JOptionPane.showMessageDialog(null, text1,"身份证信息",JOptionPane.INFORMATION_MESSAGE);

	}
	public static void main(String[] args) {
		p183_two_1 id=new p183_two_1();
		id.init();
	}
}
