/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.Serializable;

/**
 *
 * @author dfeli
 */
public class Estudiante extends Persona implements Serializable{
    private Sede sede;
    private String ProgramaFormacion;
    public Estudiante(String nombre, Boolean titulo, String colegio, String AñoGrado) {
        super(nombre, titulo, colegio, AñoGrado);
    }
    
}
