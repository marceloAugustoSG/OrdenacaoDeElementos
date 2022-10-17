package Metodos;

import java.util.ArrayList;

public class BubbleSort implements IMetodo {

    @Override
    public ArrayList<Double> ordenar(ArrayList<Double> numeros) {

        double aux;
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i) > numeros.get(j)) {
                    aux = numeros.get(j);
                    numeros.set(j, numeros.get(i));
                    numeros.set(i, aux);
                }
            }
        }
        return numeros;
    }

}
