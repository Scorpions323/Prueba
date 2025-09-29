# Ejercicio de Gestión de Alumnos


## Introducción
Programa que utiliza JavaFX para la gestión de alumnos (nombre, apellidos, edad).  


---

## Tecnologías
- Java 17 
- JavaFX 21.0.2  
- Maven  
- Lombok  
- JUnit 5 + Mockito  

---

## Estructura de mi programa
- `App.java` → punto de entrada JavaFX  
- `controller/AlumnoController.java` → gestiona la interfaz  
- `model/Alumno.java` → entidad con Lombok  
- `model/db/AlumnoDAO.java` y `AlumnoDAOImp.java` → capa de acceso a datos
- `resources/Alumnoview.fxml` → interfaz gráfica 

---

## Repositorio
GitHub, clonar repositorio:  
   ```bash
   git clone https://github.com/Scorpions323/Prueba
   ```

---

## Errores
Cuando intento ejecutar mi programa me sale el siguiente error:
   ```bash
   Error: JavaFX runtime components are missing, and are required to run this application
   ```
He estado buscando como solucionarlo pero no consegido dar con una solución.