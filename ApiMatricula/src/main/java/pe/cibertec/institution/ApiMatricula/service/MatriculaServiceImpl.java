/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.institution.ApiMatricula.dao.MatriculaRepository;
import pe.cibertec.institution.ApiMatricula.dto.MatriculaDto;
import pe.cibertec.institution.ApiMatricula.entity.Curso;
import pe.cibertec.institution.ApiMatricula.entity.Estudiante;
import pe.cibertec.institution.ApiMatricula.entity.Matricula;

/**
 *
 * @author brice
 */
@Service
public class MatriculaServiceImpl implements MatriculaService{
    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Autowired
    private ApiRestCurso apiRestCurso;  

    @Autowired
    private ApiRestEstudiante apiRestEstudiante;

    
    @Override
    public Matricula add(Matricula matricula) {
        return matriculaRepository.save(matricula);

    }

    @Override
    public MatriculaDto findById(Long idMatricula) {
        Matricula matricula = matriculaRepository.findById(idMatricula).get();
        
        Curso curso = apiRestCurso.findBycodigoCurso(matricula.getCodigoCurso());
        
        Estudiante estudiante = apiRestEstudiante.findBycodigoEstudiante(matricula.getCodigoEstudiante());
        
        MatriculaDto matriculaDto=new MatriculaDto();
        matriculaDto.setIdMatricula(matricula.getIdMatricula());
        matriculaDto.setEstudiante(estudiante);
        matriculaDto.setCurso(curso);
        
        return matriculaDto;
        
    }
     
     
     
}
