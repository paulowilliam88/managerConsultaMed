package view;

import com.mysql.jdbc.Connection;
import dao.AgendaDao;
import dao.ConsultaDao;
import java.lang.String;
import dao.Conexao;
import dao.FuncionarioDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import table.AgendaTabModel;
import table.PacienteTabModel;

/**
 *
 * @author Paulo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConsultaDao consuDao = new ConsultaDao();

    FuncionarioDao fnDao = new FuncionarioDao();

    public TelaPrincipal(String usuario, String perfil) {
        initComponents();
        
        URL url = this.getClass().getResource("/imagens/iconeSistema.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        labelUsuario.setText(usuario);
        lblPerfilUsuario.setText(perfil);
        
        SimpleDateFormat data = new SimpleDateFormat("yyyy/MM/dd");
        String dt = data.format(new Date());
        //lbData.setText(dt);
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbData = new javax.swing.JLabel();
        lblPerfilUsuario = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        internalFrameBemVindo = new javax.swing.JInternalFrame();
        frameInterno = new javax.swing.JPanel();
        btnCadMedicos = new javax.swing.JButton();
        btnCadEnfermeiros = new javax.swing.JButton();
        btnCadPacientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgenda = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnMedicamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFecharBemVindo = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();
        lblAcesso = new javax.swing.JLabel();
        barraFrameTelaPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadMedico = new javax.swing.JMenuItem();
        cadEnfermeiro = new javax.swing.JMenuItem();
        cadPaciente = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        agendaDiaria = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lbData);
        lbData.setBounds(450, 360, 70, 20);

        lblPerfilUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblPerfilUsuario);
        lblPerfilUsuario.setBounds(220, 370, 90, 20);

        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelUsuario);
        labelUsuario.setBounds(60, 370, 110, 20);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuário:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 370, 47, 20);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Perfil:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 370, 33, 20);

        internalFrameBemVindo.setTitle("Bem Vindo!");
        internalFrameBemVindo.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconSistema2.png"))); // NOI18N
        internalFrameBemVindo.setVisible(true);
        internalFrameBemVindo.getContentPane().setLayout(null);

        frameInterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frameInterno.setLayout(null);

        btnCadMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnMedico.png"))); // NOI18N
        btnCadMedicos.setToolTipText("Cadastro de Médicos");
        btnCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadMedicosActionPerformed(evt);
            }
        });
        frameInterno.add(btnCadMedicos);
        btnCadMedicos.setBounds(20, 0, 80, 60);

        btnCadEnfermeiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colaborador.png"))); // NOI18N
        btnCadEnfermeiros.setToolTipText("Cadastrar novo colaborador.");
        btnCadEnfermeiros.setMaximumSize(new java.awt.Dimension(79, 23));
        btnCadEnfermeiros.setMinimumSize(new java.awt.Dimension(79, 23));
        btnCadEnfermeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEnfermeirosActionPerformed(evt);
            }
        });
        frameInterno.add(btnCadEnfermeiros);
        btnCadEnfermeiros.setBounds(130, 0, 90, 60);

        btnCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacienteIcon_1.png"))); // NOI18N
        btnCadPacientes.setToolTipText("Cadastrar novo paciente.");
        btnCadPacientes.setMaximumSize(new java.awt.Dimension(79, 23));
        btnCadPacientes.setMinimumSize(new java.awt.Dimension(79, 23));
        btnCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPacientesActionPerformed(evt);
            }
        });
        frameInterno.add(btnCadPacientes);
        btnCadPacientes.setBounds(250, 0, 90, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("AGENDAMENTOS");
        frameInterno.add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 15);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda.png"))); // NOI18N
        btnAgenda.setToolTipText("Visualizar agendamentos.");
        btnAgenda.setPreferredSize(new java.awt.Dimension(70, 61));
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        frameInterno.add(btnAgenda);
        btnAgenda.setBounds(20, 100, 80, 60);

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consulta.png"))); // NOI18N
        btnConsulta.setToolTipText("Abrir Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        frameInterno.add(btnConsulta);
        btnConsulta.setBounds(370, 0, 90, 60);

        btnMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedicamentos.png"))); // NOI18N
        btnMedicamento.setToolTipText("Medicamentos");
        frameInterno.add(btnMedicamento);
        btnMedicamento.setBounds(380, 100, 70, 60);

        internalFrameBemVindo.getContentPane().add(frameInterno);
        frameInterno.setBounds(0, 60, 500, 180);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CADASTRO");
        internalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 15);

        btnFecharBemVindo.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnFecharBemVindo.setText("FECHAR");
        btnFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharBemVindoActionPerformed(evt);
            }
        });
        internalFrameBemVindo.getContentPane().add(btnFecharBemVindo);
        btnFecharBemVindo.setBounds(380, 10, 70, 26);

        getContentPane().add(internalFrameBemVindo);
        internalFrameBemVindo.setBounds(30, 50, 500, 290);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/0798adf9c191e928d86114726aaee261.jpg"))); // NOI18N
        labelFundo.setText("jLabel3");
        getContentPane().add(labelFundo);
        labelFundo.setBounds(0, 0, 560, 400);

        lblAcesso.setText("jLabel3");
        getContentPane().add(lblAcesso);
        lblAcesso.setBounds(350, 360, 41, 16);

        menuCadastro.setText("Cadastro");

        cadMedico.setText("Médicos");
        cadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(cadMedico);

        cadEnfermeiro.setText("Usuarios");
        cadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEnfermeiroActionPerformed(evt);
            }
        });
        menuCadastro.add(cadEnfermeiro);

        cadPaciente.setText("Pacientes");
        cadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadPaciente);

        barraFrameTelaPrincipal.add(menuCadastro);

        menuRelatorio.setText("Relatórios");

        jMenuItem3.setText("Médicos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem3);

        jMenuItem4.setText("Funcionário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem4);

        jMenuItem5.setText("Paciente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem5);

        jMenuItem6.setText("Agendamentos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem6);

        barraFrameTelaPrincipal.add(menuRelatorio);

        menuFerramentas.setText("Ferramentas");

        jMenuItem1.setText("Bem Vindo!");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFerramentas.add(jMenuItem1);

        jMenuItem2.setText("Consulta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuFerramentas.add(jMenuItem2);

        agendaDiaria.setText("Agenda do dia");
        agendaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaDiariaActionPerformed(evt);
            }
        });
        menuFerramentas.add(agendaDiaria);

        barraFrameTelaPrincipal.add(menuFerramentas);

        mSair.setText("Sair");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        mSair.add(menuItemSair);

        barraFrameTelaPrincipal.add(mSair);

        setJMenuBar(barraFrameTelaPrincipal);

        setSize(new java.awt.Dimension(575, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPacienteActionPerformed
        try {
            PacienteView pacTela = new PacienteView();
            pacTela.setVisible(true);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_cadPacienteActionPerformed

    private void btnFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharBemVindoActionPerformed
        internalFrameBemVindo.dispose();
    }//GEN-LAST:event_btnFecharBemVindoActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        internalFrameBemVindo.setVisible(true);
        //TelaPrincipal telap = new TelaPrincipal();
        //telap.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadMedicoActionPerformed

        if (lblPerfilUsuario.getText() != ("Administrador")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            MedicoView mv = new MedicoView();
            mv.setVisible(true);
        }

    }//GEN-LAST:event_cadMedicoActionPerformed

    private void btnCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadMedicosActionPerformed

        if (lblPerfilUsuario.getText() != ("Administrador")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            MedicoView mv = new MedicoView();
            mv.setVisible(true);
        }


    }//GEN-LAST:event_btnCadMedicosActionPerformed

    private void btnCadEnfermeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEnfermeirosActionPerformed

        if (lblPerfilUsuario.getText() != ("Administrador")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            FuncionarioView fTela = new FuncionarioView();
            fTela.setVisible(true);
        }


    }//GEN-LAST:event_btnCadEnfermeirosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       if (lblPerfilUsuario.getText() != ("Administrador") && lblPerfilUsuario.getText() != ("Médico")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            ConsultaView tela = new ConsultaView(labelUsuario.getText());
            tela.setVisible(true);
            consuDao.gerarAtendimento();
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPacientesActionPerformed
        try {
            PacienteView pacTela = new PacienteView();
            pacTela.setVisible(true);
        }catch(Exception e){
            
        }
            
    }//GEN-LAST:event_btnCadPacientesActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        AgendaView agView = new AgendaView();
        agView.setVisible(true);
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed

        if (lblPerfilUsuario.getText() != ("Administrador") && lblPerfilUsuario.getText() != ("Médico")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            ConsultaView tela = new ConsultaView(labelUsuario.getText());
            tela.setVisible(true);
            consuDao.gerarAtendimento();
        }


    }//GEN-LAST:event_btnConsultaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (lblPerfilUsuario.getText() != ("Administrador") && lblPerfilUsuario.getText() != ("Médico")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {

            Connection conn = (Connection) new Conexao().getConexao();
            String src = "report1.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conn);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (lblPerfilUsuario.getText() != ("Administrador") && lblPerfilUsuario.getText() != ("Médico")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            Connection conn = (Connection) new Conexao().getConexao();
            String src = "funcionario.jasper";
            JasperPrint jasperPrint = null;

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conn);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Connection conn = (Connection) new Conexao().getConexao();
        String src = "agenda.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        JasperViewer view = new JasperViewer(jasperPrint, false);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void agendaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaDiariaActionPerformed
        
        AgendaDiaria aD = new AgendaDiaria();
        aD.setVisible(true);
        
    }//GEN-LAST:event_agendaDiariaActionPerformed

    private void cadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEnfermeiroActionPerformed
         if (lblPerfilUsuario.getText() != ("Administrador")) {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        } else {
            FuncionarioView fTela = new FuncionarioView();
            fTela.setVisible(true);
        }
    }//GEN-LAST:event_cadEnfermeiroActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Connection conn = (Connection) new Conexao().getConexao();
            String src = "RelatorioPaciente.jasper";
            JasperPrint jasperPrint = null;
            

            try {
                jasperPrint = JasperFillManager.fillReport(src, null, conn);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendaDiaria;
    private javax.swing.JMenuBar barraFrameTelaPrincipal;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCadEnfermeiros;
    public javax.swing.JButton btnCadMedicos;
    private javax.swing.JButton btnCadPacientes;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnFecharBemVindo;
    private javax.swing.JButton btnMedicamento;
    private javax.swing.JMenuItem cadEnfermeiro;
    private javax.swing.JMenuItem cadMedico;
    private javax.swing.JMenuItem cadPaciente;
    private javax.swing.JPanel frameInterno;
    public javax.swing.JInternalFrame internalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblPerfilUsuario;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
