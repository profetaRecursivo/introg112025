
public class Cesar
{
    public char[] cifrar(char[] palabra, int desplazamiento){
        int longitud = palabra.length;
        char[] res = new char[longitud];
        for(int i = 0; i<longitud; i++){
            res[i] = desplazar(palabra[i], desplazamiento);
        }
        return res;
    }
    
    private char desplazar(char caracter, int posiciones){
        int asciiDeLaA = (int)'a'; //97
        char[] alfabeto = new char[26];
        for(int i = 0; i<26; i++){
            alfabeto[i] = (char)(asciiDeLaA+i);
        }
        int posDelCaracter = caracter%asciiDeLaA;
        //[0, 25]
        posDelCaracter = (posDelCaracter + posiciones)%26;
        char res = alfabeto[posDelCaracter];
        return res;
    }
    
    private char otrodesplazar(char caracter, int posiciones){
        char res;
        res = (char)(((int)(caracter) % ((int)'a') + posiciones)%26 + (int)'a');
        return res;
    }
}
