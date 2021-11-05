package CT417.Assignment_1;

import java.util.List;

public class Module {
	public String name;
	public String id;
	public List<Student> students;
	public List<String> courses;
	
	//Module contructor
	public Module(String name, String id, List<Student> students, List<String> courses) {
		this.name = name;
		this.id = id;
		this.students = students;
		this.courses = courses;
	}
	
	//Check to see if student is present in module
	public boolean isInModule(String name) {
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name) == true) {
				return true;
			}
		}
		return false;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
}
