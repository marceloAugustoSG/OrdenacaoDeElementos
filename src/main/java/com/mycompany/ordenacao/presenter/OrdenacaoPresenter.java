package com.mycompany.ordenacao.presenter;

import Services.Arquivo;
import Metodos.BubbleSort;
import Metodos.Crescente;
import Metodos.Decrescente;
import Metodos.SelectionSort;
import com.mycompany.ordenacao.view.OrdenacaoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdenacaoPresenter {

    private OrdenacaoView viewPrincipal;
    private ArrayList<Double> elementos;
    long tempoInicial = 0, tempoFinal = 0;

    public OrdenacaoPresenter() {

        viewPrincipal = new OrdenacaoView();
        elementos = new ArrayList<>();
        desabilitarBtns();
        viewPrincipal.getBntOrdenar().setEnabled(false);
        viewPrincipal.getBtnCarregarArquivo().addActionListener((ActionEvent e) -> {
            viewPrincipal.getBntOrdenar().setEnabled(true);
            viewPrincipal.getLslSemOrdenacao().removeAll();
            try {
                elementos = new Arquivo().lerArquivo();
                addListaSemOrdem(elementos);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OrdenacaoPresenter.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        viewPrincipal.getBntOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarBtns();

                if (viewPrincipal.getLstOrdenados().getSize().height != 0) {
                    limparLista();
                }

                if (viewPrincipal.getCmbMetodo().getSelectedItem().toString() == "BubbleSort") {
                    tempoInicial = System.currentTimeMillis();
                    new BubbleSort().ordenar(elementos);
                    tempoFinal = System.currentTimeMillis();
                    System.out.print("Bubble:");
                    System.out.printf("%.4f ms%n", (tempoFinal - tempoInicial) / 1000d);
                    viewPrincipal.getLblTempoNumero().setText((tempoFinal - tempoInicial) / 1000d + "          ms");
                    addListaOrdenada(elementos
                    );

                } else if (viewPrincipal.getCmbMetodo().getSelectedItem().toString() == "SelectionSort") {
                    tempoInicial = System.currentTimeMillis();
                    new SelectionSort().ordenar(elementos);
                    tempoFinal = System.currentTimeMillis();
                    System.out.print("Selection:");
                    System.out.printf("%.4f ms%n", (tempoFinal - tempoInicial) / 1000d);
                    viewPrincipal.getLblTempoNumero().setText((tempoFinal - tempoInicial) / 1000d + "          ms");
                    addListaOrdenada(elementos);

                }

            }
        });

        viewPrincipal.getRbtnDecrescente().addActionListener((ActionEvent e) -> {

            limparLista();
            new Decrescente().ordenar(elementos);
            addListaOrdenada(elementos);
        });

        viewPrincipal.getRbtnCrescente().addActionListener((ActionEvent e) -> {
            limparLista();

            new Crescente().ordenar(elementos);
            addListaOrdenada(elementos);
        });

        viewPrincipal.getBtnLimpar().addActionListener((ActionEvent e) -> {
            desabilitarBtns();
            limparLista();
            viewPrincipal.getLblTempoNumero().setText("0.0          ms");
        });

    }

//funcoes tela principal
    public void addListaOrdenada(ArrayList<Double> elementos) {
        for (Iterator<Double> iterator = elementos.iterator(); iterator.hasNext();) {
            Double next = iterator.next();
            viewPrincipal.getLstOrdenados().add(Double.toString(next));

        }
    }

    public void addListaSemOrdem(ArrayList<Double> elementos) {
        for (Iterator<Double> iterator = elementos.iterator(); iterator.hasNext();) {
            Double next = iterator.next();
            viewPrincipal.getLslSemOrdenacao().add(Double.toString(next));
        }
    }

    public void limparLista() {
        viewPrincipal.getLstOrdenados().removeAll();

    }

    public void habilitarBtns() {

        viewPrincipal.getRbtnCrescente().setEnabled(true);
        viewPrincipal.getRbtnDecrescente().setEnabled(true);
    }

    public void desabilitarBtns() {

        viewPrincipal.getRbtnCrescente().setEnabled(false);
        viewPrincipal.getRbtnDecrescente().setEnabled(false);
    }

}
