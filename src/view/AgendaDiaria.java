package view;

import dao.AgendaDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Agenda;
import table.AgendaTabModel;


public class AgendaDiaria extends javax.swing.JFrame {
    SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
    String dt = data.format(new Date());
    /**
     * Creates new form AgendaDiaria
     */
    public AgendaDiaria() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/iconeSistema.jpg");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);

        lbData.setText(dt);
        tb_Agendamento.setModel(new AgendaTabModel(new AgendaDao().verificarAgendiaDiaria(dt)));
        tb_Agendamento.setVisible(true);
        
        txtIdAgendamento.setVisible(false);
        txtIdAgendamento.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Agendamento = new javax.swing.JTable();
        lbData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_Agenda_Status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnAlteraStatus = new javax.swing.JButton();
        txtIdAgendamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tb_Agendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Agendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_AgendamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Agendamento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 738, 132);
        getContentPane().add(lbData);
        lbData.setBounds(687, 221, 75, 20);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agenda do Dia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(332, 6, 91, 16);

        cb_Agenda_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendido", "Ausente" }));
        getContentPane().add(cb_Agenda_Status);
        cb_Agenda_Status.setBounds(620, 180, 90, 26);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Status:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(570, 184, 40, 16);

        btnAlteraStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnAlteraStatus.setToolTipText("Alterar Status do agendamento");
        btnAlteraStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlteraStatus);
        btnAlteraStatus.setBounds(717, 178, 45, 31);
        getContentPane().add(txtIdAgendamento);
        txtIdAgendamento.setBounds(24, 179, 54, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AgendaFundo3.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1, -3, 780, 250);

        setSize(new java.awt.Dimension(790, 286));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_AgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_AgendamentoMouseClicked
       txtIdAgendamento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_ID_AGENDAMENTO).toString());
    }//GEN-LAST:event_tb_AgendamentoMouseClicked

    private void btnAlteraStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraStatusActionPerformed
        AgendaDao agdao = new AgendaDao();
        Agenda ag = new Agenda();
        int codigo = Integer.parseInt(txtIdAgendamento.getText());
        ag.setId_agendamento(codigo);
        ag.setStatus(cb_Agenda_Status.getSelectedItem().toString());
        txtIdAgendamento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_ID_AGENDAMENTO).toString());
        agdao.alterarStatus(ag);
        
        
        
        tb_Agendamento.setModel(new AgendaTabModel(new AgendaDao().verificarAgendiaDiaria(dt)));
        tb_Agendamento.setVisible(true);// Criar novo jFrame com a tabela
        
    }//GEN-LAST:event_btnAlteraStatusActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaDiaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteraStatus;
    private javax.swing.JComboBox<String> cb_Agenda_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JTable tb_Agendamento;
    private javax.swing.JTextField txtIdAgendamento;
    // End of variables declaration//GEN-END:variables
}