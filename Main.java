package Persons;
import java.awt.EventQueue;

import gui.GUI_ERP;

public class Main {

	public static void main(String[] args) {
		
	EmployeeManager employeeManager = new EmployeeManager();
	employeeManager.setup();
	//employeeManager.create(employee);
	employeeManager.read();
	employeeManager.exit();
	
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				GUI_ERP frame = new GUI_ERP();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	
	}
}

