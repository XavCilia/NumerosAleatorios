package clases;
import java.util.Random;

public class Clase_dos {
    public static void main(String[] args) {
        int aleatorio = 0;
        
        Random r = new Random();
        //El metodo nextdouble es el metodo mas cercano al metodo math random
        //para general numeros aleatorios entre un rango de numeros determinados
        aleatorio = (int) (r.nextDouble()* 100);
        System.out.println(aleatorio);
        
    }
}
