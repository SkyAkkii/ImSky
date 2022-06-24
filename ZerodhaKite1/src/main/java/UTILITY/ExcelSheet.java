package UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	
	public static String getData(String Ak,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream obj = new FileInputStream("D:\\AUTOMATION\\ZerodhaKite1\\src\\test\\resources\\Book1.xlsx");
		String value = WorkbookFactory.create(obj).getSheet(Ak).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
		
	}}
	
	

