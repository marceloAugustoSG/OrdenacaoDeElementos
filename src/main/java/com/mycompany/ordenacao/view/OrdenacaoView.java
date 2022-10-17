package com.mycompany.ordenacao.view;

import java.awt.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class OrdenacaoView extends javax.swing.JFrame {

    public OrdenacaoView() {
        initComponents();
        this.setLocationRelativeTo(this.getParent());
        setResizable(false);
        setVisible(true);
    }

    public JButton getBntOrdenar() {
        return bntOrdenar;
    }

    public void setBntOrdenar(JButton bntOrdenar) {
        this.bntOrdenar = bntOrdenar;
    }

    public JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

    public void setBtnCarregarArquivo(JButton btnCarregarArquivo) {
        this.btnCarregarArquivo = btnCarregarArquivo;
    }

    public JComboBox<String> getCmbMetodo() {
        return cmbMetodo;
    }

    public void setCmbMetodo(JComboBox<String> cmbMetodo) {
        this.cmbMetodo = cmbMetodo;
    }

    public JRadioButton getRbtnCrescente() {
        return rbtnCrescente;
    }

    public void setRbtnCrescente(JRadioButton rbtnCrescente) {
        this.rbtnCrescente = rbtnCrescente;
    }

    public JRadioButton getRbtnDecrescente() {
        return rbtnDecrescente;
    }

    public void setRbtnDecrescente(JRadioButton rbtnDecrescente) {
        this.rbtnDecrescente = rbtnDecrescente;
    }

    public List getLslSemOrdenacao() {
        return lslSemOrdenacao;
    }

    public List getLstOrdenados() {
        return lstOrdenados;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JLabel getLblTempoNumero() {
        return lblTempoNumero;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupBtnsOrdem = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblSemOrdenacao = new javax.swing.JLabel();
        lblMetodoOrdenacao = new javax.swing.JLabel();
        lblOrdenados = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox<>();
        lstOrdenados = new java.awt.List();
        lslSemOrdenacao = new java.awt.List();
        btnCarregarArquivo = new javax.swing.JButton();
        lblTempo = new javax.swing.JLabel();
        lblTempoNumero = new javax.swing.JLabel();
        rbtnCrescente = new javax.swing.JRadioButton();
        rbtnDecrescente = new javax.swing.JRadioButton();
        bntOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSemOrdenacao.setText("Sem Ordem");

        lblMetodoOrdenacao.setText("Metodo de ordenação");

        lblOrdenados.setText("Ordenados");

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BubbleSort", "SelectionSort" }));
        cmbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoActionPerformed(evt);
            }
        });

        lslSemOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lslSemOrdenacaoActionPerformed(evt);
            }
        });

        btnCarregarArquivo.setText("Carregar Arquivo");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        lblTempo.setText("Tempo:");

        lblTempoNumero.setText("0.0          ms");

        groupBtnsOrdem.add(rbtnCrescente);
        rbtnCrescente.setText("Crescente");
        rbtnCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCrescenteActionPerformed(evt);
            }
        });

        groupBtnsOrdem.add(rbtnDecrescente);
        rbtnDecrescente.setText("Decrescente");

        bntOrdenar.setText("Ordenar");

        jLabel1.setText("Ordem");

        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lslSemOrdenacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMetodoOrdenacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnCrescente)
                            .addComponent(rbtnDecrescente)
                            .addComponent(bntOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblSemOrdenacao))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTempoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lstOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrdenados))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblMetodoOrdenacao)
                .addGap(10, 10, 10)
                .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnCrescente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnDecrescente)
                .addGap(18, 18, 18)
                .addComponent(bntOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lslSemOrdenacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrdenados)
                            .addComponent(lblSemOrdenacao))
                        .addGap(10, 10, 10)
                        .addComponent(lstOrdenados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTempo)
                            .addComponent(lblTempoNumero))))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lslSemOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lslSemOrdenacaoActionPerformed
    }//GEN-LAST:event_lslSemOrdenacaoActionPerformed

    private void rbtnCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCrescenteActionPerformed
    }//GEN-LAST:event_rbtnCrescenteActionPerformed

    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed

    private void cmbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoActionPerformed
    }//GEN-LAST:event_cmbMetodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntOrdenar;
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.ButtonGroup groupBtnsOrdem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMetodoOrdenacao;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdenacao;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTempoNumero;
    private java.awt.List lslSemOrdenacao;
    private java.awt.List lstOrdenados;
    private javax.swing.JRadioButton rbtnCrescente;
    private javax.swing.JRadioButton rbtnDecrescente;
    // End of variables declaration//GEN-END:variables
}
