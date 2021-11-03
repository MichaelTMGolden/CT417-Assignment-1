package CT417.Assignment_1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ModuleTests {
	@Test
	public void evaluateStudentInCourse() {
		Module module = new Module();
		
		List<String> studentNames =  List.of("Kristian","Reena","Clay","Dominika","Uma");
		
		module.setStudentsNames(studentNames);
		
		assertEquals(true,module.isInCourse("Kristian"));
		
		assertEquals(false,module.isInCourse("John"));
	}
	
}
