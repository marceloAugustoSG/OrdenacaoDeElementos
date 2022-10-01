package Metodos;

import java.util.ArrayList;

public class SelectionSort implements IMetodo {

    @Override
    public ArrayList<Integer> calcular(ArrayList<Integer> numeros) {
        int posicao_menor, aux;
        for (int i = 0; i < numeros.size(); i++) {
            posicao_menor = i;
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(j) < numeros.get(posicao_menor)) {
                    posicao_menor = j;
                }
            }
            aux = numeros.get(posicao_menor);
            numeros.set(posicao_menor, numeros.get(i));
            numeros.set(i, aux);
        }
        return numeros;
    }

}
