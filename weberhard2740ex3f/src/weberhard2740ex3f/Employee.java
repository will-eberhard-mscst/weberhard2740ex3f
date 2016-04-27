package weberhard2740ex3f;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee (){
		name = " ";
		department = " ";
		position = " ";
	}
	
	public Employee(int idNumber, String name){
		this.idNumber = idNumber;
		this.name = name;
	}
	
	public Employee(int idNumber, String name, String department, String position){
		this.idNumber = idNumber;
		this.name = name;
		this.department = department;
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return  "Name: " + name + " Id: " + idNumber + " Dept: " + department + " Position: "
				+ position;
	}
	

}
