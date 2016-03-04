import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals number;

    @Test
    public void whenRomanNumeralsIsPassedOneAStringIisReturned() {
        number = new RomanNumerals(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedTwoAStringIIisReturned() {
        number = new RomanNumerals(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void whenRomanNumeralsIsPassedThreeAStringIIIisReturned() {
        number = new RomanNumerals(3);
        assertEquals("III", number.convertArabic());
    }
}
