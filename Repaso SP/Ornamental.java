
public class Ornamental extends Planta
{
    private boolean estaEnFloracion;
    
    public Ornamental(String nombre, Posicion pos, boolean estaEnFloracion){
        super(nombre, pos);
        this.estaEnFloracion = estaEnFloracion;    
    }
    
    public boolean getEnFloracion(){
        return this.estaEnFloracion;
    }
}