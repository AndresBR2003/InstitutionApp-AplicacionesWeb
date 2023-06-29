/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.institution.ApiAsignacion.entity.Asignacion;

/**
 *
 * @author brice
 */
public interface AsignacionRepository extends JpaRepository<Asignacion, Long>{
    
}
