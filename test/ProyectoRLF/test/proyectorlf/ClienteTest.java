/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorlf;

import junit.framework.*;

public class ClienteTest extends TestCase {

    public ClienteTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public void testRegistrarClienteNickname() {
        System.out.println("Registrar Cliente con un Nick mayor o igual a 15 caracteres");
        //Nickname arthurithozzzzzzzzzzasd no aceptado
        Cliente cliente = new Cliente("arthurithozzzzzzzzzzasd", "12345", "12345", "theoity@gmail.com","58526598",
                "Arthur", "Varon", "Peru");
        assertFalse(cliente.RegistrarCliente());
    }

    public void testRegistrarClienteClave() {
        System.out.println("Registrar Cliente con la Clave y Repetir clave diferentes");
        //Clave 12345 y Repetir Clave 123445 incorrectos
        Cliente cliente = new Cliente("arthurithoz", "12345", "123445", "theoity@gmail.com","58526598",
                "Arthur", "Varon", "Peru");
        assertFalse(cliente.RegistrarCliente());
    }
 public void testRegistrarDniCantidad() {
        System.out.println("Registrar Cliente con numero diferente de 8 en DNI");
        //585268598 mas de 8 digitos en DNI
        Cliente cliente = new Cliente("arthuritho", "12345", "12345", "theoity@gmail.com","585268598",
                "4rthuR", "Varon", "Peru");
        assertFalse(cliente.RegistrarCliente());
    }
 
 public void testRegistrarDniNoNumero() {
        System.out.println("Registrar Cliente con caracteres diferentes a numeros en DNI");
        //58as8598 el dni solo acepta numeros
        Cliente cliente = new Cliente("arthuritho", "12345", "12345", "theoity@gmail.com","58as8598",
                "4rthuR", "Varon", "Peru");
        assertFalse(cliente.RegistrarCliente());
    }
 
    public void testRegistrarClienteNombre() {
        System.out.println("Registrar Cliente con numeros en el Nombre");
        //Nombre 4rthur incorrecto
        Cliente cliente = new Cliente("arthuritho", "12345", "12345", "theoity@gmail.com","58526598",
                "4rthuR", "Varon", "Peru");
        assertFalse(cliente.RegistrarCliente());
    }

    public void testRegistrarClienteCorrecto() {
        System.out.println("Registrar Cliente con todos los datos correctos");
        //Todos los datos correctos
        Cliente cliente = new Cliente("arthuritho", "12345", "12345", "theoity@gmail.com","58526598",
                "Arthur", "Varon", "Peru");
        assertTrue(cliente.RegistrarCliente());
    }

}
