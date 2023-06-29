/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiProfesor.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.institution.ApiProfesor.dao.ProfesorRepository;
import pe.cibertec.institution.ApiProfesor.entity.Profesor;

/**
 *
 * @author brice
 */
@Service
public class ProfesorServiceImpl implements ProfesorService{
    
    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> findAll() {
        return (List<Profesor>) profesorRepository.findAll();
    }

    @Override
    public Profesor add(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor update(Long idProfesor, Profesor profesor) {
        Profesor profesorDB = profesorRepository.findById(idProfesor).get();
        profesorDB.setNombres(profesor.getNombres());
        profesorDB.setApellidos(profesor.getApellidos());
        profesorDB.setCorreo(profesor.getCorreo());
        profesorDB.setCodigoProfesor(profesor.getCodigoProfesor());
        return profesorRepository.save(profesorDB);
    }

    @Override
    public void delete(Long idProfesor) {
        Profesor customerDB = profesorRepository.findById(idProfesor).get();
        profesorRepository.delete(customerDB);
    }

    @Override
    public Profesor findById(Long idProfesor) {
        return profesorRepository.findById(idProfesor).
                orElseThrow(()-> 
        new EntityNotFoundException("Not found Customer with id: "+idProfesor.toString())) ;
    }

    @Override
    public Profesor findByCodigoProfesor(String codigoProfesor) {
        return profesorRepository.findByCodigoProfesor(codigoProfesor);
    }
}
