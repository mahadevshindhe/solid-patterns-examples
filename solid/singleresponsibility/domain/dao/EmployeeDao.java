package solid.singleresponsibility.domain.dao;

import solid.singleresponsibility.database.DatabaseConnectionManager;
import solid.singleresponsibility.domain.Employee;

import java.sql.SQLException;

public class EmployeeDao {
    public void save(Employee employee) throws SQLException {

       /* DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();

        connectionManager.connect();

        DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("sql");*/

        System.out.println("saved employee to database");

    }

    public void remove(Employee employee) throws SQLException {
        DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("sql");
        System.out.println("removed employee from database");
    }
}
