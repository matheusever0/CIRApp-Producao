/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fortlev.cir.principal;

import br.com.fortlev.cir.bean.Material;
import br.com.fortlev.cir.dao.MaterialDAO;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.s
 */
public class TelaCadastroMaterial extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroMaterial
     */
    public TelaCadastroMaterial() {
        initComponents();
        readEmpresas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        cmbCadastradas = new javax.swing.JComboBox<>();
        lblID1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Material");
        setVisible(true);

        lblCodigo.setText("CODIGO:");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        lblID.setText("ID:");

        lblProduto.setText("PRODUTO:");

        lblDescricao.setText("DESCRIÇÃO:");

        cmbCadastradas.setEditable(true);
        cmbCadastradas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCadastradasItemStateChanged(evt);
            }
        });
        cmbCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCadastradasActionPerformed(evt);
            }
        });

        lblID1.setText("PESQUISAR CADASTRADOS:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCodigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID1)
                    .addComponent(cmbCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(txtID.getText().equals("4000000507") | txtID.getText().equals("4000000508") | txtID.getText().equals("4000000509") ){
            adicionar();
        readEmpresas(); 
        }else{
            JOptionPane.showMessageDialog(null, "Tente com um código fornecido pela empresa!");
        }
        
        
       
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cmbCadastradasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCadastradasItemStateChanged
        // seleciona o dados e extrair em tela todas as informações

        int index = cmbCadastradas.getSelectedIndex();
        if (index > 0) {
            carregarItens();
            btnCadastrar.setEnabled(false);
        } else {
            novo();
            btnCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_cmbCadastradasItemStateChanged

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        readEmpresas();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmbCadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCadastradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCadastradasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<Object> cmbCadastradas;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void adicionar() {
        try {
            MaterialDAO dao = new MaterialDAO();
            Material mat = new Material();

            mat.setCodigo(txtCodigo.getText());
            mat.setProduto(txtProduto.getText());
            mat.setDescricao(txtDescricao.getText());

            if (txtCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Está faltando o código, tente novamente.");
            } else if (txtDescricao.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Está faltando a descriçao, tente novamente.");

            } else if (txtProduto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Está faltando o nome do produto, tente novamente!");
            } else {
                if (dao.create(mat) == true) {
                    System.out.println("Material cadastrado com sucesso = true");
                    JOptionPane.showMessageDialog(null, "Material cadastrado com sucesso!");
                    txtCodigo.setText("");
                    txtProduto.setText("");
                    txtDescricao.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar, cuidado com duplicações!");
                }

            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex);
        }

    }

    public void alterar() {

    }

    public void excluir() {
        try {

            Material mat = new Material();
            MaterialDAO dao = new MaterialDAO();
            // seleciona a id
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione o produto que deseja excluir.");
            } else {
                mat.setId(Integer.parseInt(txtID.getText()));
                // deleta os dados pelo ID;

                if (dao.delete(mat) == true) {
                    JOptionPane.showMessageDialog(null, "Material excluido com sucesso!");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel deletar o material!");
        }
    }

    public void readEmpresas() {

        // criando nova DAO para tabela
        MaterialDAO dao = new MaterialDAO();

        novo();
        cmbCadastradas.removeAllItems();// remove todos os itens do combobox
        cmbCadastradas.addItem("Selecione"); // adiciona o item selecione automaticamente no combobox
        try {
            for (Material c : dao.read()) {

                cmbCadastradas.addItem(c);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR:");
        }

    }

    public void carregarItens() {

        Material mat = (Material) cmbCadastradas.getSelectedItem();

        txtID.setText(Integer.toString(mat.getId()));
        txtCodigo.setText(mat.getCodigo());
        txtDescricao.setText(mat.getDescricao());
        txtProduto.setText(mat.getProduto());

    }

    public void novo() {
        txtID.setText("");
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtProduto.setText("");
    }

}