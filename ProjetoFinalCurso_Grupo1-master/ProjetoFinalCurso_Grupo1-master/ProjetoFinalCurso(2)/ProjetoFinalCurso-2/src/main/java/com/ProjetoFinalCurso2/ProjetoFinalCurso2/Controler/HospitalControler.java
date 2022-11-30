package com.ProjetoFinalCurso2.ProjetoFinalCurso2.Controler;

import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Entidades.Hospital;
import com.ProjetoFinalCurso2.ProjetoFinalCurso2.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hospital")
public class HospitalControler {

        @Autowired
        private HospitalService hospitalService;

        @GetMapping
        public List<Hospital> listarHospital() {
                return hospitalService.getHospital();
        }

        @PostMapping
        public Hospital salvarHospital(@RequestBody Hospital hospital){
                return hospitalService.addHospital(hospital);
        }

        @DeleteMapping ("/{id}")
        public ResponseEntity<Object> deletaHospital (@PathVariable(value = "id") Integer id){
                 hospitalService.deleteHospital(id);
                 return ResponseEntity.noContent().build();
        }

        @PatchMapping
                public Hospital alterarHospital(@PathVariable(value = "id") Integer id,
                                        @PathVariable(value = "nome") String nome,
                                        @PathVariable(value = "endereco") String endereco){
                return hospitalService.editHospitalById(id, nome, endereco);
        }
}