package model;


public class Consulta {
    private int idConsulta;
    private String pacienteConsulta;
    private String docPaciente;
    private String cid;
    private int diasRepouso;
    private String horaConsulta;
    private String infoAtestado;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getPacienteConsulta() {
        return pacienteConsulta;
    }

    public void setPacienteConsulta(String pacienteConsulta) {
        this.pacienteConsulta = pacienteConsulta;
    }

    public String getDocPaciente() {
        return docPaciente;
    }

    public void setDocPaciente(String docPaciente) {
        this.docPaciente = docPaciente;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getDiasRepouso() {
        return diasRepouso;
    }

    public void setDiasRepouso(int diasRepouso) {
        this.diasRepouso = diasRepouso;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getInfoAtestado() {
        return infoAtestado;
    }

    public void setInfoAtestado(String infoAtestado) {
        this.infoAtestado = infoAtestado;
    }
    
}
