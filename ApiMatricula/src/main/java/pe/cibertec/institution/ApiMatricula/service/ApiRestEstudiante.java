/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.institution.ApiMatricula.entity.Estudiante;

/**
 *
 * @author brice
 */
@FeignClient(name="apiestudiante")
public interface ApiRestEstudiante {
    
    @GetMapping("/api/estudiante/findBycodigoEstudiante/{codigoEstudiante}")
    Estudiante findBycodigoEstudiante(@PathVariable String codigoEstudiante);
}
