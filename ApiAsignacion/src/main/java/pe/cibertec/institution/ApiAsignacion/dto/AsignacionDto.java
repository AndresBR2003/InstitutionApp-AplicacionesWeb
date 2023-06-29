/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.dto;

import lombok.Data;
import pe.cibertec.institution.ApiAsignacion.entity.Curso;
import pe.cibertec.institution.ApiAsignacion.entity.Profesor;

/**
 *
 * @author brice
 */
@Data
public class AsignacionDto {
    private Long idAsignacion;
    private Curso curso;
    private Profesor profesor;
}
