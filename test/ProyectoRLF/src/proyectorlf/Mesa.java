/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RLF;

/**
 *
 * @author Sistemas
 */
public class Mesa {
    
    private String MesaID;
    private int NumAsiento;
    private String nick;
  


    public Mesa(String MesaID, int NumAsiento, String nick) {
        this.MesaID = MesaID;
        this.NumAsiento = NumAsiento;
        this.nick=nick;
    }

    Mesa(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean RegistrarMesa()
    {
        char car;
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if(MesaID.length()>3)
        {
            return false;
        }
            else {
            for (int i = 0; i <= MesaID.length(); i++) {

                for (int j = 0; j <= letras.length; j++) {
                    car = MesaID.charAt(i);
                    if (car == letras[j]);
                    return false;
                }
            }
            
            if(NumAsiento<=0)
            {
                return false ;
            }
        }
        return true;
       
    }
}
    
    
    

