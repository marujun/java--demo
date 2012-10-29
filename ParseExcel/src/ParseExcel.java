

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
        
        FileInputStream is = new FileInputStream("/Users/mrj/Downloads/2011年河北省专接本招生计划及专业课考试大纲定稿.xls"); 
        try { 
             
            Workbook wb = Workbook.getWorkbook(is); 
            int wbNum = wb.getNumberOfSheets(); 
            for(int i = 0;i<wbNum;i++){ 
                Sheet sheet = wb.getSheet(i); 
                String sheetName = sheet.getName(); 
                System.out.println("sheetName="+sheetName); 
                if(sheet!=null){ 
                    // 获取表格总列数 
                    int rsColumns = sheet.getColumns(); 
                    // 获取表格总行数 
                    int rsRows = sheet.getRows(); 
                    //循环文件里的数据 
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
