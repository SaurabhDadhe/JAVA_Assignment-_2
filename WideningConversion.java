public class WideningConversion {
    public static void main(String[] args) {
        
        int intValue = 10;
        double doubleValue = 5.5;
        double result1 = intValue + doubleValue;
        System.out.println("int + double = " + result1);
        float floatValue = 3.5f;
        float result2 = intValue + floatValue;
        System.out.println("int + float = " + result2); 
        double result3 = floatValue + doubleValue;
        System.out.println("float + double = " + result3); 
    }
}
