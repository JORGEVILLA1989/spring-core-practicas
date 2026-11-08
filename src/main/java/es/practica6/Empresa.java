package es.practica6;

import org.springframework.stereotype.Component;

@Component
public class Empresa {
	
	
	private Empleado[]  empleados;

	public Empresa(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
	
	public void mostrarNomina() {
		
		
		 double total = 0;
		 
		 for(Empleado e : empleados) {
			 
					System.out.println("Cargo: " + e.getCargo());
					System.out.println("El nombre del empleado es: " + e.getNombre());
					System.out.println("Sueldo: $" + e.calcularSueldo());
					System.out.println("----------------");

					total += e.calcularSueldo();
				
		 }
		
		 System.out.println("Total nómina: $" + total);
		
		
	}
	
	
}
