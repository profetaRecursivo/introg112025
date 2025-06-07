
public class Apartamento extends Inmueble
{
    private int pagoValor;
    public Apartamento(int idInmobiliario, double area, char[] direccion, int numBanos, int pagoValor){
        super(idInmobiliario, area, direccion, numBanos);
        this.pagoValor = pagoValor;
    }
    
    
}
