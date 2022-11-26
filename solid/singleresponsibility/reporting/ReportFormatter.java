package solid.singleresponsibility.reporting;

import solid.singleresponsibility.domain.Employee;

public class ReportFormatter {

    private String formattedOutput;
    private Employee employee;
    private FormatType formatType;

    public ReportFormatter(Object object, FormatType formatType) {

        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;

        }
    }

    private String convertObjectToCSV(Object object) {
        return "CSV : ,,, " + object.toString() + ",,,";
    }

    private String convertObjectToXML(Object object) {
        return "XML : <title> " + object.toString() + "</title>";

    }

    protected String getFormattedValue() {
        return formattedOutput;
    }

}
