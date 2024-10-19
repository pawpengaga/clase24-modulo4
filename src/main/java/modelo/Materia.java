package modelo;

public class Materia {

  private String nombre;
  private double nota;


  public Materia(String nombre, double nota) {
    this.nombre = nombre;
    this.nota = nota;
  }


  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getNota() {
    return this.nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  @Override
  public String toString() {
    return "{" +
      " '" + getNombre() + "'" +
      ", '" + getNota() + "'" +
      "}";
  }



}
