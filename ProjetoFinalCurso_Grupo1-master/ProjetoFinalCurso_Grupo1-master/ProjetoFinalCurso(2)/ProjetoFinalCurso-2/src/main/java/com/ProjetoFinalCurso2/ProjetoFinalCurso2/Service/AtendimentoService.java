package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service;

import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Atendimento;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {
@Autowired
    private AtendimentoRepository atendimentoRepository;

    public Atendimento addAtendimento (Atendimento atendimento){
        return atendimentoRepository.save(atendimento);
    }

    public List<Atendimento> getAtendimento() {return atendimentoRepository.findAll();}

    public void deleteAtendimento (Long id) {atendimentoRepository.deleteById(id);}

   //public Atendimento editAtendimentoById(Long id, String nomePaciente, String nomeHospital){
     // var atendimento = atendimentoRepository.findById(id).get();
     // atendimento.setPaciente(nomePaciente);
      //return atendimentoRepository.saveAndFlush(atendimento);
   }


