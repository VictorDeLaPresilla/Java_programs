package barco;
/*
 * Estebes González Luis Manuel
 * Parrales Alcantar Jocelyn
 * Eugenio Rodrígues Laura Johana
 * De La Presilla Vega Víctor Hugo
 * Jiménez Luna Jesús Enrique
 * */

public class Barco {
    Pasajero lugar[];
    int LugaresDisponibles;
    public Barco(){
        this.lugar = new Pasajero[3];
        LugaresDisponibles = 0;
    }
    public void Disponibilidad(Pasajero persona) {
    	System.out.println("\t-- Ingreso un pasajero --");
        lugar[LugaresDisponibles] = persona;
        LugaresDisponibles++;
    }
    public void DisponibilidadDos(Pasajero persona) {
    	 System.out.println("\tViaje iniciado");
         System.out.println("(Viaje en curso........)");
         Navegar();
         fRecorrido();
         System.out.println("Viaje terminado, bajan pasajeros\n");
         System.out.println("Acceso a otro viaje");
         System.out.println("\t-- Ingreso un pasajero --");
         lugar[LugaresDisponibles] = persona;
         LugaresDisponibles++;
         this.notifyAll();
    }
    public synchronized void Abordar(Pasajero persona)
    {
        try 
        {
            this.wait(100);
            if(LugaresDisponibles<3)
            {
            	Disponibilidad(persona);
            }
            else
            {
            	DisponibilidadDos(persona);
                this.wait(400);
            }
        } catch (InterruptedException ex){}
    }
    public synchronized void Navegar()
    {
        try 
        {
            Thread.sleep(1500);
        } 
        catch (InterruptedException ex){}
    }
    public synchronized void fRecorrido()
    {
    	LugaresDisponibles = 0;
    }
    public static void main(String[] args) 
    {
        System.out.println("RECINTO FERIAL\n");
        Barco barca = new Barco();
        Pasajero hilo = new Pasajero(barca);
        hilo.run();
    }
}
class Pasajero extends Thread
{
	Barco barca = new Barco();
    public Pasajero(Barco barca)
    {
        this.barca = barca;
    }
    @Override
    public void run(){
        synchronized(barca){
            Pasajero pasaje;
            while(true){
                try {
                    pasaje = new Pasajero(barca);
                    barca.Abordar(pasaje);
                    barca.notifyAll();
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex){}
            } 
        }
    }
}