/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectorlf;

public class Persona {

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getReclave() {
        return reclave;
    }

    public void setReclave(String reclave) {
        this.reclave = reclave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Persona(String nick, String clave, String reclave, String dni, String email, String nombre, String sexo, String pais) {
        this.nick = nick;
        this.clave = clave;
        this.reclave = reclave;
        this.dni = dni;
        this.email = email;
        this.nombre = nombre;
        this.sexo = sexo;
        this.pais = pais;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    String nick;
    String clave;
    String reclave;
    String dni;
    String email;
    String nombre;
    String sexo;
    String pais;
}
