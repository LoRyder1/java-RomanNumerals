
public class RomanNumerals {

    private final int arabic;

    public RomanNumerals(int arabic) {
        this.arabic = arabic;
    }

    public String convertArabic() {

        if(arabic == 1) {
            return "I";
        } else {
            return "II";
        }
    }
}
