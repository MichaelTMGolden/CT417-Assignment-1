package CT417.Assignment_1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ModuleTests {
	@Test
	public void evaluateStudentInCourse() {
		Module module = new Module(null, null, null, null);
		
		List<Student> studentNames =  new ArrayList<Student>();
		
		Student student = new Student("John", null, "16492262", "CT", null);
		
		module.setStudentsNames(studentNames);
		
		assertEquals(true,module.isInCourse("Kristian"));
		
		assertEquals(false,module.isInCourse("John"));
	}
	
}
