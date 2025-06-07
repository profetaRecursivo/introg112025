
public class Banco
{
    private Cuenta[] cuentas;
    private int cantCuentas;
    public Banco(int tam){
        cuentas = new Cuenta[tam];
        cantCuentas = tam;
    }
    
    public boolean anadirCuenta(Cuenta c){
        boolean res;
        //antes de insertar, tengo que preguntar
        //si puedo insertar?
        if(hayEspacio()){
            res = true;
            //buscar la posicion, de la primera cuenta que es mayor a la cuenta c
            int posicion = encontrarElPrimerMayor(c.getNroCuenta());
            //que recorra todos los elementos una posicion hacia la derecha
            recorrer(posicion);
            cuentas[posicion] = c;
        }else{
            res = false;
        }
        return res;
    }
    
    private boolean hayEspacio(){
        boolean encontre = false;
        int i = 0;
        while(i < this.cantCuentas && !encontre){
            if(this.cuentas[i] == null){
                encontre = true;
            }
            i++;
        }
        return encontre;
    }
    
    private int encontrarElPrimerMayor(int nroNuevo){
        int res = -1;
        int i = 0;
        boolean encontre = false;
        while(i < this.cantCuentas && !encontre){
            if(this.cuentas[i] == null){
                encontre = true;
                res = i;
            }else{
                if(nroNuevo < this.cuentas[i].getNroCuenta()){
                    res = i;
                    encontre = true;
                }
            }
            i++;
        }
        return res;
    }
    
    private void recorrer(int pos){
        int i = this.cantCuentas - 2;
        while(i >= pos){
            this.cuentas[i+1] = this.cuentas[i];
            i--;
        }
    }
    
    public boolean eliminar(int pos){
        boolean res;
        if(pos>= 0 && pos < cantCuentas){
            res = true;
            //puedo eliminar esa posicion
            for(int i = pos; i<cantCuentas-1; i++){
                this.cuentas[i] = this.cuentas[i+1];
            }
            this.cuentas[cantCuentas-1] = null;
        }else{
            res = false;
        }
        return res;
    }
    
    public void mostrarCuentaConMenorYMayorSaldo(){
        mostrarCuentaConMenorSaldo();
        mostrarCuentaConMayorSaldo();
    }
    
    private void mostrarCuentaConMenorSaldo(){
        Cuenta menorCuenta = encontrarLaMenorCuenta();
        if(menorCuenta == null){
            System.out.println("No hay cuentas en nuestro arreglo de cuentas :(");
        }else{
            menorCuenta.mostrar();
        }
    }
    
    private Cuenta encontrarLaMenorCuenta(){
        Cuenta res = null;
        double mini = 100000000;
        for(int i = 0; i<cantCuentas; i++){
            if(this.cuentas[i] != null){
                if(this.cuentas[i].getSaldo() < mini){
                    mini = this.cuentas[i].getSaldo();
                    res = cuentas[i];
                }   
            }
        }
        return res;
    }
    
    private void mostrarCuentaConMayorSaldo(){
        Cuenta mayorCuenta = encontrarLaMayorCuenta();
        if(mayorCuenta == null){
            System.out.println("No hay cuentas en nuestro arreglo de cuentas :(");
        }else{
            mayorCuenta.mostrar();
        }
    }
    
    private Cuenta encontrarLaMayorCuenta(){
        Cuenta res = null;
        double maxi = -100000000;
        for(int i = 0; i<cantCuentas; i++){
            if(this.cuentas[i] != null){
                if(this.cuentas[i].getSaldo() > maxi){
                    maxi = this.cuentas[i].getSaldo();
                    res = cuentas[i];
                }   
            }
        }
        return res;
    }
}
