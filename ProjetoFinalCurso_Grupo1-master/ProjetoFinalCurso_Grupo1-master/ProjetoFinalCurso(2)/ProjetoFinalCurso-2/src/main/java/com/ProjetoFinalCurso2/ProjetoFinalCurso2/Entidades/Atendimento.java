package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades;

import javax.persistence.*;

@Entity
public class Atendimento {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "hospital")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn (name = "paciente")
    private Paciente paciente;

    private boolean covid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean isCovid() {
        return covid;
    }

    public void setCovid(boolean covid) {
        this.covid = covid;
    }
}
