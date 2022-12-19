package contabilidad;
/*
 * @author VictorHugo De La Presilla Vega
 * No. de Control: 18141028
 * Ingeniería en Sistemas Computacionales.
 */
public class CCuenta {
    private double saldo;
    private String nombre;
    private String tipo_cuenta;
    private String cve_cuenta;
   
     public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     public double getSaldo() {
        return saldo;
    }
     
    
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
 
        
    }
    public String getNombre() {
        return nombre;
    }
     
    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    } 
    public String getTipo_cuenta() {
        return tipo_cuenta;
    } 
   
    public void setCve_cuenta(String cve_cuenta) {
        this.cve_cuenta = cve_cuenta;
    }
    public String getCve_cuenta() {
        return cve_cuenta;
    }

    
    public void haber (double cantidad){
        
        
    }
    public void debe (double cantidad){
        
    }
    
    
    public String toString (){
        
        String cadena="";
        cadena=this.cve_cuenta+" "+this.nombre+" "+this.tipo_cuenta+" "+this.saldo+"\n";
        return cadena;
    }
    public String[] orden(int limite, CCuenta[] cuenta){
     String[] nomenclatura=new String[14];
     String[] codigos=new String[14];
     String[] clasificacion=new String[14];
     String[] credito=new String[14];
     for(int i=0;i<14;i++){
         nomenclatura[i]=cuenta[i].nombre;
     }    
    String aux;
    for(int i=1;i<nomenclatura.length;i++){
        for(int j=0;j<nomenclatura.length-i;j++){
            if(nomenclatura[j].compareTo(nomenclatura[j+1])>0){
                aux=nomenclatura[j];
                nomenclatura[j]=nomenclatura[j+1];
                nomenclatura[j+1]=aux;
            }
    }
}
    return nomenclatura;
}  
}
   
    /*Las clases y los metodos no imprimen nada, todo es através del return
    Esto lo hereda de la clase object
    
    Es aquella que estamos hereda sin embargo no propiamente es directo, simplememte hereda.
    Heredan de la clase object o padre
    
    11
    
    
    
    */
    

