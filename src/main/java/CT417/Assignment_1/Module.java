package CT417.Assignment_1;

import java.util.List;

public class Module {
	public String name;
	public String id;
	public List<Student> studentsNames;
	public List<String> courses;
	
	public Module(String name, String id, List<Student> studentsNames, List<String> courses) {
		this.name = name;
		this.id = id;
		this.studentsNames = studentsNames;
		this.courses = courses;
	}
	
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
	public List<Student> getStudentsNames() {
		return studentsNames;
	}
	public void setStudentsNames(List<Student> studentsNames) {
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
