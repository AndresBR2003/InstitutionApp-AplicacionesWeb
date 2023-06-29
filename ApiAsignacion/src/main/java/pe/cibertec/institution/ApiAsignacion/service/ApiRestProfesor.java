/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.institution.ApiAsignacion.entity.Profesor;

/**
 *
 * @author brice
 */
@FeignClient(name="apiprofesor")
public interface ApiRestProfesor {
    @GetMapping("/api/profesor/findByCodigoProfesor/{codigoProfesor}")
    Profesor findByCodigoProfesor(@PathVariable String codigoProfesor);
}
