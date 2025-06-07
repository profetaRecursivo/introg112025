

public class Alcaldia
{
    private Inmueble[] registro;
    
    public Alcaldia(Inmueble[] registro){
        this.registro = registro;
    }
    
    public int contarMonoambientes(){
        int res = 0;
        for(int i = 0; i<registro.length; i++){
            if(registro[i] instanceof Monoambiente){
                res++;
            }
        }
        return res;
    }
    
    public void ordenar(){
        int n = registro.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(registro[j].getId() > registro[j+1].getId()){
                    Inmueble aux = registro[j];
                    registro[j] = registro[j+1];
                    registro[j+1] = aux;
                }
            }
        }
    }
}
