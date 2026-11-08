package es.practica4;

public abstract class InformeBase implements Informe {

	protected abstract String obtenerTitulo();

	@Override
	public String entregarInforme(double nota) {
		
		nota = Math.round(nota * 10.0) / 10.0;

		if (nota < 1 || nota > 5) {
			throw new IllegalArgumentException("La nota debe estar entre 1 y 5");
		}

		String resultado;

		if (nota >= 3) {
			resultado = "Aprobado";
		} else {
			resultado = "Reprobado";
		}

		return obtenerTitulo() + ": " + nota + " - " + resultado;
	}
}
