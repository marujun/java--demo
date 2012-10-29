import java.util.*;
import java.util.List;

import javax.imageio.*;//for ImageIO.read
import java.awt.*;//for JFrame and JLabel etc

import javax.swing.*;//for JFrame and JLabel etc
import java.net.*;//for URL
import java.io.*;//for catch (IOException e),File,InputStream, BufferedInputStream,and FileInputStream ect

public class bookTask_TWO_3{
	public static void main(String[] args){
		 Image im1,im2;
		 List<Image> list = new ArrayList<Image>() ;
		 im1 =readImage("a.jpg");
		 im2 =readImage("b.jpg");
		 list.add(im1);
		 list.add(im2);
		displayImage(list.get(0));
		displayImage(list.get(1));
	}
	public static Image readImage(String path){  //��ȡͼƬ������Image����
		Image image = null;
		try {
	        // Read from a file
	        File sourceimage = new File(path);  //a.jpgͼƬҪ��bookTask_TWO_3.javaͬ��һĿ¼��
	        image = ImageIO.read(sourceimage);
	    
	        // Read from an input stream
//	        InputStream is = new BufferedInputStream(
//	           new FileInputStream("b.jpg"));  //b.jpgͼƬҪ��bookTask_TWO_3.javaͬ��һĿ¼��
//	        image = ImageIO.read(is);
	    
	        // Read from a URL
//	        URL url = new URL("http://t2.baidu.com/it/u=2578366300,4007017196&fm=24&gp=0.jpg");
//	        image = ImageIO.read(url);
	        
	    } catch (IOException e) {
	    	 System.out.print("error: "+e);  
	    }
		return image;
	}
	public static void displayImage(Image image){  //չʾͼƬ
		// Use a label to display the image
	    JFrame frame = new JFrame();
	    JLabel label = new JLabel(new ImageIcon(image));
	    frame.getContentPane().add(label, BorderLayout.CENTER);
	    frame.pack();
	    frame.setVisible(true); 
	    //�رմ���--�˳�����
//	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}