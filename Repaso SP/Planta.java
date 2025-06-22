
public class Planta
{
    private String nombre;
    private Posicion pos;
    
    public Planta(String nombre, Posicion pos){
        this.nombre = nombre;
        this.pos = pos;
    }
    
    public boolean esIgual(Planta otra){
        boolean res = this.nombre.equals(otra.nombre) && this.pos.esIgual(otra.pos);
        return res;
    }
}
