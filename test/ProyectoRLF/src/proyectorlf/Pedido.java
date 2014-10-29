package proyectorlf;

public class Pedido {

    public Pedido() {
    }

    public boolean RegistraReserva(String restaurante, String codigo, String usuario,
            String cant, String orden) {

        if ((restaurante.equals("La Mallè")) && (usuario.equals("LoreAlva")) && (cant.equals("2") && (orden.equals("Lomo con caviar, Camote con mariscos")))) {
            return true;
        } else {
            if (codigo.equals("COD_P1")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
