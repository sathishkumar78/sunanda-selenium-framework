package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class EmployeeDataFromExcel {

    private Workbook book;
    private Sheet sheet;
    private DataFormatter df = new DataFormatter();
    private String path;

    // Constructor → loads file ONLY ONCE
    public EmployeeDataFromExcel(String path, String sheetName) throws IOException {
        this.path = path;
        FileInputStream fis = new FileInputStream(path);
        book = WorkbookFactory.create(fis);
        sheet = book.getSheet(sheetName);
        fis.close();
    }

    // Read
    public String getCellValue(int row, int col) {
        return df.formatCellValue(sheet.getRow(row).getCell(col));
    }

    // Write
    public void setCellValue(int rowNum, int colNum, String value) {
        Row row = sheet.getRow(rowNum);
        if (row == null) row = sheet.createRow(rowNum);

        Cell cell = row.getCell(colNum);
        if (cell == null) cell = row.createCell(colNum);

        cell.setCellValue(value);
    }

    // Save file
    public void save() throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        book.write(fos);
        fos.close();
    }

    // Row count
    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    // Close workbook
    public void close() throws IOException {
        book.close();
    }
}