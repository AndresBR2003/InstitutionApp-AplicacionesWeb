/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiProfesor.service;

import java.util.List;
import pe.cibertec.institution.ApiProfesor.entity.Profesor;

/**
 *
 * @author brice
 */
public interface ProfesorService {
    public List<Profesor> findAll();
    public Profesor add(Profesor profesor);
    public Profesor update(Long idProfesor, Profesor profesor);
    public void delete(Long idProfesor);
    
    public Profesor findById(Long idProfesor);
    
    public Profesor findByCodigoProfesor (String codigoProfesor);
}
