package CT417.Assignment_1;

import java.util.List;

import org.joda.time.DateTime;

public class Course {
	public String courseName;
	public List<String> studentsNames;
	public List<String> modulesNames;
	public DateTime startDate;
	public DateTime endDate;
	
	private String getCourseName() {
		return courseName;
	}
	private void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	private List<String> getStudentsNames() {
		return studentsNames;
	}
	private void setStudentsNames(List<String> studentsNames) {
		this.studentsNames = studentsNames;
	}
	private List<String> getModulesNames() {
		return modulesNames;
	}
	private void setModulesNames(List<String> modulesNames) {
		this.modulesNames = modulesNames;
	}
	private DateTime getStartDate() {
		return startDate;
	}
	private void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	private DateTime getEndDate() {
		return endDate;
	}
	private void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}
