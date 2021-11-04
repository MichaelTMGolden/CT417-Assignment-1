package CT417.Assignment_1;

import java.util.List;

import org.joda.time.DateTime;

public class Course {
	public String courseName;
	public List<Student> studentsNames;
	public List<Module> modulesNames;
	public DateTime startDate;
	public DateTime endDate;
	
	public Course (String courseName, List<Student> studentsNames, List<Module> modulesNames, DateTime startDate, DateTime endDate) {
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getStudentsNames() {
		return studentsNames;
	}
	public void setStudentsNames(List<Student> studentsNames) {
		this.studentsNames = studentsNames;
	}
	public List<Module> getModulesNames() {
		return modulesNames;
	}
	public void setModulesNames(List<Module> modulesNames) {
		this.modulesNames = modulesNames;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	public boolean isInSession() {
		return ((startDate.compareTo(DateTime.now()) <= 0) && (endDate.compareTo(DateTime.now()) > 0) ? true : false);
	}

}
