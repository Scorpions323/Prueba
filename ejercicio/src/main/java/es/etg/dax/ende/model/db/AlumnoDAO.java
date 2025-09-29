package es.etg.dax.ende.model.db;

import java.util.List;

import es.etg.dax.ende.model.Alumno;

public interface AlumnoDAO {
    
    void insertar(Alumno alumno);
    List<Alumno> listar();
}
