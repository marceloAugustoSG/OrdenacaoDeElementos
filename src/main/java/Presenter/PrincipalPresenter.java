package Presenter;

import Metodos.BubbleSort;
import Metodos.Crescente;
import Metodos.Decrescente;
import Metodos.SelectionSort;
import com.mycompany.odenacao.View.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PrincipalPresenter {

    private PrincipalView viewPrincipal;
    private ArrayList<Integer> elementos;
    long tempoInicial = 0, tempoFinal = 0;

    public PrincipalPresenter() {

        viewPrincipal = new PrincipalView();
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
                Logger.getLogger(PrincipalPresenter.class.getName()).log(Level.SEVERE, null, ex);
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
                    new BubbleSort().calcular(elementos);
                    tempoFinal = System.currentTimeMillis();
                    System.out.print("Bubble:");
                    System.out.printf("%.4f ms%n", (tempoFinal - tempoInicial) / 1000d);
                    viewPrincipal.getLblTempoNumero().setText((tempoFinal - tempoInicial) / 1000d + "          ms");
                    addListaOrdenada(elementos
                    );

                } else if (viewPrincipal.getCmbMetodo().getSelectedItem().toString() == "SelectionSort") {
                    tempoInicial = System.currentTimeMillis();
                    new SelectionSort().calcular(elementos);
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
            new Decrescente().calcular(elementos);
            addListaOrdenada(elementos);
        });

        viewPrincipal.getRbtnCrescente().addActionListener((ActionEvent e) -> {
            limparLista();

            new Crescente().calcular(elementos);
            addListaOrdenada(elementos);
        });

        viewPrincipal.getBtnLimpar().addActionListener((ActionEvent e) -> {
            desabilitarBtns();
            limparLista();
            viewPrincipal.getLblTempoNumero().setText("0.0          ms");
        });

    }

//funcoes tela principal
    public void addListaOrdenada(ArrayList<Integer> elementos) {
        for (Iterator<Integer> iterator = elementos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            viewPrincipal.getLstOrdenados().add(Integer.toString(next));

        }
    }

    public void addListaSemOrdem(ArrayList<Integer> elementos) {
        for (Iterator<Integer> iterator = elementos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            viewPrincipal.getLslSemOrdenacao().add(Integer.toString(next));
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
