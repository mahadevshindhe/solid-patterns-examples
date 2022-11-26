package solid.singleresponsibility.reporting;

import solid.singleresponsibility.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    private Employee employee;
    private FormatType formatType;

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
