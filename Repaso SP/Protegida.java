




public class Protegida extends Planta
{
    private String grado;
    
    public Protegida(String nombre, Posicion pos, String grado){
        super(nombre, pos);
        this.grado = grado;
    }
    
    public String getNivelProteccion(){
        return this.grado;
    }
}