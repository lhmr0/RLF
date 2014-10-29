/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorlf;

/**
 *
 * @author Upao
 */
public class Cliente extends Persona {

    public Cliente(String nick, String clave, String reclave, String email, String dni,
            String nombre, String sexo, String pais) {
        super(nick, clave, reclave, dni, email, nombre, sexo, pais);
    }

    public boolean RegistrarCliente() {
        char car;
        char as;
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        if (nick.length() > 15) {
            return false;
        } else {
            if (dni.length() != 8) {
                return false;
            } else {
                if (clave.compareTo(reclave) != 0) {
                    return false;
                } else {
                    for (int i = 0; i < nombre.length(); i++) {
                        for (int j = 0; j < numeros.length; j++) {
                            car = nombre.charAt(i);
                            if (car == numeros[j]) {
                                return false;
                            } else {
                                for (int o = 0; o < dni.length(); o++) {
                                    for (int h = 0; h < numeros.length; h++) {
                                        as = dni.charAt(i);
                                        if (car == numeros[j]) {
                                            return true;
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
    }
}