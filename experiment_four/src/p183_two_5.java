//���һ��С���ı��༭�����û�����

import java.awt.*;
import javax.swing.*;

public class p183_two_5 extends JFrame{
	private JTextArea text=new JTextArea();
	private JMenuBar menubar=new JMenuBar();
	private JMenu filemenu=new JMenu("�ļ�");
	private JMenu editmenu=new JMenu("�༭");
	String[] file={"�½�","��","����","���Ϊ","�˳�"};
	String[] edit={"ȫѡ","����","����","ճ��"};
	private JMenu wordmenu=new JMenu("����");
	private JMenuItem sizeItem=new JMenuItem("��С");
	public p183_two_5(){
		this.setTitle("�ı��༭��");
		this.setFont(new Font("Times New Roman",Font.PLAIN,36));
		this.setBackground(Color.white);
		this.setSize(400,300);
		for(int i=0;i<5;i++){
			filemenu.add(file[i]);
			filemenu.addSeparator();
		}
		for(int i=0;i<4;i++){
			editmenu.add(edit[i]);
			editmenu.addSeparator();
		}
		wordmenu.add(sizeItem);

		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(wordmenu);
		setJMenuBar(menubar);
		add(text);
		setVisible(true);
	}
	public static void main(String[] args) {
		p183_two_5 e=new p183_two_5();
	}
}
