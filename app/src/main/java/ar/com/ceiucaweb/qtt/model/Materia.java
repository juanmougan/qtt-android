package ar.com.ceiucaweb.qtt.model;

/**
 * Entidad de dominio que representa una Materia
 * Created by jmougan on 23/10/2014.
 */
public class Materia {

    private int id;
    private String nombre;
    private Carrera carrera;

    public Materia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
