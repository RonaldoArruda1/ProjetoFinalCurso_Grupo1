package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository;

import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
 Paciente findByCpf(String CPF);
}
