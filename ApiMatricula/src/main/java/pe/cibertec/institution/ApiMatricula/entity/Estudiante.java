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
public class Estudiante {
    private Long idEstudiante;
    private String nombres;
    private String apellidos;
    private String codigoEstudiante;
}
