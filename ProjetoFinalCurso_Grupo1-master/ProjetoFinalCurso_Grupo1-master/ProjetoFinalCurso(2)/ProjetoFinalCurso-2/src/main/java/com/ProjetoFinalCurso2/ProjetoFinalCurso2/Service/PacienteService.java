package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Paciente;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository.HospitalRepository;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
@Autowired
    private PacienteRepository pacienteRepository;

    public Paciente addPaciente (Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public List<Paciente> getPaciente() {return pacienteRepository.findAll();}

    public void deletePaciente (Integer id) {pacienteRepository.deleteById(id);}

    public Paciente editPacienteById(Integer id, String nome){
        var paciente = pacienteRepository.findById(id).get();
        paciente.setNome_paciente(nome);

        return pacienteRepository.saveAndFlush(paciente);
       }
}
