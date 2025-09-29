package es.etg.dax.ende.model.db;

import java.util.ArrayList;
import java.util.List;

import es.etg.dax.ende.model.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO {

    private final List<Alumno> alumnos = new ArrayList<>();

    @Override
    public void insertar(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public List<Alumno> listar() {
        return new ArrayList<>(alumnos);
    }
}