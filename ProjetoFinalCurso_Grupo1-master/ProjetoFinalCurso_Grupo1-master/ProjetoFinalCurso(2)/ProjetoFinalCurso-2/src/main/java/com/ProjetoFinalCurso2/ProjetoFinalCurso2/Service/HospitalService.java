package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service;

import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Hospital;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository.HospitalRepository;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Hospital addHospital (Hospital hospital) {
        return hospitalRepository.save(hospital);

    }

    public List<Hospital> getHospital(){
        return hospitalRepository.findAll();
    }

    public void deleteHospital(Integer id){
        hospitalRepository.deleteById(id);
    }

    public Hospital editHospitalById(Integer id, String nome, String endereco){
        var hospital = hospitalRepository.findById(id).get();
        hospital.setNome_Hospital(nome);
        hospital.setEndereco(endereco);

        return hospitalRepository.saveAndFlush(hospital);
    }
}