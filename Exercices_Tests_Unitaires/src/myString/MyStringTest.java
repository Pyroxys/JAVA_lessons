package myString;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {
	
	@Test
	public void testUpperCase() {
		String str = "abc";
		MyString ms = new MyString(str);
		ms.toUpperCase();
		assertEquals(ms.getString(), "ABC");
	}
	
	@Test
	public void numberOfCharTest() {
		String str = "abc";
		MyString ms = new MyString(str);
		assertEquals(ms.numberOfChar('c'), 1);
	}
	
	@Test
	public void numberOfCharTestWithNoCorrespondingCharacters() {
		String str = "abc";
		MyString ms = new MyString(str);
		assertEquals(ms.numberOfChar('z'), 0);
	}
	
	@Test
	public void numberOfVoyellesTest() {
		String str = "abcA";
		MyString ms = new MyString(str);
		assertEquals(ms.numberOfVoyelles(), 2);
	}
	
	@Test
	public void numberOfVoyellesTestWithNoVoyelles() {
		String str = "zzz";
		MyString ms = new MyString(str);
		assertEquals(ms.numberOfVoyelles(), 0);
	}
	
	@Test
	public void testGetFirstWord() {
		String str = "abc def";
		MyString ms = new MyString(str);
		assertEquals(ms.getFirstWord(), "abc");
	}
	
	@Test
	public void testGetFirstWordWithSpaceAsFirstCharacter() {
		String str = "abc def";
		MyString ms = new MyString(str);
		assertEquals(ms.getFirstWord(), "abc");
	}
}
