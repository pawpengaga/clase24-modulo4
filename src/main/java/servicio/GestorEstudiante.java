package servicio;

import java.util.HashMap;
import java.util.Map;

import modelo.Estudiante;

public class GestorEstudiante {

  private Map<String, Estudiante> estudiantes;

  public GestorEstudiante(){
    estudiantes = new HashMap<>();
  }

  public void agregarEstudiante(Estudiante student){
    estudiantes.put(student.getId(), student);
  }

  public Estudiante obtenerEstudiante(String id){
    return estudiantes.get(id);
  }

  public void actualizarEstudiante(String id, String newNombre){
    // Creamos el estudiante que ya existe
    Estudiante estudiante = estudiantes.get(id);
    // Si no es nulo, lo actualizamos
    if (estudiante != null){
      estudiante.setNombre(newNombre);
      System.out.println("Estudiante actualizado!");
    } else {
      System.out.println("Estudiante no encontrado.");
    }

  }

  public void eliminarEstudiante(String id){
    if (estudiantes.remove(id) != null) {
      System.out.println("Estudiante eliminado.");
    } else {
      System.out.println("Estudiante no encontrado.");
    }
  }

  public void listarEstudiantes(){
    if(estudiantes.isEmpty()){
      System.out.println("No hay estudiantes registrados.");
    } else {
      for (Estudiante estudiante : estudiantes.values()) {
        System.out.println(estudiante);
      }
    }
  }

}
