package es.practica6;

public class Administrativo extends EmpleadoBase {

        public Administrativo(String nombre, Double sueldoBase, Double porcentajeAumento) {
                super(nombre, sueldoBase, porcentajeAumento);
        }

        @Override
        public String getCargo() {

                return "administrativo";
        }

}
