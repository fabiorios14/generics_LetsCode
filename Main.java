/*
Enunciado
Crie a classe MyOwnLists com um método asListedSorted estático. Este método deve ter dois valores, um array de valores de um determinado tipo T e um Comparator de mesmo tipo. 
Este método deve retornar uma lista (List) de elementos do tipo T ordenados pela definição do Comparator.

Permita que seja possível transformar qualquer array de um determinado tipo em uma lista de mesmo tipo de forma ordenada.
*/

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] nomes = new String[6];
        Comparator<String> cmp = Comparator.comparingInt(String::length);
        nomes[0] = "Fabio";
        nomes[1] = "Rios";
        nomes[2] = "Miranda";
        nomes[3] = "Banco";
        nomes[4] = "do";
        nomes[5] = "Brasil";
        List<String> novoArrayList = MyOwnLists.asListedSorted(nomes, cmp);
        System.out.println(novoArrayList);


        Integer[] numeros = new Integer[7];
        Comparator<Integer> cmp2 = Comparator.comparingInt(Integer::intValue);
        numeros[0] = 10;
        numeros[1] = 2;
        numeros[2] = 5;
        numeros[3] = 8;
        numeros[4] = 11;
        numeros[5] = 7;
        numeros[6] = 9;
        List<Integer> novoArrayList2 = MyOwnLists.asListedSorted(numeros, cmp2);
        System.out.println(novoArrayList2);


        Empregados[] empregados = new Empregados[8];
        Comparator<Empregados> cmp3 = Comparator.comparingInt(Empregados::getMatricula);
        empregados[0] = new Empregados("Fabio", 20);
        empregados[1] = new Empregados("Felipe", 18);
        empregados[2] = new Empregados("Ana", 25);
        empregados[3] = new Empregados("Joao", 12);
        empregados[4] = new Empregados("Jose", 15);
        empregados[5] = new Empregados("Maria", 10);
        empregados[6] = new Empregados("Pedro", 16);
        empregados[7] = new Empregados("Gabriel", 22);
        List<Empregados> novoArrayList3 = MyOwnLists.asListedSorted(empregados, cmp3);
        System.out.println(novoArrayList3);

    }
}
