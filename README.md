\# Spring Core: prácticas



Ejercicios propios que escribí mientras aprendo Spring Framework, con foco en inversión de control (IoC) e inyección de dependencias (DI). Cada práctica es una aplicación pequeña y ejecutable, con su propio README que explica qué demuestra.



\## Prácticas



| Práctica | Qué construí | Conceptos |

|----------|--------------|-----------|

| \[practica4](src/main/java/es/practica4) | Entrega de notas parcial y final con validación de rango | DI por constructor, `@Qualifier`, clase abstracta, `@ComponentScan` |

| \[practica5](src/main/java/es/practica5) | Tarjeta de transporte inspirada en la Tarjeta Cívica de Medellín, con tarifa de adulto y de menor de edad | Interfaz, clase abstracta, dos beans del mismo tipo, `@Bean` |

| \[practica6](src/main/java/es/practica6) | Nómina de una empresa con operarios y administrativos | Inyección de un arreglo de beans, `@Bean` con constructores que reciben datos, polimorfismo |



\## Tecnologías



\- Java

\- Spring Framework (`spring-context`)

\- Eclipse



\## Cómo ejecutar una práctica



Cada práctica tiene una clase con `main` (`UsoNotas`, `UsoTarjeta`, `UsoEmpleado`). Se ejecuta como aplicación Java, con `spring-context` en el classpath. El README de cada carpeta indica cuál es.



\## Qué sigue



Spring MVC y, después, Spring Boot con aplicaciones completas (API, base de datos y despliegue).

