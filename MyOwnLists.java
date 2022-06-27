/*
Enunciado
Crie a classe MyOwnLists com um método asListedSorted estático. Este método deve ter dois valores, um array de valores de um determinado tipo T e um Comparator de mesmo tipo. 
Este método deve retornar uma lista (List) de elementos do tipo T ordenados pela definição do Comparator.

Permita que seja possível transformar qualquer array de um determinado tipo em uma lista de mesmo tipo de forma ordenada.

Um exemplo de como seu método deverá ser chamado.
*/

package aulaGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List<T> asListedSorted(T[] lista, Comparator<T> comp) {

        List<T> listaOrdenada = new ArrayList<>();
        for(int i=0; i<= 5;i++){
            listaOrdenada.add(lista[i]);
        }

        listaOrdenada.sort(comp);
        return listaOrdenada;

    }
}
