/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.service;

import pe.cibertec.institution.ApiAsignacion.dto.AsignacionDto;
import pe.cibertec.institution.ApiAsignacion.entity.Asignacion;

/**
 *
 * @author brice
 */
public interface AsignacionService {
    public Asignacion add (Asignacion asignacion);
    public AsignacionDto findById (Long idAsignacion);
}
