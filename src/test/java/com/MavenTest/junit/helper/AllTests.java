package com.MavenTest.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
// Test Suit runs specific tests in a row
@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class, StringHelperTestParameterizedTest.class })
public class AllTests {

}
