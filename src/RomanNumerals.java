import java.util.*;

public class RomanNumerals {

    private final int arabic;

    private Map<Integer, String> sortedMap;

    public RomanNumerals(int arabic) {
        this.arabic = arabic;
    }

    public String convertArabic() {


        sortedMap = new TreeMap<Integer, String>().descendingMap();

        sortedMap.put(5, "V");
        sortedMap.put(4, "IV");
        sortedMap.put(1, "I");

        String roman = "";
        int x = arabic;

        for(Map.Entry<Integer, String> entry : sortedMap.entrySet()) {

            int repeat = x/entry.getKey();
            for(int i = 0; i < repeat; i++) {
                roman += entry.getValue();
            }
            x %= entry.getKey();
        }
        return roman;
    }
}
