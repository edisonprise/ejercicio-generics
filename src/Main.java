import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5);
        List<String> listaCadenas = Arrays.asList("Edinson", "Anderson", "Emilio");
        ElementoUtil<Integer> utilEntero = new ElementoUtil<>();
        //utilEntero.mostrarListado(listaEnteros);
        ElementoUtil<String> utilString = new ElementoUtil<>();
        //utilString.mostrarListado(listaCadenas);
        Integer maximoEntero = utilEntero.encontrarMaximo(listaEnteros);
        System.out.println("El maximo de la lista de enteros es: " + maximoEntero);
        String maximoCadenas = utilString.encontrarMaximo(listaCadenas);
        System.out.println("El maximo de la lista de cadenas  es: " + maximoCadenas);

        
    }
}