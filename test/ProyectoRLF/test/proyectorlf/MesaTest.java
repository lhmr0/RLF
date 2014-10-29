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
public class MesaTest {

    public MesaTest() {
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
    public void testRegistrarMesa() {
        System.out.println("Registrar mesa, no acepta letras en el codigo mesa");
        Mesa mesa = new Mesa("1", 10, " luchitozz");
        assertFalse(mesa.RegistrarMesa());
    }
    public void testRegistrarNumeroMesa() {
        System.out.println("Registrar mesa, no acepta letas en el numero de mesas");
        Mesa mesa = new Mesa("1", 10, " luchitozz");
        assertFalse(mesa.RegistrarMesa());
    }
    public void testRegistrarMesaCliente() {
        System.out.println("Registrar mesa, no acepta numero en el nombre del cliente");
        Mesa mesa = new Mesa("1", 10, " luchitozz123");
        assertFalse(mesa.RegistrarMesa());
    }
}
