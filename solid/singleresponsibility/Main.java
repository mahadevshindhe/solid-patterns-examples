package solid.singleresponsibility;

import solid.singleresponsibility.domain.Employee;
import solid.singleresponsibility.domain.dao.EmployeeDao;
import solid.singleresponsibility.reporting.EmployeeReportFormatter;
import solid.singleresponsibility.reporting.FormatType;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Employee employee = new Employee(1,"sachin", "accounting", true);
        hireNewEmployee(employee);
        printEmployeeReport(employee, FormatType.CSV);
    }

    private static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter reportFormatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(reportFormatter.getFormattedEmployee());
    }

    private static void terminateEmployee(Employee employee) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.remove(employee);
    }

    private static void hireNewEmployee(Employee employee) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.save(employee);
    }
}


