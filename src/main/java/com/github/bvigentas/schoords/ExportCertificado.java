package com.github.bvigentas.schoords;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class ExportCertificado extends ExportXLS<Certificado> {

    public ExportCertificado(String[] columns, List<Certificado> objetosListar) {
        super(columns, objetosListar);
    }

    @Override
    public void createOtherRows() {

        int rowNum = 1;

        for (Certificado certificado : super.getObjetosListar()) {
            
            Row row = super.getSheet().createRow(rowNum++);

            row.createCell(0).setCellValue(certificado.getCertificado());

            Cell initialDateCell = row.createCell(2);
            initialDateCell.setCellValue(certificado.getDataInicial());
            initialDateCell.setCellStyle(super.getDataCellStyle());

            Cell finalDateCell = row.createCell(3);
            finalDateCell.setCellValue(certificado.getDataInicial());
            finalDateCell.setCellStyle(super.getDataCellStyle());

        }

    }
}
