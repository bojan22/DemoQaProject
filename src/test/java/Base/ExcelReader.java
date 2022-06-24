package Base;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class ExcelReader {

        File file;
        FileInputStream fis;
        XSSFWorkbook wb;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        public ExcelReader(String filePath) throws IOException {
            file = new File(filePath);
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        }

        public String getStringData(String sheetName, int rowNumber, int cellNumber) {
            sheet = wb.getSheet(sheetName);
            row = sheet.getRow(rowNumber);
            cell = row.getCell(cellNumber);
            return cell.getStringCellValue();
        }

        public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
            sheet = wb.getSheet(sheetName);
            row = sheet.getRow(rowNumber);
            cell = row.getCell(cellNumber);
            return (int) cell.getNumericCellValue();
        }

        public int getLastRow(String sheet) {
            this.sheet = wb.getSheet(sheet);
            return this.sheet.getLastRowNum();
        }


    }


