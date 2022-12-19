/*
 * @author Victor Hugo De LaPresillaVega
 * No. de control: 18141028
 * Ingeniería en Sistemas Computacionales.
 */
package contabilidad;
public class CActivo extends CCuenta{
    public void haber(double cantidad){
        double activo=this.getSaldo();
        activo=activo-cantidad;
        this.setSaldo(activo);
    }
    public void debe(double cantidad){
        double activo=this.getSaldo();
        activo=activo+cantidad;
        this.setSaldo(activo);
    }
}
