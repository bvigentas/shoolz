package com.github.bvigentas.schoords;

import lombok.Getter;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.List;

public abstract class ExportXLS<T> {

    private String[] columns;
    @Getter
    private List<T> objetosListar;
    private Workbook workbook;
    @Getter
    private Sheet sheet;
    private CreationHelper helper;
    @Getter
    private CellStyle dataCellStyle;

    public ExportXLS(String[] columns, List<T> objetosListar) {

        this.columns = columns;
        this.objetosListar = objetosListar;
    }

    public final void export(String sheetName, String fileName) throws IOException {

        this.workbook = new XSSFWorkbook();
        this.helper = workbook.getCreationHelper();
        this.sheet = this.workbook.createSheet(sheetName);

        configureDataCellStyle();
        createHeaderRow();
        createOtherRows();
        resizeColumns();

        this.workbook.close();

    }

    private void configureDataCellStyle() {

        dataCellStyle = workbook.createCellStyle();
        dataCellStyle.setDataFormat(helper.createDataFormat().getFormat("dd/MM/yyyy"));

    }

    private void createHeaderRow() {

        CellStyle headerCellStyle = this.configureHeaderCellStyle();

        Row headerRow = this.sheet.createRow(0);

        for (int i = 0; i < columns.length; i++) {

            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);

        }

    }

    private CellStyle configureHeaderCellStyle() {

        Font headerFont = this.workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        return headerCellStyle;
    }

    public abstract void createOtherRows();

    private void resizeColumns() {

        for (int i = 0; i < columns.length; i++) {

            sheet.autoSizeColumn(i);

        }
        
    }

}
