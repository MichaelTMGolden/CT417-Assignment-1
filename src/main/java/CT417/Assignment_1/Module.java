package CT417.Assignment_1;

import java.util.List;

public class Module {
	public String name;
	public String id;
	public List<String> studentsNames;
	public List<String> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getStudentsNames() {
		return studentsNames;
	}
	public void setStudentsNames(List<String> studentsNames) {
		this.studentsNames = studentsNames;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public boolean isInCourse(String name) {
		return studentsNames.contains(name);
	}
	
}
