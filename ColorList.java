
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;

public class ColorList {

    public static void main(String[] args) {

        Frame miFrame = new Frame("Cambiar color con List");
        Panel panel1 = new Panel(new GridLayout(2,1));
        Panel panel2 = new Panel();

        List color = new List();
        color.add("Verde");
        color.add("Azul");
        color.add("Acua");
        color.add("Rojo");
        color.add("Gris");
        color.add("Amarillo");
        color.add("Fiusha");

        Panel PanelColor = new Panel();
        panel2.add(color);

        panel1.add(panel2);
        panel1.add(PanelColor);

        PanelColor.setBackground(Color.black);
        color.addItemListener(new CambiaColor (PanelColor));

        miFrame.add(panel1);
        miFrame.setSize(400,200);
        miFrame.setVisible(true);

    }
}
