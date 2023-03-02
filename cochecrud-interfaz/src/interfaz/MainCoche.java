package interfaz;

public class MainCoche {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        System.out.println("Método save: " + cocheCrud.save());
        System.out.println("Método findAll: " + cocheCrud.findAll());
        System.out.println("Método delete: " + cocheCrud.delete());
    }
}
