package pruebas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelo.Estudiante;
import servicio.GestorEstudiante;

public class GestorEstudianteObtenerTest {

  @Test
  @DisplayName("Prueba obtener estudiante")
  public void testObtenerEstudiante(){
    System.out.println("Hola");
    
    GestorEstudiante gestor = new GestorEstudiante();
    
    Estudiante est = new Estudiante("Eileen", 19);
    Estudiante est2 = new Estudiante("Lucca", 20);

    gestor.agregarEstudiante(est);
    gestor.agregarEstudiante(est2);

    List<Estudiante> todos = gestor.obtenterTodos();

    // Comprobamos que si hayan estudiantes
    assertNotNull(todos);
  }

}
