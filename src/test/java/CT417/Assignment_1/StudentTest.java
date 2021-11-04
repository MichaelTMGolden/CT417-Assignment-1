package CT417.Assignment_1;

import org.joda.time.DateTime;
import org.joda.time.format.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	@Test
	public void evaluatesUsername() {
		
		String dateTime = "10/09/1998";
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		
		DateTime dob = dtf.parseDateTime(dateTime);
		
		List<Module> modules = new ArrayList<Module>();
		
		Module module = new Module("Software Engineering", "CT412", null, null);
		
		modules.add(module);
		
		Student student = new Student("John", dob, "16492262", "CT", modules);
		
		student.setUsername("John", dob);
		
		assertEquals("John23",student.getUsername());
		
		assertNotEquals("John25",student.getUsername());
	}
}
