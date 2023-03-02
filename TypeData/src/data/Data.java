package data;

public class Data {
    public static void main(String[] args) {

        /* 1.Númericos */

        // 1.1 Enteros
        byte height = 127;
        short distance = 1500;
        int id = 10000000;
        long mass =  178823411L;

        // 1.2 decimales
        float PI = 3.1416f;
        double weight = 80.5d;

        /* Booleano */
        boolean isActive = true;
        boolean isFinalized = false;

        /* Texto */
        String message = "Congratulations";
        char active = 'Y';

        System.out.println("Tipo de dato  byte :" + height);
        System.out.println("Tipo de dato  short :" + distance);
        System.out.println("Tipo de dato int :" + id);
        System.out.println("Tipo de dato long :" + mass);
        System.out.println("Tipo de dato float :" + PI);
        System.out.println("Tipo de dato double :" + weight);
        System.out.println("Tipo de dato boolean :" + isActive);
        System.out.println("Tipo de dato boolean :" + isFinalized);
        System.out.println("Tipo de dato char :" + active);
        System.out.println("Tipo de dato String :" + message);
    }
}