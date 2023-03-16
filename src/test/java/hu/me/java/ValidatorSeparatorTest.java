package hu.me.java;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorSeparatorTest {

    Validator validator = new Validator();
    

    @Test
    public void isThatValidInteger_StringIsNullTest() {
        String testString = null;
        boolean testResult = validator.isThatValidInteger(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidInteger_StringIsEmptyTest() {
        String testString = "";
        boolean testResult = validator.isThatValidInteger(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidInteger_StringIsNotANumberTest() {
        String testString = "dasd";
        boolean testResult = validator.isThatValidInteger(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidInteger_StringIsADoubleTest() {
        String testString = "8.8";
        boolean testResult = validator.isThatValidInteger(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidInteger_StringIsValidTest() {
        String testString = "8";
        boolean testResult = validator.isThatValidInteger(testString);
        assertEquals(true, testResult );
    }

    @Test
    public void isThatValidDate_StringIsNullTest() {
        String testString = null;
        boolean testResult = validator.isThatValidDate(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidDate_StringIsEmptyTest() {
        String testString = "";
        boolean testResult = validator.isThatValidDate(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidDate_StringIsJunkTest() {
        String testString = "dsaef";
        boolean testResult = validator.isThatValidDate(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidDate_StringIsDateButNotInvalidDateTest() {
        String testString = "2023.88.124";
        boolean testResult = validator.isThatValidDate(testString);
        assertEquals(false, testResult );
    }

    @Test
    public void isThatValidDate_StringIsValidDateTest() {
        String testString = "2023.04.05";
        boolean testResult = validator.isThatValidDate(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void isValidBoolean_StringIsNullTest() {
        String testString = null;
        boolean testResult = validator.isValidBoolean(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void isValidBoolean_StringIsEmptyTest() {
        String testString = "";
        boolean testResult = validator.isValidBoolean(testString);
        assertEquals(false, testResult);
    }


    @Test
    public void isValidBoolean_StringIsJunkTest() {
        String testString = "söj$o53*4[@";
        boolean testResult = validator.isValidBoolean(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void isValidBoolean_StringIsTrueTest() {
        String testString = "true";
        boolean testResult = validator.isValidBoolean(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void isValidBoolean_StringIsFalseTest() {
        String testString = "true";
        boolean testResult = validator.isValidBoolean(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void dayOfWeekValidation_StringIsNullTest() {
        String testString = null;
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void dayOfWeekValidation_StringIsEmptyTest() {
        String testString = "";
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void dayOfWeekValidation_StringIsJunkTest() {
        String testString = "aßoaskd983%%'";
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void dayOfWeekValidation_StringIsNumberButNotGoodTest() {
        String testString = "99";
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(false, testResult);
    }
    @Test
    public void dayOfWeekValidation_StringIsNumberButNotGoodTest2() {
        String testString = "-99";
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(false, testResult);
    }

    @Test
    public void dayOfWeekValidation_StringIsGoodNumberTest() {
        String testString = "7";
        boolean testResult = validator.dayOfWeekValidation(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void isDataEmpty_StringIsNullTest() {
        String testString = null;
        boolean testResult = validator.isDataEmpty(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void isDataEmpty_StringIsEmptyTest() {
        String testString = "";
        boolean testResult = validator.isDataEmpty(testString);
        assertEquals(true, testResult);
    }

    @Test
    public void isDataEmpty_StringIsNotEmptyTest() {
        String testString = "adsda";
        boolean testResult = validator.isDataEmpty(testString);
        assertEquals(false, testResult);
    }

}
