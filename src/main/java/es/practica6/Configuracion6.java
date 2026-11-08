package es.practica6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.practica6")
public class Configuracion6 {

        @Bean
        public Empleado operario1() {
                return new Operario("Carlos", 3000.0, 5.0);
        }

        @Bean
        public Empleado operario2() {
                return new Operario("Maria", 4000.0, 6.0);
        }

        @Bean
        public Empleado administrativo() {
                return new Administrativo("Jorge", 5000.0, 7.0);
        }

}