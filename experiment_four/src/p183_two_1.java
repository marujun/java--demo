//�������֤��Ϣ���û����棬���û��ύ������Ϣ�󵯳�һ����Ϣ�򣬽�����������ʾ������

import javax.swing.*;
import java.awt.event.*;

public class p183_two_1 extends JFrame implements ActionListener {
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel label=new JLabel("���������֤��Ϣ: ");
	JTextField text=new JTextField(20);
	JButton button=new JButton("������ʾ��");
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
			JOptionPane.showMessageDialog(null, text1,"���֤��Ϣ",JOptionPane.INFORMATION_MESSAGE);

	}
	public static void main(String[] args) {
		p183_two_1 id=new p183_two_1();
		id.init();
	}
}
