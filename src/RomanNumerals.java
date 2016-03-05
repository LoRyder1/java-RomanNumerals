import java.util.*;

public class RomanNumerals {

    private final int arabic;

    private Map<Integer, String> sortedMap;

    public RomanNumerals(int arabic) {
        this.arabic = arabic;
    }

    public String convertArabic() {

//      The outer pair of braces means that you are declaring and initializing an anonymous inner class that extends TreeMap. The inner pair of braces represents an instance initializer, code that is run when an instance is created.
        sortedMap = new TreeMap<Integer, String>() {{
            put(40, "XL");
            put(10, "X");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }}.descendingMap();

        String roman = "";
        int x = arabic;

        for(Map.Entry<Integer, String> entry : sortedMap.entrySet()) {

//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

            int repeat = x/entry.getKey();
            for(int i = 0; i < repeat; i++) {
                roman += entry.getValue();
            }
            x %= entry.getKey();
        }
        return roman;
    }
}
