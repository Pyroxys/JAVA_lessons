import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {
	
	private MyString myString;

	@Before
	public void setUp() throws Exception {
		this.myString = new MyString(new char[]{'a', 'b', 'a'});
	}

	@After
	public void tearDown() throws Exception {
		this.myString = null;
	}

	@Test
	public void testConstructorSimple() {
		assertArrayEquals(new char[] {'a', 'b', 'a'}, this.myString.value);
	}

	@Test
	public void testConstructorStringBuffer() {
		new MyString(new StringBuffer("aba"));
	}
	
	@Test
	public void testLength() {
		assertEquals(3, this.myString.length());
	}

	@Test
	public void testIsEmpty() {
		assertFalse(this.myString.isEmpty());
	}

	@Test
	public void testEmpty() {
		this.myString = new MyString(new StringBuffer());
		assertTrue(this.myString.isEmpty());
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testNegativeCharAt() {
		this.myString.charAt(-1);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testOverCharAt() {
		this.myString.charAt(500);
	}

	@Test
	public void testFirstCharAt() {
		assertEquals('a', this.myString.charAt(0));
	}

	@Test
	public void testEqualsMySelf() {
		assertTrue(this.myString.equals(this.myString));
	}

	@Test
	public void testNotEqualsOtherInstance() {
		assertFalse(this.myString.equals(new Object()));
	}

	@Test
	public void testNotEqualsDifferentSize() {
		assertFalse(this.myString.equals(new MyString(new char[] {'a', 'b'})));
	}

	@Test
	public void testNotEqualsSameSize() {
		assertFalse(this.myString.equals(new MyString(new char[] {'a', 'b', 'd'})));
	}

	@Test
	public void testEqualsSame() {
		assertTrue(this.myString.equals(new MyString(new char[] {'a', 'b', 'a'})));
	}

	@Test
	public void testIndexOfUnknown() {
		assertEquals(-1, this.myString.indexOf('d'));
	}

	@Test
	public void testIndexOfFirst() {
		assertEquals(0, this.myString.indexOf('a'));
	}

	@Test
	public void testLastIndexOfUnknown() {
		assertEquals(-1, this.myString.lastIndexOf('d'));
	}

	@Test
	public void testLastIndexOf() {
		assertEquals(2, this.myString.lastIndexOf('a'));
	}

	@Test
	public void testConcatSimple() {
		assertArrayEquals(new char[] { 'a', 'b', 'a', 'd' }, this.myString.concat(new MyString(new char[] { 'd' })).value);
	}

	@Test
	public void testConcatEmpty() {
		assertArrayEquals(new char[] { 'a', 'b', 'a' }, this.myString.concat(new MyString(new char[] {})).value);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstringBeforeZero() {
		this.myString.substring(-1, 0);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstringAfterMax() {
		this.myString.substring(0, 500);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstringReversedArguments() {
		this.myString.substring(2, 0);
	}

	@Test
	public void testSubstringSelf() {
		assertEquals(this.myString, this.myString.substring(0, 3));
	}

	@Test
	public void testSubstringSimple() {
		assertEquals(new MyString(new StringBuffer("ab")), this.myString.substring(0, 2));
	}
	
	
}
