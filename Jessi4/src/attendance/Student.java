package attendance;

public class Student {
	private String firstName;
	private String lastName;
	private boolean studentPresent;
	
	public Student(String first, String last){
		 firstName = first;
		 lastName = last;
		 studentPresent = false;
	}

	public boolean isPresent(){
		return studentPresent;
	}
	
	public void setPresent(boolean present) {
		studentPresent = present;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public boolean mathces(String first, String last)
	{
		return (first == firstName && last == lastName);
	}
	
	public boolean matches(String last)
	{
		return (last == lastName);
	}
	
	public String getReportString()
	{
		return String.format("%s%20s%s", firstName, " ", lastName);
	}
}
