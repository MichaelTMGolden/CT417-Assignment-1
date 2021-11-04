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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(DateTime dob) {
		DateTime now = DateTime.now();
		
		Period period = new Period(dob, now, PeriodType.yearMonthDay());
		
		age = period.getYears();
	}
	public DateTime getDob() {
		return dob;
	}
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
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
