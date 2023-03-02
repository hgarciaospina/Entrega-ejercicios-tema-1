package strings;

public class MainString {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Grapes", "Cherry"};
        String fruitSalad = "";
        for (String fruit: fruits) {
            fruitSalad = fruitSalad + fruit;
        }
        System.out.println("Ensalada de frutas: " + fruitSalad);
    }
}