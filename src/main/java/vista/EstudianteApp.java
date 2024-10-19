package vista;

import java.util.Scanner;

import modelo.Estudiante;
import modelo.Materia;
import servicio.GestorEstudiante;

public class EstudianteApp {
  public static void main(String[] args) {

    Scanner myscan = new Scanner(System.in);
    GestorEstudiante gestor = new GestorEstudiante();

    String[] materias = {"Historia", "Fisica", "Literatura", "Matematicas"};

    while (true) {
      System.out.println("=> GESTION DE ESTUDIANTES <=");
      System.out.println("----------------------------");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Ver estudiante");
      System.out.println("3. Actualizar estudiante");
      System.out.println("4. Eliminar estudiante");
      System.out.println("5. Listar estudiantes");
      System.out.println("6. Salir");
      System.out.println("SELECCIONE UNA OPCION:");

      int opcion = myscan.nextInt();
      myscan.nextLine();

      switch (opcion) {
        case 1:
          System.out.println("Ingrese el ID del estudiante");
          String identifica = myscan.nextLine();
          System.out.println("Ingresa el nombre completo del estudiante");
          String name = myscan.nextLine();
          
          Estudiante estudiante = new Estudiante(name, identifica);

          for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese la nota para " + materias[i]);
            double nota = myscan.nextDouble();
            estudiante.agregarMateria(new Materia(materias[i], nota));
          }

          // Aqui ya agregamos el estudiante completamente configurado
          gestor.agregarEstudiante(estudiante);
          System.out.println("Estudiante agregado exitosamente!!");

          break;
        case 2:
          System.out.println("Ingrese el ID del estudiante: ");
          gestor.listarEstudiantes();
          String idInput = myscan.nextLine();
          Estudiante buscado = gestor.obtenerEstudiante(idInput);
          if(buscado != null){
            System.out.println("Buscado");
          } else {
            System.out.println("Estudiante no encontrado.");
          }
          break;
        case 3:
          System.out.println("Ingrese el ID del estudiante: ");
          gestor.listarEstudiantes();
          idInput = myscan.nextLine();
          System.out.println("Ingrese el nuevo nombre");
          String nombreInput = myscan.nextLine();
          gestor.actualizarEstudiante(idInput, nombreInput);
          break;
        case 4:
          System.out.println("Ingrese el ID del estudiante: ");
          idInput = myscan.nextLine();
          gestor.eliminarEstudiante(idInput);
          break;
        case 5:
          gestor.listarEstudiantes();
          break;
        case 6:
          System.out.println("Saliendo...");
          myscan.close();
          return;
        default:
          break;
      }
    }

  }
}
