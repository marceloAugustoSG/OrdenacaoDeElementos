package Metodos;

import java.util.ArrayList;

public class Crescente implements IMetodo {

    @Override
    public ArrayList<Double> ordenar(ArrayList<Double> numeros) {
        new BubbleSort().ordenar(numeros);
        return numeros;
    }

}
