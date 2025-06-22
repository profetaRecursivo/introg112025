
public class GuiaTuristica
{
    private Planta[] jardin;
    public boolean esListaValida(Planta[] lista){
        boolean res = true;
        for(int i = 0; i<lista.length; i++){
            Planta actual = lista[i];
            if(existe(actual)){
                if(actual instanceof Medicinal){
                    Medicinal med = (Medicinal)actual;//casteo porque se que ES EXPLICITAMENTE un Medicinal
                    if(med.getToxicidad() > 7){
                        res = false;
                    }
                }else if(actual instanceof Ornamental){
                    Ornamental orn = (Ornamental)actual;
                    if(orn.getEnFloracion() == false){
                        res = false;
                    }
                }else if(actual instanceof Protegida){
                    Protegida pro = (Protegida)actual;
                    if(pro.getNivelProteccion() == "alta"){
                        res = false;
                    }
                }
            }
        }
        return res;
    }
    
    private boolean existe(Planta p){
        boolean res = false;
        for(int i = 0; i<jardin.length; i++){
            if(p.esIgual(jardin[i])){
                res = true;
            }
        }
        return res;
    }
}
