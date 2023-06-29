/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiProfesor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.institution.ApiProfesor.entity.Profesor;

/**
 *
 * @author brice
 */
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{
    Profesor findByCodigoProfesor (String codigoProfesor);
    
}
