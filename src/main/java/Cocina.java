public class Cocina implements Observer     {

    @Override

    public void actualizar(String mensaje) {

        System.out.println("Cocina: " + mensaje);

    }
}
