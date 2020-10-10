/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.jdbc.Connection;
import dao.AgendaDao;
import dao.Conexao;
import dao.ConsultaDao;
import dao.PacienteDao;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Agenda;
import model.Consulta;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import table.AgendaTabModel;
import table.PacienteTabModel;

/**
 *
 * @author Paulo
 */
public class ConsultaView extends javax.swing.JFrame {

    Consulta cs = new Consulta();
    ConsultaDao consulDao = new ConsultaDao();
    Agenda ag = new Agenda();
    AgendaDao agDao = new AgendaDao();

    public ConsultaView() {
        initComponents();
        txtDataAtendimento.setEnabled(false);
        txtDataAtendimento.setEnabled(false);
        txtRgPaciente.setEnabled(false);

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPacienteAtendimento = new javax.swing.JTextField();
        txtRepousoDias = new javax.swing.JTextField();
        txtDataAtendimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTxtInfoAtestado = new javax.swing.JTextArea();
        frameTabelaAtendimento = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Agendamento = new javax.swing.JTable();
        btnImprimirAtestado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSalvarAtestado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        cb_Agenda_Status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtRgPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdAgendamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Atendimento");

        jLabel2.setText("Busca Agendamentos:");

        jLabel4.setText("Repouso de ");

        jLabel5.setText("dias.");

        jLabel6.setText("Data:");

        txtPacienteAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteAtendimentoActionPerformed(evt);
            }
        });

        areaTxtInfoAtestado.setColumns(20);
        areaTxtInfoAtestado.setRows(5);
        jScrollPane1.setViewportView(areaTxtInfoAtestado);

        frameTabelaAtendimento.setVisible(true);

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
        jScrollPane2.setViewportView(tb_Agendamento);

        javax.swing.GroupLayout frameTabelaAtendimentoLayout = new javax.swing.GroupLayout(frameTabelaAtendimento.getContentPane());
        frameTabelaAtendimento.getContentPane().setLayout(frameTabelaAtendimentoLayout);
        frameTabelaAtendimentoLayout.setHorizontalGroup(
            frameTabelaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTabelaAtendimentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameTabelaAtendimentoLayout.setVerticalGroup(
            frameTabelaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTabelaAtendimentoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        btnImprimirAtestado.setText("Imprimir Atestado");
        btnImprimirAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirAtestadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Informações e recomendaçoes.");

        btnSalvarAtestado.setText("Novo Atendimento");
        btnSalvarAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAtestadoActionPerformed(evt);
            }
        });

        jLabel8.setText("CID:");

        jLabel9.setText("Hora:");

        cb_Agenda_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendado", "Atendido", "Cancelado", " " }));

        jLabel10.setText("Status:");

        jLabel3.setText("RG:");

        txtIdAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(frameTabelaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRepousoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addGap(471, 471, 471))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvarAtestado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnImprimirAtestado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(txtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPacienteAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_Agenda_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 456, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPacienteAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cb_Agenda_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtRepousoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frameTabelaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirAtestado)
                    .addComponent(btnSalvarAtestado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPacienteAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteAtendimentoActionPerformed
        String pesquisa = txtPacienteAtendimento.getText();
        tb_Agendamento.setModel(new AgendaTabModel(new AgendaDao().buscarAgendamento(pesquisa)));
        frameTabelaAtendimento.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteAtendimentoActionPerformed

    private void btnSalvarAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAtestadoActionPerformed
        consulDao.gerarAtendimento();
    }//GEN-LAST:event_btnSalvarAtestadoActionPerformed

    private void tb_AgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_AgendamentoMouseClicked
        txtPacienteAtendimento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_NOME_PACIENTE).toString());
        txtDataAtendimento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_DATA_AGENDAMENTO).toString());
        txtHora.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_HORARIO).toString());
        //txtAtendimentoRG.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(),AgendaTabModel.).toString());
        txtPacienteAtendimento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_NOME_PACIENTE).toString());
        txtRgPaciente.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_RG_PACIENTE).toString());
        txtIdAgendamento.setText(tb_Agendamento.getValueAt(tb_Agendamento.getSelectedRow(), AgendaTabModel.COL_ID_AGENDAMENTO).toString());
    }//GEN-LAST:event_tb_AgendamentoMouseClicked

    private void btnImprimirAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirAtestadoActionPerformed
        //Salva atestado no banco apenas para impressão
        cs.setPacienteConsulta(txtPacienteAtendimento.getText());
        cs.setDocPaciente(txtRgPaciente.getText());
        cs.setDiasRepouso(Integer.parseInt(txtRepousoDias.getText()));
        cs.setCid(txtCid.getText());
        cs.setHoraConsulta(txtHora.getText());
        cs.setInfoAtestado(areaTxtInfoAtestado.getText());
        consulDao.salvarAtestado(cs);
        //Atualizando o Status do agendamento
        int codAgenda = Integer.parseInt(txtIdAgendamento.getText());
        ag.setId_agendamento(codAgenda);
        ag.setStatus(cb_Agenda_Status.getSelectedItem().toString());
        agDao.alterarStatus(ag);
        //Gerando arquivo em pdf com os dados informados.
        Connection conn = (Connection) new Conexao().getConexao();
        String src = "atestado.jasper";
        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        JasperViewer view = new JasperViewer(jasperPrint, false);
        view.setVisible(true);
        tb_Agendamento.setModel(new AgendaTabModel(new AgendaDao().listarAgendamento()));
    }//GEN-LAST:event_btnImprimirAtestadoActionPerformed

    private void txtIdAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAgendamentoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTxtInfoAtestado;
    private javax.swing.JButton btnImprimirAtestado;
    private javax.swing.JButton btnSalvarAtestado;
    private javax.swing.JComboBox<String> cb_Agenda_Status;
    private javax.swing.JInternalFrame frameTabelaAtendimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_Agendamento;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtDataAtendimento;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdAgendamento;
    private javax.swing.JTextField txtPacienteAtendimento;
    private javax.swing.JTextField txtRepousoDias;
    private javax.swing.JTextField txtRgPaciente;
    // End of variables declaration//GEN-END:variables
}
