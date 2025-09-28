package es.etg.dax.ende.model.db;
import java.util.List;

import es.etg.dax.ende.model.Alumno;

public interface AlumnosDAO {
    int insert(Alumno a) throws Exception;
    List<Alumno> listAll() throws Exception;
}