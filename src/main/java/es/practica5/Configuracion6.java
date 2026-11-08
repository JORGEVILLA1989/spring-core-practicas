package es.practica5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.practica5")
public class Configuracion6 {
	
	 @Bean
	    public SaldoAdulto saldoAdulto() {
	        return new SaldoAdulto();
	    }
	 
	 
	 @Bean
	    public SaldoMenorEdad saldoMenorEdad() {
	        return new SaldoMenorEdad();
	    }

}
