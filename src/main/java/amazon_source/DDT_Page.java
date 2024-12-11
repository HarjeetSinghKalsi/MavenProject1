package amazon_source;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;



public class DDT_Page 

{
	public static String un, pwd,srch, un_invalid, pwd_invalid, cupon, name1, mob1 , pass1, fname, mob, pinc, flat1 , street1 , landmark1;
	
	public void valid_creds() throws EncryptedDocumentException, IOException
	
	{
		 FileInputStream f1 = new FileInputStream("C:\\Users\\harje\\eclipse-workspace\\Selenium2024\\Excel\\Data_Sheet.xlsx");
		 Workbook w1 = WorkbookFactory.create(f1);
		 //valid pswd
		 un =         w1.getSheet("amazon").getRow(1).getCell(0).getStringCellValue();
		 pwd =        w1.getSheet("amazon").getRow(1).getCell(1).getStringCellValue(); 
		 //search 
		 srch =		  w1.getSheet("amazon").getRow(1).getCell(2).getStringCellValue();
		 //invalid pswd
		 un_invalid = w1.getSheet("amazon").getRow(1).getCell(3).getStringCellValue();
		 pwd_invalid =w1.getSheet("amazon").getRow(1).getCell(4).getStringCellValue();
		 
		 //coupon code
		 cupon =w1.getSheet("amazon").getRow(1).getCell(5).getStringCellValue();
		 
		 //Registration
		  name1 =     w1.getSheet("abc").getRow(1).getCell(0).getStringCellValue();
		  mob1 =     NumberToTextConverter.toText( w1.getSheet("abc").getRow(1).getCell(1).getNumericCellValue());
		  pass1 =    NumberToTextConverter.toText( w1.getSheet("abc").getRow(1).getCell(1).getNumericCellValue());
		  
		  //edit_user_details
		  fname =	 w1.getSheet("edit_address").getRow(1).getCell(0).getStringCellValue(); 
		  mob =	     NumberToTextConverter.toText(w1.getSheet("edit_address").getRow(1).getCell(1).getNumericCellValue());
		  pinc =	 NumberToTextConverter.toText (w1.getSheet("edit_address").getRow(1).getCell(2).getNumericCellValue());
		  flat1 =	 w1.getSheet("edit_address").getRow(1).getCell(3).getStringCellValue();
		  street1 =	 w1.getSheet("edit_address").getRow(1).getCell(4).getStringCellValue();
		  landmark1= w1.getSheet("edit_address").getRow(1).getCell(5).getStringCellValue();
		  
	}
	
	
		
}