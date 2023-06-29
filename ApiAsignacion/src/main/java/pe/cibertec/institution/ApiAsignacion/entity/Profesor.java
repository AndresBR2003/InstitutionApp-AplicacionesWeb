/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.institution.ApiAsignacion.entity;

import lombok.Data;

/**
 *
 * @author brice
 */
@Data
public class Profesor {
    private Long idProfesor;
    private String nombres;
    private String apellidos;
    private String correo;
    private String codigoProfesor;
}
