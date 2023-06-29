/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiCurso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.institution.ApiCurso.entity.Curso;

/**
 *
 * @author brice
 */
public interface CursoRepository extends JpaRepository<Curso, Long>{
    Curso findBycodigoCurso (String codigoCurso);
}
