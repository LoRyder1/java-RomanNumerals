import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConvertArabicTest {

    private RomanNumerals number;

    private void setArabic(int num) {
        number = new RomanNumerals(num, null);
    }

    @Test
    public void convertArabicIsPassedOneAStringIisReturned() {
        setArabic(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedTwoAStringIIisReturned() {
        setArabic(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedThreeAStringIIIisReturned() {
        setArabic(3);
        assertEquals("III", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedSixStringConcatenationIsReturned() {
        setArabic(6);
        assertEquals("VI", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedElevenStringConcatenationIsReturned() {
        setArabic(11);
        assertEquals("XI", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedALargeNumberIterateOverAllKeys() {
        setArabic(1066);
        assertEquals("MLXVI", number.convertArabic());
    }

    @Test
    public void convertArabicIsPassedAnotherLargeNumberIterateOverAllKeys() {
        setArabic(1989);
        assertEquals("MCMLXXXIX", number.convertArabic());
    }
}
