import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals number;

    private void setArabic(int num) {
        number = new RomanNumerals(num);
    }

    @Test
    public void whenRomanNumeralsIsPassedOneAStringIisReturned() {
        setArabic(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedTwoAStringIIisReturned() {
        setArabic(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedThreeAStringIIIisReturned() {
        setArabic(3);
        assertEquals("III", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedSixStringConcatenationIsReturned() {
        setArabic(6);
        assertEquals("VI", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedElevenStringConcatenationIsReturned() {
        setArabic(11);
        assertEquals("XI", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedALargeNumberIterateOverAllKeys() {
        setArabic(1066);
        assertEquals("MLXVI", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedAnotherLargeNumberIterateOverAllKeys() {
        setArabic(1989);
        assertEquals("MCMLXXXIX", number.convertArabic());
    }
}
