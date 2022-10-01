package Metodos;

import java.util.ArrayList;
import java.util.Arrays;

public class Crescente implements IMetodo {

    @Override
    public ArrayList<Integer> calcular(ArrayList<Integer> numeros) {
        new BubbleSort().calcular(numeros);
        return numeros;
    }

}
