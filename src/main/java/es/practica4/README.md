\# Práctica 4: Inyección de dependencias con clase abstracta y @Qualifier



Ejercicio propio de Spring Core. Una aplicación pequeña que recibe una nota entre 1 y 5, la valida y devuelve el resultado con su título (nota parcial o nota final).



\## Qué demuestra



\- \*\*Inversión de control e inyección de dependencias:\*\* `ServicioNotas` no crea el informe que usa, Spring se lo entrega por constructor.

\- \*\*Resolución de ambigüedad con `@Qualifier`:\*\* hay dos implementaciones del mismo tipo (`InformeParcial` e `InformeFinal`), así que `ServicioNotas` indica con `@Qualifier("informeFinal")` cuál quiere.

\- \*\*Clase abstracta con lógica compartida:\*\* `InformeBase` contiene el algoritmo común y deja a las hijas solo la parte que cambia (`obtenerTitulo()`).

\- \*\*Configuración por anotaciones:\*\* `Configuracion5` usa `@ComponentScan` para detectar los componentes del paquete.



\## Estructura



\- `Informe`: interfaz con el método `entregarInforme(double nota)`.

\- `InformeBase`: clase abstracta que implementa `Informe`. Redondea la nota a un decimal, valida que esté entre 1 y 5 y la clasifica como Aprobado (3 o más) o Reprobado.

\- `InformeParcial` e `InformeFinal`: hijas de `InformeBase`, marcadas con `@Component`. Solo definen el título.

\- `ServicioNotas`: recibe un `Informe` por constructor y expone `mostrarNota`.

\- `Configuracion5`: clase de configuración con `@ComponentScan("es.practica4")`.

\- `UsoNotas`: clase con `main`. Crea el contexto de Spring, pide la nota con `JOptionPane` y muestra el resultado.



\## Manejo de errores



\- Si el texto no es un número, se muestra "Debes escribir un número válido".

\- Si la nota está fuera del rango 1 a 5, `InformeBase` lanza una `IllegalArgumentException` y `UsoNotas` muestra su mensaje.



\## Ejemplos



\- Entrada `4.26`: \*\*Nota final: 4.3 - Aprobado\*\*

\- Entrada `2.94`: \*\*Nota final: 2.9 - Reprobado\*\*

\- Entrada `7`: \*\*La nota debe estar entre 1 y 5\*\*

\- Entrada `abc`: \*\*Debes escribir un número válido\*\*



\## Cómo ejecutarlo



Requiere Java y la librería `spring-context`. Ejecutar la clase `UsoNotas` como aplicación Java.

