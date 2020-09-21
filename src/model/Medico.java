/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Medico {
    private int crm_medico;
    private String nome_medico;
    private String especialidade;

    public int getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(int crm_medico) {
        this.crm_medico = crm_medico;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
