//设计一个小型文本编辑器的用户界面

import java.awt.*;
import javax.swing.*;

public class p183_two_5 extends JFrame{
	private JTextArea text=new JTextArea();
	private JMenuBar menubar=new JMenuBar();
	private JMenu filemenu=new JMenu("文件");
	private JMenu editmenu=new JMenu("编辑");
	String[] file={"新建","打开","保存","另存为","退出"};
	String[] edit={"全选","复制","剪切","粘贴"};
	private JMenu wordmenu=new JMenu("文字");
	private JMenuItem sizeItem=new JMenuItem("大小");
	public p183_two_5(){
		this.setTitle("文本编辑器");
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
