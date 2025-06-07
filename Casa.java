
public class Casa extends Inmueble
{
    private int numPisos;
    public Casa(int idInmobiliario, double area, char[] direccion, int numBanos, int numPisos){
        super(idInmobiliario, area, direccion, numBanos);
        this.numPisos = numPisos;
    }
    
    public int getNumPisos(){
        int x = getId();
        return this.numPisos;
    }
}
