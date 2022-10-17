package Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivo {

    public Arquivo() {
    }

    public ArrayList<Double> lerArquivo() throws FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas .csv", "csv");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(filtro);

        int resposta = fileChooser.showOpenDialog(null);
        ArrayList<Double> elementos = new ArrayList<>();
        if (resposta == JFileChooser.APPROVE_OPTION) {

            File arquivoSelecionado = fileChooser.getSelectedFile();
            System.out.println("Caminho:" + arquivoSelecionado.getAbsolutePath());

            String caminhoArquivoSelecionado = arquivoSelecionado.getAbsolutePath();
            FileInputStream entrada = new FileInputStream(new File(caminhoArquivoSelecionado));
            Scanner lerArquivo = new Scanner(entrada, "UTF-8");
            String primeiraLinha = lerArquivo.nextLine();
            while (lerArquivo.hasNext()) {

                String linha = lerArquivo.nextLine();

                if (linha != null && !linha.isEmpty()) {
                    String[] dados = linha.split("\n");
                    elementos.add(Double.parseDouble(dados[0]));

                }
            }
        } else {
            System.out.println("Nenhum arquivo selecionado");
        }
        return elementos;

    }

}
