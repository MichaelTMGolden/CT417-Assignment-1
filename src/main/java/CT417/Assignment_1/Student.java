package CT417.Assignment_1;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class Student {
	public String name;
	public int age;
	public DateTime dob;
	public String id;
	public String username;
	public String course;
	public String module;
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(DateTime dob) {
		DateTime now = DateTime.now();
		
		Period period = new Period(dob, now, PeriodType.yearMonthDay());
		
		age = period.getYears();
	}
	private DateTime getDob() {
		return dob;
	}
	private void setDob(DateTime dob) {
		this.dob = dob;
	}
	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}

	private String getCourse() {
		return course;
	}
	private void setCourse(String course) {
		this.course = course;
	}
	private String getModule() {
		return module;
	}
	private void setModule(String module) {
		this.module = module;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String name, DateTime dob) {
		setAge(dob);
		
		username = name+age;
	}
}
