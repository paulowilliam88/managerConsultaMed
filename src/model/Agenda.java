package model;

public class Agenda {
    private int id_agendamento;
    private String paciente_nome;
    private String docPaciente;
    private String data_agendamento;
    private String horario;
    private String profissional;
    private String especialidade;
    private String status;

    public String getDocPaciente() {
        return docPaciente;
    }

    public void setDocPaciente(String docPaciente) {
        this.docPaciente = docPaciente;
    }

    
    public int getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public String getPaciente_nome() {
        return paciente_nome;
    }

    public void setPaciente_nome(String paciente_nome) {
        this.paciente_nome = paciente_nome;
    }

    public String getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(String data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
