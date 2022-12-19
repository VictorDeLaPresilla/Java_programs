
package manejo_de_archivos;
import java.io.Serializable;
/**
 *
 * @author Víctor
 */
public class CTarjeta implements Serializable 
{
    private int numero;
    private String descripcion;
    private int existencia;
    private int Stock_minimo;
    private int Stock_maximo;
    public CTarjeta (int n,String d,int e,int emin,int Smax)
    {
        numero=n;
        descripcion=d;
        existencia=e;
        Stock_minimo=emin;
        Stock_maximo=Smax;
    }

    public void setNumero(int n) {
        numero = n;
    }

    public void setDescripcion(String d) {
        descripcion = d;
    }

    public void setExistencia(int e) {
        existencia = e;
    }

    public void setStock_minimo(int Smin) {
        Stock_minimo = Smin;
    }

    public void setStock_maximo(int Smax) {
        Stock_maximo = Smax;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public int getStock_minimo() {
        return Stock_minimo;
    }

    public int getStock_maximo() {
        return Stock_maximo;
    }
}
