package attendance;

public class Student implements Attendee{
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
		return (first.equalsIgnoreCase(firstName) && last.equalsIgnoreCase(lastName));
	}
	
	public boolean matches(String last)
	{
		return (last.equalsIgnoreCase(lastName));
	}
	
	public String getReportString()
	{
		String x = "ABSENT";
		if(studentPresent) {
			x = "PRESENT";
		}
		String tempFirstName = firstName;
		if (firstName.length() > 20)
		{
			tempFirstName = firstName.substring(0,  17) + "...";
		}
		String tempLastName = lastName;
		if (lastName.length() > 20)
		{
			tempLastName = lastName.substring(0,  17) + "...";
		}
		return String.format("%-20s%-20s%-20s\n", tempFirstName, tempLastName, x);
	}
}
