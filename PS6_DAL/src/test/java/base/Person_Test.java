package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
		
	private static PersonDomainModel person1;
	private static PersonDomainModel person2;
	private static UUID person1UUID = UUID.randomUUID();			
	private static UUID person2UUID = UUID.randomUUID();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		Date person1Birth = null;
		Date person2Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 person1 = new PersonDomainModel();
		 person2 = new PersonDomainModel();
		 
		try {
			person1Birth = dateFormat.parse("1994-11-27");
			person2Birth = dateFormat.parse("1995-02-18");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		person1.setPersonID(person1UUID);
		person1.setFirstName("Mingkun");
		person1.setMiddleName("a");
		person1.setLastName("Chen");
		person1.setBirthday(person1Birth);
		person1.setCity("Elkton");
		person1.setStreet("702 Stone Gate Blvd");
		person1.setPostalCode(21921);
		
		person2.setPersonID(person2UUID);
		person2.setFirstName("Billy");
		person2.setMiddleName("C");
		person2.setLastName("Mullins");
		person2.setBirthday(person2Birth);
		person2.setCity("Middletown");
		person2.setStreet("500 Anna Court");
		person2.setPostalCode(19709);
	}
	
	@Test
	public void foo(){
		assert(true);
	}

}
