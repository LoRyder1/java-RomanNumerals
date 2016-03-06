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

    @Test
    public void convertRomanAddsUpArabicNumbersForDifferentStrings() {
        setRoman("VI");
        assertEquals(6, number.convertRoman());
    }

    @Test
    public void convertRomanAddsUpArabicForDifferentKeys() {
        setRoman("MLXVI");
        assertEquals(1066, number.convertRoman());
    }

    @Test
    public void convertRomanAddsUpArabicForLargeNumber() {
        setRoman("MCMLXXXVI");
        assertEquals(1986, number.convertRoman());
    }
}
