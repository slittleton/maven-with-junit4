package com.MavenTest.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();
	

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_twoLetterString() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_singleLetterString() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
