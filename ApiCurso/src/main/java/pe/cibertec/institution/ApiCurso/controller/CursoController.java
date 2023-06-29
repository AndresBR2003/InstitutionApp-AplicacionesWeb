/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiCurso.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.institution.ApiCurso.entity.Curso;
import pe.cibertec.institution.ApiCurso.service.CursoService;

/**
 *
 * @author brice
 */
@RestController
@RequestMapping("/api/curso")
public class CursoController {
    
    @Autowired
    CursoService cursoService;
    
    @GetMapping("/findAll")
    public  ResponseEntity<List<Curso>> findAll(){
        return new ResponseEntity<>(cursoService.findAll(),
                HttpStatus.OK) ;
    }
    
    @GetMapping("/findById/{idCurso}")
    public ResponseEntity<Curso> findById(@PathVariable Long idCurso){
        return new ResponseEntity<>(cursoService.findById(idCurso),HttpStatus.OK) ;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Curso> add(@RequestBody Curso curso){
        return new ResponseEntity<>(cursoService.add(curso),
        HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{idCurso}")
    public ResponseEntity<Curso> update(@PathVariable Long idCurso,
            @RequestBody Curso curso){
        return new ResponseEntity<>(cursoService.update(idCurso, curso),
                HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idCurso}")
    public void delete(@PathVariable Long idCurso){
        cursoService.delete(idCurso);
    }
    
    @GetMapping("/findBycodigoCurso/{codigoCurso}")
    public ResponseEntity<Curso> findBycodigoCurso(@PathVariable String codigoCurso){
        return new ResponseEntity<>(cursoService.findBycodigoCurso(codigoCurso),HttpStatus.OK) ;
    }
    
}
