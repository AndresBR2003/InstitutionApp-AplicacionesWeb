/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiMatricula.entity;

import lombok.Data;

/**
 *
 * @author brice
 */
@Data
public class Curso {
    private Long idCurso;
    private String nombre;
    private String creditos;
    private String turno;
    private String codigoCurso;
}
