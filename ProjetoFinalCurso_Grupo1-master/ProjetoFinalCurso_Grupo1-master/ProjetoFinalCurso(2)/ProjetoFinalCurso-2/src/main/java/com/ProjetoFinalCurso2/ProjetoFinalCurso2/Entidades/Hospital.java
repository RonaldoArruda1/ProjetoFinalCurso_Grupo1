package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hospital {
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome_Hospital() {
        return Nome_Hospital;
    }

    public void setNome_Hospital(String nome_Hospital) {
        Nome_Hospital = nome_Hospital;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Nome_Hospital")
    private String Nome_Hospital;

    private String Endereco;

    @OneToMany (mappedBy = "hospital")
    private Set<Atendimento > atendimentos;


}