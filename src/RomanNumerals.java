import java.util.*;

public class RomanNumerals {

    private final int arabic;
    private final String roman;

    private NavigableMap<Integer, String> navDescMap;

    public RomanNumerals(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;

//      The outer pair of braces means that you are declaring and initializing an anonymous inner class that extends TreeMap. The inner pair of braces represents an instance initializer, code that is run when an instance is created.
        navDescMap = new TreeMap<Integer, String>() {{
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100,"C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }}.descendingMap();
    }

    public String convertArabic() {

        String roman = "";
        int x = arabic;
//        NavigableMap<Integer, String> desMap = navMap.descendingMap();
//        maybe use descendingKeySet

        for(Map.Entry<Integer, String> entry : navDescMap.entrySet()) {

            int repeat = x/entry.getKey();
            for(int i = 0; i < repeat; i++) {
                roman += entry.getValue();
            }
            x %= entry.getKey();
        }
        return roman;
    }

    public int convertRoman() {
        String x = roman;
        int arabic = 0;

        for (Map.Entry<Integer, String> entry : navDescMap.entrySet()) {
            while (x.startsWith(entry.getValue())) {
                arabic += entry.getKey();
                x = x.substring(entry.getValue().length());
            }
        }
        return arabic;
    }
}
