package CT417.Assignment_1;

import java.util.List;

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
	public List<Module> modules;
	
	public Student (String name, DateTime dob, String id, String course, List<Module> modules) {
		this.name = name;
		this.dob = dob;
		setAge(dob);
		this.age = getAge();
		this.id = id;
		setUsername(name, dob);
		this.username = getUsername();
		this.course = course;
		this.modules = modules;
	}
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

	public String getCourses() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String name, DateTime dob) {
		setAge(dob);
		
		username = name+age;
	}
}
