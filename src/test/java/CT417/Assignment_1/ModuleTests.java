package CT417.Assignment_1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class ModuleTests {
	@Test
	public void evaluateStudentInCourse() {
		//Formats DateTime object
		String dateTime = "10/09/1998";
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		
		DateTime dob = dtf.parseDateTime(dateTime);
		
		//List of Modules
		List<String> modules = List.of("CT412", "CT413", "CT432", "CT4412", "CT512");
		
		//Create Student Object
		Student student = new Student("John", dob, "16492262", "CT", modules);
		
		List<Student> studentNames =  new ArrayList<Student>();
		
		studentNames.add(student);
		
		//List of Course
		List<String> courses = List.of("Computing Technology", "Software Engineering", "Technology Engineering");
		
		//Initializes Module Constructor
		Module module = new Module("Comps", "CT415", studentNames, courses);
		
		//Checks to see Student registered in Module
		assertEquals(true,module.isInModule("John"));
		
		assertEquals(false,module.isInModule("Kirsten"));
		
	}
	
}
