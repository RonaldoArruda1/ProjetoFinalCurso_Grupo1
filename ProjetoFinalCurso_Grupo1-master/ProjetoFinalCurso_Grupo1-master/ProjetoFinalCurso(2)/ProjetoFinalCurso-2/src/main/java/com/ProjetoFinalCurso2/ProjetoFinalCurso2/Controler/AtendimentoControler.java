package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Controler;


import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Atendimento;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Atendimento")

public class AtendimentoControler {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public List<Atendimento> listarAtendimento(){
        return atendimentoService.getAtendimento();
    }

    @PostMapping
    public Atendimento salvarAtendimento(@RequestBody Atendimento atendimento){
        return atendimentoService.addAtendimento(atendimento);
    }

}
