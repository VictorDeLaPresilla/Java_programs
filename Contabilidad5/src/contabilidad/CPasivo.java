/*
 * @author Victor Hugo De La Presilla
 * No. de Control: 18141028
 * Ingeniería en Sistemas Computacionales.
 */
package contabilidad;


public class CPasivo extends CCuenta{
        public void haber (double cantidad){
        double pasivo=this.getSaldo();
        pasivo=pasivo+cantidad;
        this.setSaldo(pasivo);
    }
    public void debe (double cantidad){
        double pasivo=this.getSaldo();
        pasivo=pasivo-cantidad;
        this.setSaldo(pasivo);
    }
 
}
