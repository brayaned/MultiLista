
package multilistas;

import java.applet.Applet;
import java.awt.*;


public class Imprimir extends Applet {
    String r;
    public Imprimir(String resul){
        r=resul;
    }

    public void paint(Graphics g){
        g.drawString(r, 100, 100);
    }
    
}
