/**
 * Convert String to Number!
 */

public class ConvertStringsToNumber {

    private static final String TO_INT = "123";
    private static final String TO_LONG = "123456789";
    private static final String TO_FLOAT = "12.345F";
    private static final String TO_DOUBLE = "12.34567D";

    public static void main(String[] args) {

        int toInt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLE);

        Integer integerValue = Integer.valueOf(TO_INT);
        Long longValue = Long.valueOf(TO_LONG);
        Float floatValue = Float.valueOf(TO_FLOAT);
        Double doubleValue = Double.valueOf(TO_DOUBLE);

    }
}
