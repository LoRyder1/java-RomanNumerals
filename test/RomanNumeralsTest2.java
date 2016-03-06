import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanNumeralsTest2 {

    private RomanNumerals number;

    private void setRoman(String num) {
        number = new RomanNumerals(0, num);
    }

    @Test
    public void convertRomanIsPassedIArabicOneIsReturned() {
        setRoman("I");
        assertEquals(1, number.convertRoman());
    }

    @Test
    public void convertRomanIsPassedIIIAndNumberAddedUpIsReturned() {
        setRoman("III");
        assertEquals(3, number.convertRoman());
    }
}
