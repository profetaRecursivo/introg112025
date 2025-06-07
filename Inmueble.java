//averiguen strings, y arraylists
public class Inmueble
{
    private int idInmobiliario;
    protected double area;
    private char[] direccion;
    private int numHab;
    private int numBanos;
    
    public Inmueble(int idInmobiliario, double area, char[] direccion, int numBanos){
        this.idInmobiliario = idInmobiliario;
        this.area = area;
        this.direccion = direccion;
        this.numHab = 0;
        this.numBanos = numBanos;
    }
    
    public int getId(){
        return this.idInmobiliario;
    }
    
    public void setNumHab(int nuevoNumHab){
        this.numHab = nuevoNumHab;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public char[] getDireccion(){
        return this.direccion;
    }
    
    public int getNumHab(){
        return numHab;
    }
    
    public int getNumBanos(){
        return numBanos;
    }
}
