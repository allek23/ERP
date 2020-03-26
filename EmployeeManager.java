package Persons;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmployeeManager {
	
	static public String data[][];
	
	 protected SessionFactory sessionFactory;
	 
	 protected void setup() {
		 final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			        .configure() // configures settings from hibernate.cfg.xml
			        .build();
			    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	    }
	 
	    protected void exit() {
	        // code to close Hibernate Session factory
	    }
	 
	    protected void create(Employee employee) {
	    	
	    	Session session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	
	    	session.save(employee);
	    	
	    	session.getTransaction().commit();
	    	session.close();
	    }
	 
	    protected void read() {
	    	Session session = sessionFactory.openSession();
	    	List<Employee> employeeList = session.createQuery("Select employee from Employee employee",Employee.class).getResultList();
	    	data = new String[employeeList.size()][3];
	    	int index = 0;
	    	for( Employee employee : employeeList) {
	    		String employeeNr = Integer.toString(employee.getEmployeeNumber());
	    		String firstname = employee.getFirstname();
	    		String lastname = employee.getLastname();
	    		data[index][0] = employeeNr;
	    		data[index][1] = firstname;
	    		data[index][2] = lastname;
	    		index = index +1;
	    	}
	    }
	 
	    protected void update() {
	        // code to modify a book
	    }
	 
	    protected void delete() {
	        // code to remove a book
	    }
	 
	    public static void main(String[] args) {
	        // code to run the program
	    }
	    
	   public static String[][] getEmployeeArray(){
	    	return data;
	    }
}
