package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readandwritedata {
	
	public static XSSFWorkbook workbook = new XSSFWorkbook();
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;  
	
	private static void setHeaderRowStyle(XSSFWorkbook workbook,XSSFRow headerRow, int colIndex, String headerText) {
		
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		Font font = workbook.createFont();
		font.setColor(IndexedColors.BLACK.getIndex());
		style.setFont(font);

		headerRow.createCell(colIndex).setCellValue(headerText);
		headerRow.getCell(colIndex).setCellStyle(style);
	}

	public static void writeDoctors(List<String> Doctors, String excelFilePath, String sheetName) {
		 
	    try(FileInputStream existingFile=new FileInputStream(excelFilePath)){
	    	XSSFWorkbook existingworkbook = new XSSFWorkbook(existingFile);
	    	XSSFSheet Sheet=existingworkbook.getSheet(sheetName);
	    	if(Sheet!=null) {
	    		existingworkbook.removeSheetAt(existingworkbook.getSheetIndex(Sheet));
	    	}
	    	Sheet=existingworkbook.createSheet(sheetName);
	    	XSSFRow HeaderRow = Sheet.createRow(0);
			setHeaderRowStyle(existingworkbook,HeaderRow, 0, "Doctor Details");
	        CellStyle wrapCellStyle = existingworkbook.createCellStyle();
	        wrapCellStyle.setWrapText(true);
	 
	        for (int i = 0; i < Doctors.size(); i++) {
	            XSSFRow row = Sheet.createRow(i + 1);
	            XSSFCell cell = row.createCell(0); 
	            
	            // Use cell index 0 to write in the second column=
	            cell.setCellValue(Doctors.get(i));
	            cell.setCellStyle(wrapCellStyle);
	        }
	 
	        // Auto-fit column width implementation
	        for (int i = 0; i < HeaderRow.getLastCellNum(); i++) {
	            Sheet.autoSizeColumn(i);
	        }
	        try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
	        	existingworkbook.write(fileOut);
			}
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void writeSurgery(List<String> surgeryList, String excelFilePath,String sheetName) {
		
		try (FileInputStream existingFile=new FileInputStream(excelFilePath)){
	    	XSSFWorkbook existingworkbook = new XSSFWorkbook(existingFile);
	    	XSSFSheet Sheet=existingworkbook.getSheet(sheetName);
	    	if(Sheet!=null) {
	    		existingworkbook.removeSheetAt(existingworkbook.getSheetIndex(Sheet));
	    	}
	    	Sheet=existingworkbook.createSheet(sheetName);
	    	XSSFRow HeaderRow = Sheet.createRow(0);
			setHeaderRowStyle(existingworkbook,HeaderRow, 0, "ListOfSurgeries");

			for (int i = 0; i < surgeryList.size(); i++) {
				XSSFRow row = Sheet.getRow(i + 1);

				// if row doesn't exist, create a new one
				if (row == null) {
					row = Sheet.createRow(i + 1);
				}

				row.createCell(0).setCellValue(surgeryList.get(i));
			}

			// Auto-fit column width implementation
			for (int i = 0; i < HeaderRow.getLastCellNum(); i++) {
				Sheet.autoSizeColumn(i);
			}


			// writing data in the excel sheet
			try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
				existingworkbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 public static String[] read(String excelFilePath,String sheetName) {
		 
	        String[] str = new String[8];
	        try {
	            FileInputStream file = new FileInputStream(excelFilePath);
	            XSSFWorkbook wb = new XSSFWorkbook(file);
	            XSSFSheet sheet = wb.getSheet("Details");
	            XSSFRow row = sheet.getRow(1);
	            for (int i = 0; i < 8; i++) {
	                DataFormatter formatter = new DataFormatter();
	                XSSFCell cell = row.getCell(i);
	                str[i] = formatter.formatCellValue(cell);
	            }
	            file.close();
	            wb.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return str;
	    }


}
