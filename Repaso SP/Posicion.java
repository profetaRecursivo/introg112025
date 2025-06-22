
public class Posicion
{
    public int x;
    public int y;
    
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public boolean esIgual(Posicion otro){
        return this.x == otro.x && this.y == otro.y;
    }
}
