/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RLF;
/**
 *
 * @author Sistemas
 */
public class Pago {

    private String Fecha;
    private String ComprobanteID;
    private String ReservaID;
    private String RUC;
    private String Direccion;
    private String Nombre;

    public Pago(String Fecha, String ComprobanteID, String ReservaID,String RUC, String Direccion, String Nombre) {
        this.Fecha = Fecha;
        this.ComprobanteID = ComprobanteID;
        this.ReservaID = ReservaID;
    }
    
    public Boolean RegistrarComprobante() {
        char car;
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; 
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int comprobanteid = Integer.parseInt(ComprobanteID);
        
        if (comprobanteid == 0&RUC==0) {
            return false;
        } else {
            for (int i = 0; i <= ComprobanteID.length(); i++) {

                for (int j = 0; j <= letras.length; j++) {
                    car = ComprobanteID.charAt(i);
                    if (car == letras[j]);
                    return false;
                }
                for (int i = 0; i <= Nombre.length(); i++) {

                for (int j = 0; j <= numeros.length(); j++) {
                    car = Nombre.charAt(i);
                    if (car == numeros[j]);
                    return false;
                }
                for (int i = 0; i <= RUC.length(); i++) {

                for (int j = 0; j <= letras.length(); j++) {
                    car = RUC.charAt(i);
                    if (car == letras[j]);
                    return false;
                }
            }          
      }
}
