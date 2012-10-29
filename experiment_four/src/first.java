//1）	设计一个页面，其中包括1个文本域、1个列表框和2个按钮（复制、结束）。
//实现将列表框中选中的内容通过按“复制”钮将其在文本域中显示，单击“结束”钮，退出程序

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class first 
{
	    static JFrame fr=new JFrame();     
	    static String[] str={"INVOCATION_DEFAULT","INVOCATION_LAST","runnable","notifier","catchExceptions"};
		static JButton copy=new JButton("复制");
		static JButton exit=new JButton("结束");
		static JPanel panel1=new JPanel();
		static JPanel panel2=new JPanel();
		static JPanel panel3=new JPanel();
		static JList list=new JList(str);
		static JTextArea text= new JTextArea(5,13);
		
		private void init(){
			 ActionListener copyLis=new copyAction();
			 ActionListener exitLis=new exitAction();
			text.setSize(200,500);
			text.setBackground(Color.white);
			text.setEditable(false);
			fr.add(panel1,"North");
			fr.add(panel2,"Center");
			fr.add(panel3,"South");
			panel1.add(list);
			panel2.add(text);
			panel3.add(copy);
			panel3.add(exit);
			fr.setSize(200,300);
			fr.setVisible(true);
			fr.setResizable(false);
			exit.addActionListener(exitLis);
			copy.addActionListener(copyLis);
//			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public  class exitAction implements ActionListener{
		public void actionPerformed(ActionEvent event){
			 System.exit(0);
		}
	}
	public  class copyAction implements ActionListener{
		public void actionPerformed(ActionEvent event){
//			String command=event.getActionCommand();  //用于获取对应按钮的名称
			int[] a=list.getSelectedIndices();
			for(int i=0;i<a.length;i++){
				text.append(str[a[i]]+"\n");
			}
		}
	}
	public static void  main(String[] ss)
	{
		first frame=new first();
		frame.init();
		
	}
}