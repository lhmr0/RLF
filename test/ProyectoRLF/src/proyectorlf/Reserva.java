package proyectorlf;

public class Reserva {

    public Reserva() {
    }

    public boolean RegistraReserva(String restaurante, String codigo, String zona, String cliente, String hora,
            String fecha, String pedido) {

        if ((restaurante.equals("La Mallè")) && (zona.equals("Trujillo")) && (cliente.equals("Arthur Alfaro"))
                && (hora.equals("4:00PM")) && (fecha.equals("12/10/2007") && (pedido.equals("COD_PED1")))) {
            return false;
        } else {
            if (codigo.equals("666")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
