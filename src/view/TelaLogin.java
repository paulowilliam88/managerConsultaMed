/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import dao.FuncionarioDao;
import dao.MedicoDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class TelaLogin extends javax.swing.JFrame {
    //Conexao conn = new Conexao();

    public TelaLogin() {

        initComponents();
        //conn.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcessar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        txtNivelAcesso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        btnAcessar.setForeground(new java.awt.Color(0, 0, 0));
        btnAcessar.setText("Entrar");
        btnAcessar.setBorder(null);
        btnAcessar.setName("btnAcessar"); // NOI18N
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(190, 190, 70, 30);

        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Cancelar");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(280, 190, 90, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 80, 90, 120);

        campoSenha.setToolTipText("Senha");
        campoSenha.setName("campoSenha"); // NOI18N
        getContentPane().add(campoSenha);
        campoSenha.setBounds(190, 140, 180, 30);

        txtUsuario.setName("txtUsuario"); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(190, 100, 180, 30);
        getContentPane().add(txtNivelAcesso);
        txtNivelAcesso.setBounds(380, 100, 70, 24);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo tela_login.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, -10, 190, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(4, 4, 500, 260);

        setSize(new java.awt.Dimension(521, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        String nivelAcesso = txtNivelAcesso.getText();
        MedicoDao mdao = new MedicoDao();
        FuncionarioDao func = new FuncionarioDao();
        

        if (func.checkLogin(txtUsuario.getText(), campoSenha.getText())) {
            TelaPrincipal tela = new TelaPrincipal(txtUsuario.getText());
            tela.setVisible(true);
        } else if (mdao.checkLoginMedico(txtUsuario.getText(), campoSenha.getText())) {
            TelaPrincipal tela = new TelaPrincipal(txtUsuario.getText());
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorreto!");
        }
        

    }//GEN-LAST:event_btnAcessarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                // dispose();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNivelAcesso;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
