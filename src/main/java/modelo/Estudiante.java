package modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

  private String nombre;
  private String id;
  private List<Materia> materias;

  public Estudiante(String nombre, String id) {
    this.nombre = nombre;
    this.id = id;
    this.materias = new ArrayList<>();
  }
  

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Materia> getMaterias() {
    return materias;
  }

  public void agregarMateria(Materia materia) {
    materias.add(materia);
  }

  @Override
  public String toString() {
    return "{" +
      " nombre='" + getNombre() + "'" +
      ", id='" + getId() + "'" +
      ", materias='" + materias.toString() + "'" +
      "}";
  }



}
