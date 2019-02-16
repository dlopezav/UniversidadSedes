/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

/**
 *
 * @author dfeli
 */
public class EducacionContinua extends Sede{
    private String CursoPopular; 

    public EducacionContinua(String nombre, String direccion, int telefono, double AreaConstruida) {
        super(nombre, direccion, telefono, AreaConstruida);
        this.CursoPopular = CursoPopular;
    }

    @Override
    public String darInformacion() {
        return "Curso popular: "+ this.CursoPopular;
    }
    public String getCursoPopular() {
        return CursoPopular;
    }

    public void setCursoPopular(String CursoPopular) {
        this.CursoPopular = CursoPopular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaConstruida() {
        return AreaConstruida;
    }

    public void setAreaConstruida(double AreaConstruida) {
        this.AreaConstruida = AreaConstruida;
    }

    

    
}
