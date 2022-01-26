package entities;

public class Funcionarios {

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Funcionarios(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void mudaSalario(double porcentagem) {
		salary += salary * (porcentagem / 100);
	}
	
	public String toString() {
		return id + "," + name + "," + String.format("%.2f", salary);
	}
	
	
	

}
