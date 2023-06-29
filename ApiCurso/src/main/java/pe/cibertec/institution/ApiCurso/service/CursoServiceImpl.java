/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiCurso.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.institution.ApiCurso.dao.CursoRepository;
import pe.cibertec.institution.ApiCurso.entity.Curso;

/**
 *
 * @author brice
 */
@Service
public class CursoServiceImpl implements CursoService{
    
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
         return (List<Curso>) cursoRepository.findAll();
    }

    @Override
    public Curso add(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso update(Long idCurso, Curso curso) {
        Curso cursoDB = cursoRepository.findById(idCurso).get();
        cursoDB.setNombre(curso.getNombre());
        cursoDB.setCreditos(curso.getCreditos());
        cursoDB.setTurno(curso.getTurno());
        cursoDB.setCodigoCurso(curso.getCodigoCurso());
        return cursoRepository.save(cursoDB);
    }

    @Override
    public void delete(Long idCurso) {
        Curso customerDB = cursoRepository.findById(idCurso).get();
        cursoRepository.delete(customerDB);
    }

    @Override
    public Curso findById(Long idCurso) {
        return cursoRepository.findById(idCurso).
                orElseThrow(()-> 
        new EntityNotFoundException("Not found Customer with id: "+idCurso.toString())) ;
    }

    @Override
    public Curso findBycodigoCurso(String codigoCurso) {
        return cursoRepository.findBycodigoCurso(codigoCurso);
    }
    
}
