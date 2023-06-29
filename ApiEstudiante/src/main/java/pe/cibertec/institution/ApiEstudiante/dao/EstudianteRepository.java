/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiEstudiante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.institution.ApiEstudiante.entity.Estudiante;

/**
 *
 * @author brice
 */
public interface EstudianteRepository extends JpaRepository<Estudiante ,Long >{
    Estudiante findBycodigoEstudiante (String codigoEstudiante);
}
