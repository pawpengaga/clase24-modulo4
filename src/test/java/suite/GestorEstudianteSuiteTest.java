package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import pruebas.GestorEstudianteObtenerTest;
import pruebas.GestorEstudiantesAgregarTest;

@Suite
@SuiteDisplayName("My Test Suite")
@SelectClasses({
  GestorEstudiantesAgregarTest.class,
  GestorEstudianteObtenerTest.class
})

public class GestorEstudianteSuiteTest {

}
