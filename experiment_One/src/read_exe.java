
import java.io.*;

public class read_exe //3£®µ¥¼üÊäÈë¾ÙÀı

{ 
	public static void main(String as[]) throws IOException

    { 
		   char char_c; int int_c;

         int_c=System.in.read( );

        char_c=(char)System.in.read( );

        System.out.println("int_c="+ int_c);

        System.out.println("char_c="+ char_c);

    }

}
