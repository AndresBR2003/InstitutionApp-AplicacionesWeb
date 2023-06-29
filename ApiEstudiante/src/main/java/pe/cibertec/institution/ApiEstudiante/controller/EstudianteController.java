/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiEstudiante.controller;

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
import pe.cibertec.institution.ApiEstudiante.entity.Estudiante;
import pe.cibertec.institution.ApiEstudiante.service.EstudianteService;

/**
 *
 * @author brice
 */
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
     @Autowired
    EstudianteService estudianteService;
    
     @GetMapping("/findAll")
    public  ResponseEntity<List<Estudiante>> findAll(){
        return new ResponseEntity<>(estudianteService.findAll(),
                HttpStatus.OK) ;
    }
    
    @GetMapping("/findById/{idEstudiante}")
    public ResponseEntity<Estudiante> findById(@PathVariable Long idEstudiante){
        return new ResponseEntity<>(estudianteService.findById(idEstudiante),HttpStatus.OK) ;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Estudiante> add(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudianteService.add(estudiante),
        HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{idEstudiante}")
    public ResponseEntity<Estudiante> update(@PathVariable Long idEstudiante,
            @RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudianteService.update(idEstudiante, estudiante),
                HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idEstudiante}")
    public void delete(@PathVariable Long idEstudiante){
        estudianteService.delete(idEstudiante);
    }
    
    @GetMapping("/findBycodigoEstudiante/{codigoEstudiante}")
    public ResponseEntity<Estudiante> findBycodigoEstudiante(@PathVariable String codigoEstudiante){
        return new ResponseEntity<>(estudianteService.findBycodigoEstudiante(codigoEstudiante),HttpStatus.OK) ;
    }
}
