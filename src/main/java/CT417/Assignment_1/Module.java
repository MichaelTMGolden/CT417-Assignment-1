package CT417.Assignment_1;

import java.util.List;

public class Module {
	public String name;
	public String id;
	public List<String> studentsNames;
	public List<String> courses;
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	private List<String> getStudentsNames() {
		return studentsNames;
	}
	public void setStudentsNames(List<String> studentsNames) {
		this.studentsNames = studentsNames;
	}
	private List<String> getCourses() {
		return courses;
	}
	private void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public boolean isInCourse(String name) {
		return studentsNames.contains(name);
	}
	
}
