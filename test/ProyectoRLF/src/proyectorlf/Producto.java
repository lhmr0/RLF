/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RLF;

/**
 *
 * @author Sistemas
 */
public class Producto {

    private String ProductoID;
    private String Nombre;
    private String TipoProducto;
    private double Precio;
    private String Descripcion;
    private String Categoria;

    public Producto(String ProductoID, String Nombre, String TipoProducto, double Precio, String Descripcion, String Categoria) {
        this.ProductoID = ProductoID;
        this.Nombre = Nombre;
        this.TipoProducto = TipoProducto;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
    }

    public boolean RegistrarProducto() {
        char car;
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; 
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int productoid = Integer.parseInt(ProductoID);
        if (Precio < 0 && productoid < 0) {
            return false;
        } else {
            for (int i = 0; i <= ProductoID.length(); i++) {
                for (int j = 0; j <= letras.length; j++) {
                    car = ProductoID.charAt(i);
                    if (car == letras[j]);
                    return false;
                }
            }
            for (int i = 0; i <= Nombre.length(); i++) {

                for (int j = 0; j <= numeros.length; j++) {
                    car = ProductoID.charAt(i);
                    if (car == numeros[j]);
                    return false;
                }
            }
            for (int i = 0; i <= TipoProducto.length(); i++) {

                for (int j = 0; j <= numeros.length; j++) {
                    car = TipoProducto.charAt(i);
                    if (car == numeros[j]);
                    return false;
                }
            }
            for (int i = 0; i <= Categoria.length(); i++) {

                for (int j = 0; j <= numeros.length; j++) {
                    car = Categoria.charAt(i);
                    if (car == numeros[j]);
                    return false;
                }
            }
        }
        return true;
    }
}

