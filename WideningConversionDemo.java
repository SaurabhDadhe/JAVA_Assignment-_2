public class WideningConversionDemo {
    public static void main(String[] args) {
        int intValue = 10;

        double doubleValue = intValue;
        System.out.println("Widening from int to double: " + doubleValue);

        float floatValue = intValue;
        System.out.println("Widening from int to float: " + floatValue);

        boolean booleanValue = (intValue != 0);
        System.out.println("Widening from int to boolean: " + booleanValue);

        String stringValue = String.valueOf(intValue);
        System.out.println("Widening from int to String: " + stringValue);
    }
}

