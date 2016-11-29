package base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;

public class Student_Test {

	private static StudentDomainModel student1;
	private static StudentDomainModel student2;
	private static UUID student1UUID = UUID.randomUUID();
	private static UUID student2UUID = UUID.randomUUID();
	
	@BeforeClass
	public static void studentInstance() throws Exception {
		Date student1Birth = null;
		Date student2Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 student1 = new StudentDomainModel();
		 student2 = new StudentDomainModel();
		 
		try {
			student1Birth = dateFormat.parse("1994-11-27");
			student2Birth = dateFormat.parse("1995-02-18");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		student1.setStudentID(student1UUID);
		student1.setFirstName("Mingkun");
		student1.setMiddleName("a");
		student1.setLastName("Chen");
		student1.setDOB(student1Birth);
		
		
		student2.setStudentID(student2UUID);
		student2.setFirstName("Billy");
		student2.setMiddleName("C");
		student2.setLastName("Mullins");
		student2.setDOB(student2Birth);
	
	}
	@Test
	public void studentTest(){
		
	}
}
