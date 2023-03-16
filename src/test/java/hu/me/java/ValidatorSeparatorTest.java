package hu.me.java;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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




}
