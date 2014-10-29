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
public class ProductoTest {
    
    public ProductoTest() {
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
    public void testRegistrarProducto() {
        System.out.println("Registrar producto, ");
        Producto producto = new Producto("1", "arroz con pato", "entrada", 15.50, "rico plato", "plato");
        assertFalse(producto.RegistrarProducto());
    }
     public void testRegistrarProductoNombre() {
        System.out.println("Registrar producto,el nombre del producto no acepta numeros ");
        Producto producto = new Producto("1", "arroz con pato545", "entrada", 15.50, "rico plato", "plato");
        assertFalse(producto.RegistrarProducto());
    }
     public void testRegistrarProductoTipo() {
        System.out.println("Registrar producto,el tipo del producto no acepta numeros ");
        Producto producto = new Producto("1", "arroz con pato545", "entrada12", 15.50, "rico plato", "plato");
        assertFalse(producto.RegistrarProducto());
    }
      public void testRegistrarProductoPrecio() {
        System.out.println("Registrar producto,el precio del producto no acepta letras ");
        Producto producto = new Producto("1", "arroz con pato", "entrada", 15.50o, "rico plato", "plato");
        assertFalse(producto.RegistrarProducto());
    }
       public void testRegistrarProductoDescripcion() {
        System.out.println("Registrar producto,la descripcion del producto no acepta numeros ");
        Producto producto = new Producto("1", "arroz con pato545", "entrada", 15.50, "rico plato123", "plato");
        assertFalse(producto.RegistrarProducto());
    }
       public void testRegistrarProductoCategoria() {
        System.out.println("Registrar producto,la categoria del producto no acepta numeros ");
        Producto producto = new Producto("1", "arroz con pato545", "entrada", 15.50, "rico plato", "plato123");
        assertFalse(producto.RegistrarProducto());
    }
}
