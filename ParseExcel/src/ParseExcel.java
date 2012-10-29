

//import java.io.File;   
import java.io.IOException;   
//import java.util.ArrayList;
import java.io.FileInputStream;
//import java.util.List;   
  
import jxl.Sheet;
import jxl.*;
import jxl.Workbook;   
import jxl.read.biff.BiffException;  


  
public class ParseExcel {   
  
	public static void main(String[] args)  throws  BiffException, IOException { 
        
        FileInputStream is = new FileInputStream("/Users/mrj/Downloads/2011��ӱ�ʡר�ӱ������ƻ���רҵ�ο��Դ�ٶ���.xls"); 
        try { 
             
            Workbook wb = Workbook.getWorkbook(is); 
            int wbNum = wb.getNumberOfSheets(); 
            for(int i = 0;i<wbNum;i++){ 
                Sheet sheet = wb.getSheet(i); 
                String sheetName = sheet.getName(); 
                System.out.println("sheetName="+sheetName); 
                if(sheet!=null){ 
                    // ��ȡ��������� 
                    int rsColumns = sheet.getColumns(); 
                    // ��ȡ��������� 
                    int rsRows = sheet.getRows(); 
                    //ѭ���ļ�������� 
                    for(int j=0;j<rsRows;j++){ 
                        Cell[] cells = (Cell[]) (Cell[])sheet.getRow(j); 
                        for(int k=0;k<rsColumns;k++){ 
                        	System.out.print(cells[k].getContents()+"----"); 
                        } 
                        System.out.println(); 
                    } 
                } 
            } 
             
    } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }   
  
} 
