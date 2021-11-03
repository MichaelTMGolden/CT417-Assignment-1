package CT417.Assignment_1;

import org.joda.time.DateTime;
import org.joda.time.format.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StudentTest {
	@Test
	public void evaluatesUsername() {
		Student student = new Student();
		String dateTime = "10/09/1998";
		// Format for input
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		// Parsing the date
		DateTime dob = dtf.parseDateTime(dateTime);
		// Format for output
		student.setUsername("John", dob);
		
		assertEquals("John23",student.getUsername());
		
		assertNotEquals("John25",student.getUsername());
	}
}
