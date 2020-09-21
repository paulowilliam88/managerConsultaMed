/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FuncionarioDao;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("Acesso:");

        jLabel5.setText("Senha:");

        txtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncionarioActionPerformed(evt);
            }
        });

        txtAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcessoActionPerformed(evt);
            }
        });

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

        btnSalvarFuncionario.setText("SALVAR");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPAR CAMPOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAtualizarFuncinario.setText("EDITAR");
        btnAtualizarFuncinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncinarioActionPerformed(evt);
            }
        });

        btnApagarFuncionario.setText("APAGAR");
        btnApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarFuncionarioActionPerformed(evt);
            }
        });

        jLabel6.setText("PESQUISAR:");

        txtPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtAcesso, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(38, 38, 38)
                                .addComponent(btnSalvarFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarFuncinario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApagarFuncionario))
                            .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarFuncionario)
                    .addComponent(jButton2)
                    .addComponent(btnAtualizarFuncinario)
                    .addComponent(btnApagarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
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
        txtIdFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(),FuncionarioTabModel.COL_ID_FUNCIONARIO).toString());
        txtNomeFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(),FuncionarioTabModel.COL_NOME_FUNCIONARIO).toString());
        txtCargo.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(),FuncionarioTabModel.COL_CARGO).toString());
        txtAcesso.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(),FuncionarioTabModel.COL_ACESSO).toString());
        txtSenha.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(),FuncionarioTabModel.COL_SENHA).toString());
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
        int apg = JOptionPane.showConfirmDialog(null,"Deseja remover funcionario"+func.getNomeFuncionario());
        if(apg==0){
            int codigo = Integer.parseInt(txtIdFuncionario.getText());
            fDao.excluirFuncionario(codigo);
        tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));
      }else{
         tbFuncionario.setModel(new FuncionarioTabModel(new FuncionarioDao().listarFuncionario()));   
        }
    }//GEN-LAST:event_btnApagarFuncionarioActionPerformed

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
