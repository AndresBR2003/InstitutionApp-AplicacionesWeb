/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.institution.ApiCurso.service;

import java.util.List;
import pe.cibertec.institution.ApiCurso.entity.Curso;

/**
 *
 * @author brice
 */
public interface CursoService {
    public List<Curso> findAll();
    public Curso add(Curso curso);
    public Curso update(Long idCurso, Curso curso);
    public void delete(Long idCurso);
    
    public Curso findById(Long idCurso);
    public Curso findBycodigoCurso(String codigoCurso);
}
