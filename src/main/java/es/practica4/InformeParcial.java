package es.practica4;

import org.springframework.stereotype.Component;

@Component
public class InformeParcial extends InformeBase {

	@Override
	protected String obtenerTitulo() {
		return "Nota parcial";
	}
}