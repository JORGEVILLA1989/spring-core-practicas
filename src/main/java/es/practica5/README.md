\# Práctica 5: Tarjeta Cívica con interfaz, clase abstracta y @Bean



Ejercicio propio de Spring Core, inspirado en la Tarjeta Cívica de Medellín. Simula una tarjeta de transporte: el usuario indica su saldo, el programa verifica si alcanza para la tarifa y, si no alcanza, permite recargar y vuelve a verificar.



\## Qué demuestra



\- \*\*Inversión de control:\*\* el objeto `Saldo` no se crea con `new` en el programa principal, se obtiene del contenedor de Spring.

\- \*\*Dos beans del mismo tipo:\*\* `SaldoAdulto` y `SaldoMenorEdad` implementan la misma interfaz `Saldo`, con tarifas distintas. Como hay más de un candidato, el programa pide el bean por nombre con `getBean("saldoAdulto", Saldo.class)`.

\- \*\*Registro de beans con `@Bean`:\*\* `Configuracion6` declara cada bean en un método.

\- \*\*Clase abstracta con lógica compartida:\*\* `SaldoBase` contiene el comportamiento común (consultar, verificar y recargar) y deja a las hijas solo la tarifa.



\## Estructura



\- `Saldo`: interfaz con `consultarSaldo()`, `tieneSaldoSuficiente()` y `recargar(int monto)`.

\- `SaldoBase`: clase abstracta que implementa `Saldo`. Guarda el saldo y define el método abstracto `getTarifa()`. Hay saldo suficiente cuando el saldo es igual o mayor que la tarifa.

\- `SaldoAdulto`: hija de `SaldoBase`, tarifa de 3000.

\- `SaldoMenorEdad`: hija de `SaldoBase`, tarifa de 2000.

\- `Configuracion6`: clase de configuración que registra los dos beans con `@Bean`.

\- `UsoTarjeta`: clase con `main`. Crea el contexto de Spring, pide el saldo con `JOptionPane` y muestra el resultado.



\## Flujo del programa



1\. El usuario escribe su saldo actual.

2\. Si el saldo alcanza para la tarifa, muestra "Acceso permitido".

3\. Si no alcanza, muestra "Acceso denegado" y pregunta cuánto quiere recargar.

4\. Después de recargar, verifica de nuevo y muestra el nuevo saldo con el resultado.



\## Manejo de errores



\- Si el texto no es un número entero, se muestra "Debes escribir un número válido".

\- Si el usuario pulsa Cancelar en cualquier ventana, el programa termina sin error.



\## Ejemplos (con la tarifa de adulto, 3000)



\- Saldo `5000`: \*\*Acceso permitido. Saldo: 5000\*\*

\- Saldo `1000`, recarga `2500`: \*\*Acceso denegado. Saldo: 1000\*\* y luego \*\*Acceso permitido. Nuevo saldo: 3500\*\*

\- Saldo `1000`, recarga `500`: \*\*Acceso denegado. Nuevo saldo: 1500\*\*

\- Entrada `abc`: \*\*Debes escribir un número válido\*\*



\## Cómo ejecutarlo



Requiere Java y la librería `spring-context`. Ejecutar la clase `UsoTarjeta` como aplicación Java.

