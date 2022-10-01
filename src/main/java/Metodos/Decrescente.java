package Metodos;

import java.util.ArrayList;
import java.util.Arrays;

public class Decrescente implements IMetodo {

    @Override
    public ArrayList<Integer> calcular(ArrayList<Integer> numeros) {
        for (int i = 1; i < numeros.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (numeros.get(i) > numeros.get(j)) {
                    int aux = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, aux);
                }
            }
        }
        return numeros;
    }

}
