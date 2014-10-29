
package proyectorlf;

import junit.framework.*;
import static junit.framework.Assert.assertFalse;

public class PedidoTest extends TestCase {
    
    public PedidoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

     public void testRegistraPedidoNoExiste() {
       System.out.println("Parametro de pedido no existe o está en blanco");
      Pedido pedido=new Pedido();
       assertTrue(pedido.RegistraReserva("La Mallè", "COD_P1", "LoreAlva", "2", ""));
    } 
         
     public void testRegistraPedidoIncorreto() {
       System.out.println("Usuario ingresado no existe");
      Pedido pedido=new Pedido();
       assertTrue(pedido.RegistraReserva("La Mallè", "COD_P1", "Chuck", "2", "Lomo con caviar, Camote con mariscos"));
    }      
    
  } 