package entities;

public class Employee {
	
	//Atributos
	private String id;
	private String name;
	private float salary;
	
	
	//Construct
	public Employee(String id, String name, float salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Metodos
	public void upSalary(float x) {
		x = x / 100;
		this.salary = (this.salary * x) + this.salary;
	}
	
	
	//Get and Set
	public Employee() {
		//super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salary;
	}	
}