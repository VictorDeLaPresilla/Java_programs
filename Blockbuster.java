package blockbuster;
import java.awt.*;
import java.applet.*;
public class Blockbuster {

    public static void main(String[] args) {
        Frame f=new Frame();
        
        Panel base=new Panel(new BorderLayout());
        f.add(base);
        Label TituloBB=new Label("Blockbuster");
        //xd[0].setText("");
        Panel oeste=new Panel(new GridLayout(6,1));
        f.add(oeste,BorderLayout.WEST);
        //oeste.setBackground(Color.BLUE);
        /*CheckboxGroup peliculas=new CheckboxGroup();
        oeste.add(new Checkbox("Terror",false,peliculas));
        oeste.add(new Checkbox("Drama",false,peliculas));
        oeste.add(new Checkbox("Romance",false,peliculas));*/
        List peliculas=new List(3,false);
        peliculas.add("Terror");
        peliculas.add("Drama");
        peliculas.add("Romance");
        Label TituloPeliculas=new Label("Peliculas");
        oeste.add(TituloPeliculas);
        oeste.add(peliculas);
        List series=new List(3,false);
        series.add("Historicas");
        series.add("Policiacas");
        series.add("Drama");
        Label TituloSeries=new Label("Series");
        oeste.add(TituloSeries);
        oeste.add(series);
        List videojuegos=new List(3,false);
        videojuegos.add("Nintendo");
        videojuegos.add("PlayStation");
        videojuegos.add("XBOX");
        Label TituloVideojuegos=new Label("Videojuegos");
        oeste.add(TituloVideojuegos);
        oeste.add(videojuegos); 
        
        Panel este=new Panel(new GridLayout(8,1));
        f.add(este,BorderLayout.EAST);
         Label TituloPago=new Label("Opciones Pago");
        CheckboxGroup opcionespago=new CheckboxGroup();
        este.add(TituloPago);
        este.add(new Checkbox("Renta",false,opcionespago));
        este.add(new Checkbox("Compra",false,opcionespago));
      	 List renta=new List(3,false);
        renta.add("Peliculas");
        renta.add("Series");
        renta.add("Videojuegos");
        Label rent=new Label("Renta");
        este.add(rent);
        este.add(renta);
        
        List compra=new List(3,false);
        compra.add("Peliculas");
        compra.add("Series");
        compra.add("Videojuegos");
        Label Tcompra=new Label("Compra");
        este.add(Tcompra);
        este.add(compra);
        
        Panel sur=new Panel();
        f.add(sur,BorderLayout.SOUTH);
        sur.setBackground(Color.DARK_GRAY);
        
        
        Panel norte=new Panel();
        f.add(norte,BorderLayout.NORTH);
        norte.setBackground(Color.GRAY);
        norte.add(TituloBB,BorderLayout.NORTH);
        Panel centro=new Panel();
        f.add(centro,BorderLayout.CENTER);
        centro.setBackground(Color.GREEN);
        
        
        
        
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}
