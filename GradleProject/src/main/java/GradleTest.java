package main.java;
import com.google.common.base.CharMatcher;

public class GradleTest {
	public static Integer digitCount(String input) {
        CharMatcher charMatcher = CharMatcher.DIGIT;
        return charMatcher.countIn(input);
	}
}
