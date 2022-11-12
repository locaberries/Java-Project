package Gray;


public class Employee {
	
	private String firstName;
	private String lastName;
	private String state;
	private String jobTitle;
	private int age;
		
		
	public Employee(String firstName, String lastName, String state, String jobTitle, int age) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
