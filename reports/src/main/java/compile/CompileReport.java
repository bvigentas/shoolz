package compile;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;

public class CompileReport<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompileReport.class);

    private ArrayList<T> dados;

    public CompileReport(ArrayList<T> dados) {
        this.dados = dados;
    }

    public void compile(String path, String jrxmlFileName, Map<String, Object> parameters) throws JRException {

        JasperReport jasperReport = JasperCompileManager.compileReport(path + jrxmlFileName);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, getDataSource());

        byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);
        LOGGER.debug("Relatório compilado com sucesso!");
    }

    private JRDataSource getDataSource() {
        return new JRBeanCollectionDataSource(dados);
    }

}
