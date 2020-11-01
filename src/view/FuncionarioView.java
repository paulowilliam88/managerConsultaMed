/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FuncionarioDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import model.Funcionario;
import table.FuncionarioTabModel;

/**
 *
 * @author Paulo
 */
public class FuncionarioView extends javax.swing.JFrame {

    Funcionario func = new Funcionario();
    FuncionarioDao fDao = new FuncionarioDao();

    public FuncionarioView() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/iconeSistema.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        setLocationRelativeTo(null);
        tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));
        txtIdFuncionario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtAcesso = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        btnSalvarFuncionario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAtualizarFuncinario = new javax.swing.JButton();
        btnApagarFuncionario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPesquisarFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 50, 20, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(26, 90, 40, 16);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 86, 40, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Acesso:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(16, 120, 50, 16);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(329, 126, 50, 20);

        txtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdFuncionario);
        txtIdFuncionario.setBounds(70, 50, 47, 24);
        getContentPane().add(txtNomeFuncionario);
        txtNomeFuncionario.setBounds(70, 80, 174, 24);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(380, 80, 104, 24);

        txtAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAcesso);
        txtAcesso.setBounds(70, 120, 112, 24);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(380, 120, 112, 24);

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 482, 116);

        btnSalvarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvarFuncionario.setToolTipText("Cadastrar funcionário.");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarFuncionario);
        btnSalvarFuncionario.setBounds(270, 170, 50, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jButton2.setToolTipText("Limpar campos.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 170, 50, 40);

        btnAtualizarFuncinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnAtualizarFuncinario.setToolTipText("Atualizar cadastro");
        btnAtualizarFuncinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarFuncinario);
        btnAtualizarFuncinario.setBounds(390, 170, 50, 40);

        btnApagarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apagar.png"))); // NOI18N
        btnApagarFuncionario.setToolTipText("Apagar cadastro.");
        btnApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagarFuncionario);
        btnApagarFuncionario.setBounds(450, 170, 50, 40);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PESQUISAR:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(117, 347, 70, 16);

        txtPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisarFuncionario);
        txtPesquisarFuncionario.setBounds(205, 343, 283, 24);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cadastro de Funcionários");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 10, 164, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundomedio.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1, 6, 520, 390);

        setSize(new java.awt.Dimension(537, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncionarioActionPerformed

    private void txtAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcessoActionPerformed

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        func.setNomeFuncionario(txtNomeFuncionario.getText());
        func.setCargo(txtCargo.getText());
        func.setAcesso(txtAcesso.getText());
        func.setSenha(txtSenha.getText());
        fDao.cadastrarFuncionario(func);
        tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));

    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtSenha.setText("");
        txtAcesso.setText("");
        txtNomeFuncionario.setText("");
        txtCargo.setText("");
        txtIdFuncionario.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked
        txtIdFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTabModel.COL_ID_FUNCIONARIO).toString());
        txtNomeFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTabModel.COL_NOME_FUNCIONARIO).toString());
        txtCargo.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTabModel.COL_CARGO).toString());
        txtAcesso.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTabModel.COL_ACESSO).toString());
        txtSenha.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTabModel.COL_SENHA).toString());
        txtIdFuncionario.setEditable(false);
        txtIdFuncionario.setEnabled(false);
    }//GEN-LAST:event_tbFuncionarioMouseClicked

    private void txtPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarFuncionarioActionPerformed
        String pesquisa = txtPesquisarFuncionario.getText();
        tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().buscarFuncionario(pesquisa)));
    }//GEN-LAST:event_txtPesquisarFuncionarioActionPerformed

    private void btnAtualizarFuncinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncinarioActionPerformed
        func.setIdFuncionario(Integer.parseInt(txtIdFuncionario.getText()));
        func.setNomeFuncionario(txtNomeFuncionario.getText());
        func.setAcesso(txtAcesso.getText());
        func.setCargo(txtCargo.getText());
        func.setSenha(txtSenha.getText());
        fDao.alterarFuncionario(func);
        tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));

    }//GEN-LAST:event_btnAtualizarFuncinarioActionPerformed

    private void btnApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarFuncionarioActionPerformed
        int apg = JOptionPane.showConfirmDialog(null, "Deseja remover funcionario" + func.getNomeFuncionario());
        if (apg == 0) {
            int codigo = Integer.parseInt(txtIdFuncionario.getText());
            fDao.excluirFuncionario(codigo);
            tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));
        } else {
            tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));
        }
    }//GEN-LAST:event_btnApagarFuncionarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarFuncionario;
    private javax.swing.JButton btnAtualizarFuncinario;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField txtAcesso;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtPesquisarFuncionario;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
