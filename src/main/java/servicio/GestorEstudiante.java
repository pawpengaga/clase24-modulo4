package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Estudiante;

public class GestorEstudiante {

  private List<Estudiante> estudiantes = new ArrayList<>();

  public void agregarEstudiante(Estudiante student){
    estudiantes.add(student);
  }

  public Estudiante obtenerEstudiante(String nombre){
    return estudiantes.stream().filter(est -> est.getNombre().equals(nombre)).findFirst().orElse(null);
  }

  public List<Estudiante> obtenterTodos(){
    return estudiantes;
  }

}
