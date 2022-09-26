package com.pack.testlogic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pack.Calculation1;

public class TestCase2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@Test
	public void testFindMax() {
		System.out.println("testcase find max...");
		assertEquals(6, Calculation1.findMax(new int[] { 1, 3, 4, 6 }));
		assertEquals(-3, Calculation1.findMax(new int[] { -3, -12, -55, -8 }));
	}

	@Test
	public void TestCube() {
		System.out.println("test case Cube...");
		assertEquals(27, Calculation1.cube(3));
	}

	@Test
	public void testReverseWord() {
		System.out.println("Test case reverse word...");
		assertEquals("ym eman si nahk", Calculation1.reverseWords("my name is khan"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}
}
