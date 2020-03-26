package Persons;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Person{
	
	private static final long serialVersionUID = 1L;

	static int nextEmployeeNumber = 10000;
	
	int employeeNumber;

	/*
	public Employee(String firstname, String lastname) {
		super(firstname, lastname);
		int nextEmployeeNumber = Employee.nextEmployeeNumber +1;
		this.employeeNumber = nextEmployeeNumber;
		Employee.nextEmployeeNumber = nextEmployeeNumber;
	}*/
	
	public void setNewEmployeeData(String firstname, String lastname) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}
	

	void setEmployeeNumber(int newEmployeeNumber) {
		this.employeeNumber = newEmployeeNumber;
	}
	
	@Id
	@Column(name = "employee_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	int getEmployeeNumber() {
		return this.employeeNumber;
	}
}
