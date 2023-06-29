/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.dto;

import lombok.Data;
import pe.cibertec.institution.ApiMatricula.entity.Curso;
import pe.cibertec.institution.ApiMatricula.entity.Estudiante;

/**
 *
 * @author brice
 */
@Data
public class MatriculaDto {
    
    private Long idMatricula;
    private Curso curso;
    private Estudiante estudiante;
    
}
