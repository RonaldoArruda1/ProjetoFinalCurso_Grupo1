package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Paciente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nome_Paciente")
    private String nome_paciente;

    private String cpf;
    private String endereco;

    @OneToMany (mappedBy = "paciente")
    private Set<Atendimento > atendimentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Set<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Set<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}