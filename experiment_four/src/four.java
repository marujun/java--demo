//4��	���һ������ʵ������Һ���Ԫ���۱ҡ�ŷԪ��Ӣ����ת����Ҫ�����ı��������������ֵ��
//ѡ��������ͣ�����һ�ı�����������ʺ��Զ��ڵ�3���ı�������ʾ�һ������


import java.awt.event.*;
import javax.swing.*;
public class four extends JFrame implements ActionListener{
	private JTextField text1=new JTextField(5);
	private JTextField text2=new JTextField(5);
	private  JLabel text3= new JLabel();
	private String s[]={"��Ԫ ","�۱�","ŷԪ","Ӣ��"};
	private JComboBox cb=new JComboBox(s);
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private double sum,sum1;		

	JLabel num=new JLabel("�����: ");
	JLabel rate=new JLabel("����: ");
	JLabel bmoney=new JLabel("�һ���: ");
	JLabel bnum=new JLabel("�һ���Ľ��Ϊ");
	JButton button =new JButton("�һ�");

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
			text3.setText("������Ľ�����");
		}
	}
	public static void main(String args[]){
		four frame=new four();
		frame.init();
	}
}