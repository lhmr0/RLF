package proyectorlf;

import junit.framework.*;

public class ReservaTest extends TestCase {

    public ReservaTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public void testRegistraReservaCodigoIncorreto() {
        System.out.println("Codigo ingresado incorrecto");
        Reserva cita = new Reserva();
        assertFalse(cita.RegistraReserva("La Mallè", "667", "Trujillo", "Arthur Alfaro", "4:00PM", "12/10/2007", "COD_P1"));
    }

    public void testRegistraCitaExistente() {
        System.out.println("Item de cita a registrar ya existe");
        Reserva cita = new Reserva();
        assertTrue(cita.RegistraReserva("La Mallè", "666", "Trujillo", "Arthur Alfaro", "4:00PM", "12/10/2007", "COD_P1"));
    }

}
