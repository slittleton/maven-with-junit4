package com.MavenTest.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperTestParameterizedTest {
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	public StringHelperTestParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// you can only have one set of parameters per class
	@Parameters
	public static List<String[]> testConditions() {
		// using this list as parameters will run the test testTruncateAInFirst2Positions for each set of values in the array of arrays
		String[][] expectedOutputs = {{"AACD", "CD"},{"ACD","CD"}};
		
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
