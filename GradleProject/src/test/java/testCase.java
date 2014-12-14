package test.java;
import static org.junit.Assert.*;
import main.java.GradleTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class testCase {

	@Test
	public void test() {
		
		assertTrue(6 == (GradleTest.digitCount("Darude421337Sandstorm")));
	}

}
