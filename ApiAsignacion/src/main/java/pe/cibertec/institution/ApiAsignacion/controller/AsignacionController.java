/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.institution.ApiAsignacion.dto.AsignacionDto;
import pe.cibertec.institution.ApiAsignacion.entity.Asignacion;
import pe.cibertec.institution.ApiAsignacion.service.AsignacionService;

/**
 *
 * @author brice
 */
@RestController
@RequestMapping("/api/asignacion")
public class AsignacionController {
    @Autowired
    private AsignacionService asignacionService;
    
    @PostMapping("/add")
    public ResponseEntity<Asignacion> add(@RequestBody Asignacion asignacion){
        return new ResponseEntity<>(asignacionService.add(asignacion),
                HttpStatus.CREATED);
    }
    
    @GetMapping("/findById/{idAsignacion}")
    public ResponseEntity<AsignacionDto> findById(@PathVariable Long idAsignacion){
        return new ResponseEntity<>(asignacionService.findById(idAsignacion),
                HttpStatus.OK);
    }
}
