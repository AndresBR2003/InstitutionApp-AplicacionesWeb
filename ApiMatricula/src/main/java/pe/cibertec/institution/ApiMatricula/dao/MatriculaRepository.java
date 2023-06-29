/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.institution.ApiMatricula.entity.Matricula;

/**
 *
 * @author brice
 */
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}
