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
}
