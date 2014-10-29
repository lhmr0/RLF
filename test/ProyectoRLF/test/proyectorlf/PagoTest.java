/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RLF;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sistemas
 */
public class PagoTest {
    
    public PagoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
   public void testRealizarPago() {
        System.out.println("Realizar Pago, ");
        Facturacion pago = new Pago("15-25-15", 1,1, "12345678","Cahuide 171","Lucho");
        assertFalse(pago.RegistrarPago());
    }

    public void testRealizarPago() {
        System.out.println("Realizar Pago, el RUC no puede contener letras");
        Facturacion pago = new Pago("15-25-15", 1,1, "12345678","Cahuide 171","Lucho");
        assertFalse(pago.RegistrarPago());
    }

    public void testRealizarPago() {
        System.out.println("Realizar Pago, el nombre no puede contener numeros");
        Facturacion pago = new Pago("15-25-15", 1,1, "12345678","Cahuide 171","Lucho");
        assertFalse(pago.RegistrarPago());
    }
}
