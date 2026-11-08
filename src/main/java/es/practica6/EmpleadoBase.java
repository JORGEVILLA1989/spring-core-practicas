package es.practica6;

public abstract class EmpleadoBase implements Empleado {
	
	
	
	private String nombre;
	private Double sueldoBase;
	private Double porcentajeAumento;

	public EmpleadoBase(String nombre, Double sueldoBase, Double porcentajeAumento) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.porcentajeAumento = porcentajeAumento;
	}



	@Override
	public String getNombre() {
	
		return nombre;
	}

	

	@Override
	public Double calcularSueldo() {
		
		return  sueldoBase + (sueldoBase * porcentajeAumento / 100);
	}

}
