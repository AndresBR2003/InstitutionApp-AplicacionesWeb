/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiEstudiante.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.institution.ApiEstudiante.dao.EstudianteRepository;
import pe.cibertec.institution.ApiEstudiante.entity.Estudiante;

/**
 *
 * @author brice
 */
@Service
public class EstudianteServiceImpl implements EstudianteService{
    
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteRepository.findAll();
    }
    
    @Override
    public Estudiante findById(Long idEstudiante) {
        return estudianteRepository.findById(idEstudiante).
                orElseThrow(()-> 
        new EntityNotFoundException("Not found Customer with id: "+idEstudiante.toString())) ;  
    }

    @Override
    public Estudiante add(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(Long idEstudiante, Estudiante estudiante) {
        Estudiante estudianterDB = estudianteRepository.findById(idEstudiante).get();
        estudianterDB.setNombres(estudiante.getNombres());
        estudianterDB.setApellidos(estudiante.getApellidos());
        estudianterDB.setCodigoEstudiante(estudiante.getCodigoEstudiante());
        return estudianteRepository.save(estudianterDB);
    }

    @Override
    public void delete(Long idEstudiante) {
        Estudiante customerDB = estudianteRepository.findById(idEstudiante).get();
        estudianteRepository.delete(customerDB);
    }

    @Override
    public Estudiante findBycodigoEstudiante(String codigoEstudiante) {
        return estudianteRepository.findBycodigoEstudiante(codigoEstudiante);

    }

    
    
}
