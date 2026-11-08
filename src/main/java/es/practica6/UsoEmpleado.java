package es.practica6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto =
				new AnnotationConfigApplicationContext(Configuracion6.class);

		Empresa empresa = contexto.getBean(Empresa.class);

		empresa.mostrarNomina();

		contexto.close();
	}
}