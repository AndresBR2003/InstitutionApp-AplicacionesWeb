/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiEstudiante.service;

import java.util.List;
import pe.cibertec.institution.ApiEstudiante.entity.Estudiante;

/**
 *
 * @author brice
 */
public interface EstudianteService {
    public List<Estudiante> findAll();
    public Estudiante add(Estudiante estudiante);
    public Estudiante update(Long idEstudiante, Estudiante estudiante);
    public void delete(Long idEstudiante);
    
    public Estudiante findById(Long idEstudiante);
    
    public Estudiante findBycodigoEstudiante (String codigoEstudiante);
}
