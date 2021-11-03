package CT417.Assignment_1;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class CourseTests {
	@Test
	public void evaluateIsInSession() {
		Course course = new Course();
		String startDate = "01/09/2021";
		String endDate = "30/5/2022";
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		
		DateTime dos = dtf.parseDateTime(startDate);
		DateTime doe = dtf.parseDateTime(endDate);
		
		course.setStartDate(dos);
		course.setEndDate(doe);
		
		assertEquals(true,course.isInSession());
	}
}
