/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fortlev.cir.principal;

import br.com.fortlev.cir.bean.EntradaSaida;
import br.com.fortlev.cir.bean.Material;
import br.com.fortlev.cir.bean.Usuario;
import br.com.fortlev.cir.connection.ConexaoBancoMysql;
import br.com.fortlev.cir.dao.EntradaSaidaRefugoDAO;
import br.com.fortlev.cir.dao.MaterialDAO;
import br.com.fortlev.cir.dao.UsuarioDAO;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheus.s
 */
public class TelaEntradaRefugo extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEntradaRefugo
     */
    public TelaEntradaRefugo() {
        initComponents();
        readEmpresas();
        exibir();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        lblData = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigos = new javax.swing.JComboBox<>();
        lblMaterial = new javax.swing.JLabel();
        cmbMaterial = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblEmpilhador = new javax.swing.JLabel();
        cmbEmpilhador = new javax.swing.JComboBox<>();
        lblLetra = new javax.swing.JLabel();
        lblLetraS = new javax.swing.JLabel();
        jScrollEntrada = new javax.swing.JScrollPane();
        jTEntrada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ENTRADA DE REFUGO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtID.setEnabled(false);

        lblID.setText("ID:");

        lblData.setText("DATA:");

        lblCodigo.setText("CODIGO:");

        cmbCodigos.setEditable(true);
        cmbCodigos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCodigosItemStateChanged(evt);
            }
        });
        cmbCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigosActionPerformed(evt);
            }
        });

        lblMaterial.setText("MATERIAL:");

        cmbMaterial.setEditable(true);
        cmbMaterial.setEnabled(false);
        cmbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMaterialActionPerformed(evt);
            }
        });

        lblDescricao.setText("DESCRI????O");

        txtDescricao.setEnabled(false);

        lblQtd.setText("QUANTIDADE DA ENTRADA:");

        lblEmpilhador.setText("RESPONS??VEL:");

        cmbEmpilhador.setEditable(true);
        cmbEmpilhador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmpilhadorItemStateChanged(evt);
            }
        });

        lblLetra.setText("LETRA:");

        lblLetraS.setText("N/A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmpilhador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEmpilhador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLetra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLetraS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaterial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblDescricao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCodigos)
                        .addComponent(lblCodigo))
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID)
                        .addComponent(lblData)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterial)
                    .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtd)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpilhador)
                    .addComponent(cmbEmpilhador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLetra)
                    .addComponent(lblLetraS))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DATA", "C??DIGO", "MATERIAL", "DESCRI????O", "QTD", "EMPILHADOR", "LETRA"
            }
        ));
        jTEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEntradaMouseClicked(evt);
            }
        });
        jTEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTEntradaKeyReleased(evt);
            }
        });
        jScrollEntrada.setViewportView(jTEntrada);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdicionar.setText("Cadastrar Refugo");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Refugo");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Refugo");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollEntrada)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cmbCodigosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCodigosItemStateChanged
        multiSelecao();

    }//GEN-LAST:event_cmbCodigosItemStateChanged

    private void cmbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaterialActionPerformed

    }//GEN-LAST:event_cmbMaterialActionPerformed

    private void cmbCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigosActionPerformed

    }//GEN-LAST:event_cmbCodigosActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbCodigos.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione o c??digo");

        } else if (cmbEmpilhador.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione seu nome ou o nome do empilhador.");
        } else if (cmbMaterial.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "N??o ?? possivel cadastrar sem o c??digo do material");

        } else if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite a quantidade que deseja dar entrada no refugo!");

        } else {

            adicionar();
            novo();
            exibir();
        }


    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jTEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEntradaMouseClicked

        if (jTEntrada.getSelectedRow() != -1) {

            txtID.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 0).toString());
            txtData.setDate((Date) (jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 1)));
            cmbCodigos.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 2).toString());
            cmbMaterial.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 3).toString());
            txtDescricao.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 4).toString());
            txtQuantidade.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 5).toString());
            cmbEmpilhador.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 6).toString());
            lblLetraS.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_jTEntradaMouseClicked

    private void jTEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEntradaKeyReleased
        if (jTEntrada.getSelectedRow() != -1) {

            txtID.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 0).toString());
            txtData.setDate((Date) (jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 1)));
            cmbCodigos.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 2).toString());
            cmbMaterial.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 3).toString());
            txtDescricao.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 4).toString());
            txtQuantidade.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 5).toString());
            cmbEmpilhador.setSelectedItem(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 6).toString());
            lblLetraS.setText(jTEntrada.getModel().getValueAt(jTEntrada.getSelectedRow(), 7).toString());

        }
    }//GEN-LAST:event_jTEntradaKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        } else {
            deletar();
            novo();
            exibir();
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar.");
        } else {
            atualizar();
            novo();
            exibir();
        }


    }//GEN-LAST:event_btnAlterarActionPerformed

    private void cmbEmpilhadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmpilhadorItemStateChanged
        String usuario = cmbEmpilhador.getSelectedItem().toString();

        if (cmbEmpilhador.getSelectedItem().equals("Selecione")) {
            lblLetraS.setText("N/A");
        } else {
            usuarioLetra(usuario);
        }
    }//GEN-LAST:event_cmbEmpilhadorItemStateChanged

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cmbCodigos;
    private javax.swing.JComboBox<String> cmbEmpilhador;
    private javax.swing.JComboBox<String> cmbMaterial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollEntrada;
    private javax.swing.JTable jTEntrada;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEmpilhador;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLetra;
    private javax.swing.JLabel lblLetraS;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblQtd;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void adicionar() {

        EntradaSaida entrada = new EntradaSaida();

        EntradaSaidaRefugoDAO dao = new EntradaSaidaRefugoDAO();

        entrada.setData(txtData.getDate());
        String codig = cmbCodigos.getSelectedItem().toString();
        entrada.setCodigo(codig);
        entrada.setProduto(cmbMaterial.getSelectedItem().toString());
        entrada.setDescricao(txtDescricao.getText());
        entrada.setQuantidade(txtQuantidade.getText());
        entrada.setEmpilhador(cmbEmpilhador.getSelectedItem().toString());
        entrada.setLetra(lblLetraS.getText());
        try {
            if (dao.createEntrada(entrada) == true) {
                JOptionPane.showMessageDialog(null, "Refugo cadastrado com sucesso.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar, verifique os dados e tente novamente!");
        }

    }

    public void readEmpresas() {

        // criando nova DAO para tabela
        MaterialDAO dao = new MaterialDAO();
        UsuarioDAO daoU = new UsuarioDAO();

        novo();
        cmbCodigos.removeAllItems();// remove todos os itens do combobox
        cmbMaterial.removeAllItems();
        cmbEmpilhador.removeAllItems();
        cmbMaterial.addItem("Selecione");
        cmbEmpilhador.addItem("Selecione");
        cmbCodigos.addItem("Selecione"); // adiciona o item selecione automaticamente no combobox
        lblLetraS.setText("N/A");
        try {
            for (Material c : dao.readCodigo()) {

                cmbCodigos.addItem(c.getCodigo());

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR:");
        }

        try {
            for (Usuario c : daoU.read()) {

                cmbEmpilhador.addItem(c.getUsuario().toUpperCase());

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR:");
        }
    }

    public void novo() {
        txtID.setText("");
        txtData.setDate(null);
        cmbCodigos.setSelectedItem("Selecione");
        cmbMaterial.setSelectedItem("Selecione");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        cmbEmpilhador.setSelectedItem("Selecione");
        lblLetraS.setText("N/A");
    }

    public void multiSelecao() {

        if (!cmbCodigos.getSelectedItem().equals("Selecione")) {
            cmbMaterial.setEnabled(true);
        }

        if (cmbCodigos.getSelectedItem().equals("4000000507")) {
            txtDescricao.setText("Refugo");
            cmbMaterial.removeAllItems();
            cmbMaterial.addItem("Selecione");
            MaterialDAO dao = new MaterialDAO();
            try {
                for (Material c : dao.readMaterial()) {

                    cmbMaterial.addItem(c.getProduto().toUpperCase());

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR:");
            }
        } else if (cmbCodigos.getSelectedItem().equals("4000000508")) {
            txtDescricao.setText("Finos");
            MaterialDAO dao = new MaterialDAO();
            cmbMaterial.removeAllItems();
            cmbMaterial.addItem("Selecione");
            try {
                for (Material c : dao.readMateria2()) {

                    cmbMaterial.addItem(c.getProduto().toUpperCase());

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR:");
            }
        } else if (cmbCodigos.getSelectedItem().equals("4000000509")) {
            txtDescricao.setText("Borra");
            MaterialDAO dao = new MaterialDAO();
            cmbMaterial.removeAllItems();
            cmbMaterial.addItem("Selecione");
            try {
                for (Material c : dao.readMateria3()) {

                    cmbMaterial.addItem(c.getProduto().toUpperCase());

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR:");
            }
        } else if (cmbCodigos.getSelectedItem().equals("Selecione")) {

            txtDescricao.setText("");
            cmbMaterial.removeAllItems();
            cmbMaterial.addItem("Selecione");
            cmbMaterial.setEnabled(false);

        }
    }

    public void exibir() {

        // criando nova tabela.
        DefaultTableModel modelo = (DefaultTableModel) jTEntrada.getModel();
        modelo.setNumRows(0);
        // criando nova DAO para tabela
        EntradaSaidaRefugoDAO cdao = new EntradaSaidaRefugoDAO();
        // adicionando os valores na tablela.
        try {
            for (EntradaSaida c : cdao.readEntrada()) {
                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getData(),
                    c.getCodigo(),
                    c.getProduto(),
                    c.getDescricao(),
                    c.getQuantidade(),
                    c.getEmpilhador(),
                    c.getLetra()});

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error as listar empresas!");
        }
    }

    public void deletar() {
        Integer opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o refugo?",
                "Confirma????o", JOptionPane.OK_CANCEL_OPTION);
        if (opcao != 2 && opcao != -1) {
            //cria uma nova empresa e uma nova DAO (conex??o)
            EntradaSaida mat = new EntradaSaida();
            EntradaSaidaRefugoDAO dao = new EntradaSaidaRefugoDAO();
            // seleciona a id
            mat.setId(Integer.parseInt(txtID.getText()));
            try {
                // controller responsavel pelo delete;
                if (dao.deleteEntrada(mat) == true) {
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro na exclus??o, tente novamente!");
            }

        } else {
            novo();

        }
    }

    public void atualizar() {
        Integer opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar altera????o?",
                "Confirma????o", JOptionPane.OK_CANCEL_OPTION);
        if (opcao != 2 && opcao != -1) {

            EntradaSaidaRefugoDAO dao = new EntradaSaidaRefugoDAO();
            EntradaSaida entrada = new EntradaSaida();

            entrada.setId(Integer.parseInt(txtID.getText()));
            entrada.setData(txtData.getDate());
            entrada.setCodigo(cmbCodigos.getSelectedItem().toString());
            entrada.setProduto(cmbMaterial.getSelectedItem().toString());
            entrada.setDescricao(txtDescricao.getText());
            entrada.setQuantidade(txtQuantidade.getText());
            entrada.setEmpilhador(cmbEmpilhador.getSelectedItem().toString());
            entrada.setLetra(lblLetraS.getText());

            try {
                if (dao.updateEntrada(entrada) == true) {
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao atualizar a carga, tente novamente!");
            }
            novo();
        } else {
            JOptionPane.showMessageDialog(null, "Desfazendo altera????es...");
            novo();

        }
    }

    public void enviaRefugo() {
        Integer opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar o consumo do material?",
                "Confirma????o", JOptionPane.OK_CANCEL_OPTION);
        if (opcao != 2 && opcao != -1) {

            EntradaSaida saida = new EntradaSaida();

            EntradaSaidaRefugoDAO dao = new EntradaSaidaRefugoDAO();

            saida.setData(txtData.getDate());
            saida.setCodigo(cmbCodigos.getSelectedItem().toString());
            saida.setProduto(cmbMaterial.getSelectedItem().toString());
            saida.setDescricao(txtDescricao.getText());
            saida.setQuantidade(txtQuantidade.getText());
            saida.setEmpilhador(cmbEmpilhador.getSelectedItem().toString());
            saida.setLetra(lblLetraS.getText());

            try {
                if (dao.createSaida(saida) == true) {
                    JOptionPane.showMessageDialog(null, "Refugo consumido com sucesso.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consumir, verifique os dados e tente novamente!");
            }

        }
    }

    public void usuarioLetra(String usuario) {
        ConexaoBancoMysql conecta = new ConexaoBancoMysql();
        conecta.executaSql("SELECT * FROM tb_usuarios WHERE usuario='" + usuario + "'");
        try {
            conecta.rs.first();
            lblLetraS.setText(conecta.rs.getString("letra"));
        } catch (SQLException ex) {
            System.out.println("Usuario n??o encontrado!");
        }

    }
}
