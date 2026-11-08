package es.practica4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServicioNotas {
	
	private Informe informe;

	public ServicioNotas(@Qualifier("informeFinal")Informe informe) {
		this.informe = informe;
	}
	
	
	public String mostrarNota(Double nota) {
		
		return informe.entregarInforme( nota);
	}
	
}
