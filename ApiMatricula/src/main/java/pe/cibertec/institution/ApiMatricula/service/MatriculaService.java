/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.service;

import pe.cibertec.institution.ApiMatricula.dto.MatriculaDto;
import pe.cibertec.institution.ApiMatricula.entity.Matricula;

/**
 *
 * @author brice
 */
public interface MatriculaService {
    public Matricula add (Matricula matricula);
    public MatriculaDto findById (Long idMatricula);
}
