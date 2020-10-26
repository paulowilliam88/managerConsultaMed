
package model;


public class Medicamento {
   private int codigo;
   private String medicamento;
   private int quantidade;
   private String paciente_nome;
   private String rg_paciente;
   private String medico;
   private int qtd_liberada;
   private String data_entrega;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
                
        this.quantidade = quantidade;
        
    }

    public String getPaciente_nome() {
        return paciente_nome;
    }

    public void setPaciente_nome(String paciente_nome) {
        this.paciente_nome = paciente_nome;
    }

    public String getRg_paciente() {
        return rg_paciente;
    }

    public void setRg_paciente(String rg_paciente) {
        this.rg_paciente = rg_paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public int getQtd_liberada() {
        return qtd_liberada;
    }

    public void setQtd_liberada(int qtd_liberada) {
        this.qtd_liberada = qtd_liberada;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }
   
}
