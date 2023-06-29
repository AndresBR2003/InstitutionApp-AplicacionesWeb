/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.institution.ApiMatricula.dto.MatriculaDto;
import pe.cibertec.institution.ApiMatricula.entity.Matricula;
import pe.cibertec.institution.ApiMatricula.service.MatriculaService;

/**
 *
 * @author brice
 */
@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {
    
    @Autowired
    private MatriculaService matriculaService;
    
    @PostMapping("/add")
    public ResponseEntity<Matricula> add(@RequestBody Matricula matricula){
        return new ResponseEntity<>(matriculaService.add(matricula),
                HttpStatus.CREATED);
    }
    
    @GetMapping("/findById/{idMatricula}")
    public ResponseEntity<MatriculaDto> findById(@PathVariable Long idMatricula){
        return new ResponseEntity<>(matriculaService.findById(idMatricula),
                HttpStatus.OK);
    }
    
}
