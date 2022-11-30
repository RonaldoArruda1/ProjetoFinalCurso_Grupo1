package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Controler;

import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Paciente;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Paciente")
public class PacienteControler {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> listarPaciente(){
        return pacienteService.getPaciente();
    }

    @PostMapping
    public Paciente salvarPaciente(@RequestBody Paciente paciente){
        return pacienteService.addPaciente(paciente);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Object> deletaPaciente (@PathVariable(value = "id") Integer id){
        pacienteService.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/{nome}")
    public Paciente alterarPaciente (@PathVariable(value = "id") Integer id,
                                     @PathVariable(value = "nome") String nome){
        return pacienteService.editPacienteById(id, nome);
    }

}
