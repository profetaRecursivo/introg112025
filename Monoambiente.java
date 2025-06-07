

public class Monoambiente extends Apartamento
{
    public Monoambiente(int idInmobiliario, double area, char[] direccion, int numBanos, int pagoValor){
        super(idInmobiliario, area,direccion, numBanos, pagoValor);
        setNumHab(1);
    }    
}
