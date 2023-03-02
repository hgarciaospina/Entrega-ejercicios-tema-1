package function;

public class MainFunction {
    private static final double IVA = 0.19;
    public static void main(String[] args) {
        System.out.printf("Total a pagar :" + calculatePrice(10000d));

    }

    static double calculatePrice(double price){
        double result = 0;
        double IVA = calculateIVA(price);
        result = price + IVA;
        return result;
    }

    static double calculateIVA(double price){
        double result = 0;
        return price * IVA;
    }
}