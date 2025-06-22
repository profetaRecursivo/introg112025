





public class Medicinal extends Planta
{
    private int toxicidad;
    public Medicinal(String nombre, Posicion pos, int toxicidad){
        super(nombre, pos);
        this.toxicidad = toxicidad;
    }
    
    public int getToxicidad(){
        return this.toxicidad;
    }
}
