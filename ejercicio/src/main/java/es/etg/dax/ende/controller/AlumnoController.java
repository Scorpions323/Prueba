package es.etg.dax.ende.controller;
import java.io.IOException;
import java.util.List;

import es.etg.dax.ende.App;
import es.etg.dax.ende.model.Alumno;
import es.etg.dax.ende.model.db.AlumnoDAO;
import es.etg.dax.ende.model.db.AlumnoDAOImpl;
import es.etg.dax.ende.view.AlumnoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlumnoController extends Application {

    private static final String VIEW_MAIN = "resources/alumnoView.fxml";
    private AlumnoDAO model;

    public AlumnoController() {}

    public AlumnoController(AlumnoDAO mockDAO) {
        this.model = mockDAO;
    }

    @Override
    public void start(Stage stage) throws IOException {
        if (model == null) {
            model = new AlumnoDAOImpl();
        }

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(VIEW_MAIN));
        Parent root = fxmlLoader.load();

        AlumnoViewController viewController = fxmlLoader.getController();
        viewController.setAlumnoController(this);

        stage.setTitle("Gestión de Alumnos");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public Alumno crearAlumno(String nombre, String apellidos, int edad) {
        Alumno alumno = new Alumno(nombre, apellidos, edad);
        model.insertar(alumno);
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        return model.listar();
    }
}