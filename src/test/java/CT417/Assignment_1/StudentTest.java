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
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		
		DateTime dob = dtf.parseDateTime(dateTime);
		
		student.setUsername("John", dob);
		
		assertEquals("John23",student.getUsername());
		
		assertNotEquals("John25",student.getUsername());
	}
}
