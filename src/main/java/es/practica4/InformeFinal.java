package es.practica4;

import org.springframework.stereotype.Component;

@Component
public class InformeFinal extends InformeBase {

	@Override
	protected String obtenerTitulo() {
		return "Nota final";
	}
}

