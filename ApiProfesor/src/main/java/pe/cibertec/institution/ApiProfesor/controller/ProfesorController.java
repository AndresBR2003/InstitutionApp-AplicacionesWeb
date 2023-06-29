/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiProfesor.controller;

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
import pe.cibertec.institution.ApiProfesor.entity.Profesor;
import pe.cibertec.institution.ApiProfesor.service.ProfesorService;

/**
 *
 * @author brice
 */
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;
    
    @GetMapping("/findAll")
    public  ResponseEntity<List<Profesor>> findAll(){
        return new ResponseEntity<>(profesorService.findAll(),
                HttpStatus.OK) ;
    }
    
    @GetMapping("/findById/{idProfesor}")
    public ResponseEntity<Profesor> findById(@PathVariable Long idProfesor){
        return new ResponseEntity<>(profesorService.findById(idProfesor),HttpStatus.OK) ;
    }
    
    @PostMapping("/add")
    public ResponseEntity<Profesor> add(@RequestBody Profesor profesor){
        return new ResponseEntity<>(profesorService.add(profesor),
        HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{idProfesor}")
    public ResponseEntity<Profesor> update(@PathVariable Long idProfesor,
            @RequestBody Profesor estudiante){
        return new ResponseEntity<>(profesorService.update(idProfesor, estudiante),
                HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idProfesor}")
    public void delete(@PathVariable Long idProfesor){
        profesorService.delete(idProfesor);
    }
    
    @GetMapping("/findByCodigoProfesor/{codigoProfesor}")
    public ResponseEntity<Profesor> findByCodigoProfesor(@PathVariable String codigoProfesor){
        return new ResponseEntity<>(profesorService.findByCodigoProfesor(codigoProfesor),HttpStatus.OK) ;
    }
}
