package es.etg.dax.ende.controller;
import java.util.List;

import es.etg.dax.ende.model.Alumno;
import es.etg.dax.ende.model.db.AlumnosDAO;

public class AlumnoController {
    private final AlumnosDAO dao;

    public AlumnoController(AlumnosDAO dao) {
        this.dao = dao;
    }

    public void insertarAlumno(String nombre, String apellidos, int edad) throws Exception {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        
        if (apellidos == null || apellidos.isBlank()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        Alumno alumno = new Alumno(nombre, apellidos, edad);
        dao.insert(alumno);
    }

    public List<Alumno> listarAlumnos() throws Exception {
        return dao.listAll();
    }
}