public class Cuenta
{
    //atributos
    private int nroCuenta;
    private double saldo;
    //constructor(es)
    public Cuenta(int nroCuenta){
        this.nroCuenta = nroCuenta;
        this.saldo = 0.0;
    }
    
    //metodos
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double nuevo){
        this.saldo = nuevo;
    }
    
    public void mostrar(){
        System.out.println("La cuenta # " + this.nroCuenta + " tiene un saldo de: " + this.saldo);
    }
    
    //si una cuenta tiene mas saldo que otra
    public boolean tieneMasSaldo(Cuenta otra){
        boolean res;
        if(otra.saldo > this.saldo){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
}
