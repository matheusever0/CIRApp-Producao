package br.com.fortlev.cir.principal;

import br.com.fortlev.cir.connection.ConexaoBancoMysql;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.s
 */
public class TelaDashboard extends javax.swing.JInternalFrame {

    ConexaoBancoMysql conecta = new ConexaoBancoMysql();

    /**
     * Creates new form TelaDashboard
     */
    public TelaDashboard() {
        initComponents();
        resumo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConformidade = new javax.swing.JPanel();
        lblConformidade = new javax.swing.JLabel();
        lblImageC = new javax.swing.JLabel();
        PanelFinos = new javax.swing.JPanel();
        lblFinos = new javax.swing.JLabel();
        lblImageF = new javax.swing.JLabel();
        PanelBorras = new javax.swing.JPanel();
        lblBorras = new javax.swing.JLabel();
        lblImageB = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder("")));
        setClosable(true);
        setIconifiable(true);

        PanelConformidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "Não Conforme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 48)))); // NOI18N

        lblConformidade.setFont(new java.awt.Font("sansserif", 0, 72)); // NOI18N
        lblConformidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConformidade.setText("NãoConformidade");

        lblImageC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fortlev/cir/images/nconforme.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelConformidadeLayout = new javax.swing.GroupLayout(PanelConformidade);
        PanelConformidade.setLayout(PanelConformidadeLayout);
        PanelConformidadeLayout.setHorizontalGroup(
            PanelConformidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblConformidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelConformidadeLayout.setVerticalGroup(
            PanelConformidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConformidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConformidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        PanelFinos.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "Finos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 48)))); // NOI18N

        lblFinos.setFont(new java.awt.Font("sansserif", 0, 72)); // NOI18N
        lblFinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinos.setText("Finos");

        lblImageF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fortlev/cir/images/nconforme.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelFinosLayout = new javax.swing.GroupLayout(PanelFinos);
        PanelFinos.setLayout(PanelFinosLayout);
        PanelFinosLayout.setHorizontalGroup(
            PanelFinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFinosLayout.createSequentialGroup()
                .addGroup(PanelFinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImageF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelFinosLayout.setVerticalGroup(
            PanelFinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFinosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        PanelBorras.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "Borras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 48)))); // NOI18N

        lblBorras.setFont(new java.awt.Font("sansserif", 0, 72)); // NOI18N
        lblBorras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorras.setText("Borras");

        lblImageB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fortlev/cir/images/nconforme.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelBorrasLayout = new javax.swing.GroupLayout(PanelBorras);
        PanelBorras.setLayout(PanelBorrasLayout);
        PanelBorrasLayout.setHorizontalGroup(
            PanelBorrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBorrasLayout.createSequentialGroup()
                .addComponent(lblBorras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBorrasLayout.setVerticalGroup(
            PanelBorrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBorras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFinos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBorras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelConformidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelConformidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(PanelFinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelBorras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBorras;
    private javax.swing.JPanel PanelConformidade;
    private javax.swing.JPanel PanelFinos;
    private javax.swing.JLabel lblBorras;
    private javax.swing.JLabel lblConformidade;
    private javax.swing.JLabel lblFinos;
    private javax.swing.JLabel lblImageB;
    private javax.swing.JLabel lblImageC;
    private javax.swing.JLabel lblImageF;
    // End of variables declaration//GEN-END:variables

    public void resumo() {
        try {
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_consumo WHERE codigo = '4000000507') AS total;");
            conecta.rs.first();
            int numero07c = conecta.rs.getInt(1);
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_consumo WHERE codigo = '4000000508') AS total;");
            conecta.rs.first();
            int numero08c = conecta.rs.getInt(1);
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_consumo WHERE codigo = '4000000509') AS total;");
            conecta.rs.first();
            int numero09c = conecta.rs.getInt(1);
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_entrada WHERE codigo = '4000000507') AS total;");
            conecta.rs.first();
            int numero07m = conecta.rs.getInt(1);
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_entrada WHERE codigo = '4000000508') AS total;");
            conecta.rs.first();
            int numero08m = conecta.rs.getInt(1);
            conecta = ConexaoBancoMysql.getInstance();
            conecta.executaSql("SELECT SUM(quantidade) FROM (SELECT material, quantidade FROM tb_entrada WHERE codigo = '4000000509') AS total;");
            conecta.rs.first();
            int numero09m = conecta.rs.getInt(1);

            int total507 = numero07m - numero07c;
            int total508 = numero08m - numero08c;
            int total509 = numero09m - numero09c;
            
            
            lblConformidade.setText(Integer.toString(total507) + "KG");
            lblFinos.setText(Integer.toString(total508) + "KG");
            lblBorras.setText(Integer.toString(total509) + "KG");
            

        } catch (SQLException ex) {

            System.out.println("ERRO" + ex);
        }
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
}
