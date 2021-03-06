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
        StringBuilder roman = new StringBuilder();
        int inputNum = arabic;
        for(Map.Entry<Integer, String> entry : navDescMap.entrySet()) {
            int repeat = inputNum/entry.getKey();
            String value = entry.getValue();
            roman.append(repeatString(value, repeat));
            inputNum %= entry.getKey();
        }
        return roman.toString();
    }

//    Better to use StringBuilder because String is an immutable class and it can not be modified when created. String concatenation results in creating a new instance of the String class with the modified string.

    private String repeatString(String value, int repeat) {
        StringBuilder repString = new StringBuilder();
        for(int i = 0; i < repeat; i++) {
            repString.append(value);
        }
        return repString.toString();
    }

    public int convertRoman() {
        String inputString = roman;
        int arabic = 0;

        for (Map.Entry<Integer, String> entry : navDescMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            while (inputString.startsWith(value)) {
                arabic += key;
                inputString = subtractString(inputString, value);
            }
        }
        return arabic;
    }

    private String subtractString(String inputString, String value) {
        return inputString.substring(value.length());
    }
}
