import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringBufferTest {
	
	private StringBuffer str;
	
	@Before
	public void setUp() throws Exception {
		str = new StringBuffer("Salu");
	}

	@After
	public void tearDown() throws Exception {
		str = null;
	}

	@Test
	public void testCharAt() {
		 assertEquals('S', str.charAt(0));
	}
	
	@Test
	public void testSetCharAt() {
		 str.setCharAt(0, 'V');
		 assertEquals('V', str.charAt(0));
	}
	
	@Test
	public void testAppendAjoutDeUnCaractere() {
		 str.append('t'); 
		 assertEquals("Salut", str.toString());
	}
	
	@Test
	public void testAppendDetestAppendWithNullString() {
		 str.append(""); 
		 assertEquals("Salu", str.toString());
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testCharAtWithInvalidIndexes() {
	  str.charAt(4);
	}
}
