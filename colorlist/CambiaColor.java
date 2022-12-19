
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Color;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CambiaColor implements ItemListener {

    Panel panel;

    public CambiaColor(Panel p1) {
        this.panel = p1;
    }

    public void itemStateChanged(ItemEvent e) {

        List fuente = (List)e.getSource();
        String origen = (String)fuente.getSelectedItem();

        if (origen.equals("Rojo")){
        panel.setBackground(Color.red);
        } else if (origen.equals("Azul")){
        panel.setBackground(Color.blue);
        } else if (origen.equals("Verde")){
        panel.setBackground(Color.green);
        } else if (origen.equals("Fiusha")){
        panel.setBackground(Color.MAGENTA);
        } else if (origen.equals("Amarillo")){
        panel.setBackground(Color.YELLOW);
        }  else if (origen.equals("Gris")){
        panel.setBackground(Color.LIGHT_GRAY);
        } else if (origen.equals("Acua")){
        panel.setBackground(Color.CYAN);
        }

    }
     public static int rand () {
        int rand,min=0,max=250;
        rand = (int) ((Math.random()*((max-min)+1))+min);
        return rand;
    }
}
