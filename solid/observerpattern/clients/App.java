package solid.observerpattern.clients;

import solid.observerpattern.observers.HRDepartment;
import solid.observerpattern.observers.IObserver;
import solid.observerpattern.observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String [] args){
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
//		 Employee bob = new Employee("Bob", new Date(), 35000, true);
//		 ems.hireNewEmployee(bob);
		 
		 
		ems.modifyEmployeeName(5, "Raj");
	 // ems.modifyEmployeeName(2, "Raj");
	}
}
