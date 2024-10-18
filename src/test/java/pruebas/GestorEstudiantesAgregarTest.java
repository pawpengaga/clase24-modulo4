package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelo.Estudiante;
import servicio.GestorEstudiante;

public class GestorEstudiantesAgregarTest {

  @Test
  @DisplayName("Prueba agregar estudiante")
  public void agregarEstudiante(){
    System.out.println("Hola de nuevo");
    GestorEstudiante gestor = new GestorEstudiante();
    Estudiante est = new Estudiante("Eileen", 19);
    Estudiante est2 = new Estudiante("Lucca", 20);
    gestor.agregarEstudiante(est);
    gestor.agregarEstudiante(est2);

    assertEquals(2, gestor.obtenterTodos().size());
  }

}
