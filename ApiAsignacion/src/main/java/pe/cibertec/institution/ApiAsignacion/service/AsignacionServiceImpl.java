/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.institution.ApiAsignacion.dao.AsignacionRepository;
import pe.cibertec.institution.ApiAsignacion.dto.AsignacionDto;
import pe.cibertec.institution.ApiAsignacion.entity.Asignacion;
import pe.cibertec.institution.ApiAsignacion.entity.Curso;
import pe.cibertec.institution.ApiAsignacion.entity.Profesor;

/**
 *
 * @author brice
 */
@Service
public class AsignacionServiceImpl implements AsignacionService{
    
    @Autowired
    private AsignacionRepository asignacionRepository;
    
    @Autowired
    private ApiRestCurso apiRestCurso;  

    @Autowired
    private ApiRestProfesor apiRestProfesor;

    @Override
    public Asignacion add(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    @Override
    public AsignacionDto findById(Long idAsignacion) {
        Asignacion asignacion = asignacionRepository.findById(idAsignacion).get();
        
        Curso curso = apiRestCurso.findBycodigoCurso(asignacion.getCodigoCurso());
        
        Profesor profesor = apiRestProfesor.findByCodigoProfesor(asignacion.getCodigoProfesor());
        
        AsignacionDto asignacionDto =new AsignacionDto();
        asignacionDto.setIdAsignacion(asignacion.getIdAsignacion());
        asignacionDto.setCurso(curso);
        asignacionDto.setProfesor(profesor);
        
        return asignacionDto;
    }
    
}
