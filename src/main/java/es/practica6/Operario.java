package es.practica6;

public class Operario   extends  EmpleadoBase {

	public Operario(String nombre, Double sueldoBase, Double porcentajeAumento) {
		super(nombre, sueldoBase, porcentajeAumento);
		
		
	}

	@Override
	public String getCargo() {
		
		return "operario" ;
	}
	
	

}
