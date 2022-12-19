package un.panel.bomnito;
import java.awt.*;

public class PedirDatos 
{
    public static void main(String[] args) 
     {
        Frame MiMarco = new Frame();
        Panel EntradaDeDatos = new Panel(new GridLayout(4,3));
        Label L_Nombre = new Label("Nombre");
        TextField Nombre = new TextField(15);
        Label L_Apellidos = new Label("Apellidos");
        TextField Apellidos = new TextField(60);
        Label L_Carrera = new Label("Carrera");
        TextField Carrera = new TextField(15);
        Label L_Semestre = new Label("Semestre");
        TextField Semestre = new TextField(10);
        Button boton = new Button ("Aceptar");
        Panel vacio_1=new Panel();
        Panel vacio_2=new Panel();
        Panel vacio_3=new Panel();
        
        EntradaDeDatos.add(L_Nombre);
        EntradaDeDatos.add(Nombre);
        EntradaDeDatos.add(vacio_1);
        EntradaDeDatos.add(L_Apellidos);
        EntradaDeDatos.add(Apellidos);
        EntradaDeDatos.add(vacio_2);
        EntradaDeDatos.add(L_Carrera);
        EntradaDeDatos.add(Carrera);
        EntradaDeDatos.add(vacio_3);
        EntradaDeDatos.add(L_Semestre);
        EntradaDeDatos.add(Semestre);
        EntradaDeDatos.add(boton);
        
        MiMarco.add(EntradaDeDatos);
        MiMarco.setSize(500,200);
        MiMarco.setTitle("Datos Escolares");
        MiMarco.setVisible(true);
        
    }
    
}
