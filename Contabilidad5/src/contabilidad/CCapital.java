
package contabilidad;
/*
 * @author Victor Hugo De La PresillaVega
 * No. de control: 18141028
 * Ingenieria en Sistemas Computacionales.
 */
public class CCapital extends CCuenta{
        public void haber (double cantidad){
        double capital=this.getSaldo();
        capital=capital+cantidad;
        this.setSaldo(capital);
    }
    public void debe (double cantidad){
        double capital=this.getSaldo();
        capital=capital-cantidad;
        this.setSaldo(capital);
    }
}
