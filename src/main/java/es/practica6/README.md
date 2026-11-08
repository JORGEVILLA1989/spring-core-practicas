\# Práctica 6: Nómina de empleados con inyección de un arreglo de beans



Ejercicio propio de Spring Core. Una empresa recibe a todos sus empleados y calcula la nómina: cargo, nombre, sueldo con aumento y total.



\## Qué demuestra



\- \*\*Inyección de una colección de beans:\*\* `Empresa` pide un `Empleado\[]` en el constructor y Spring le entrega todos los beans de tipo `Empleado` registrados, sin que el código los liste uno por uno.

\- \*\*Registro con `@Bean` cuando el constructor necesita datos:\*\* `Operario` y `Administrativo` reciben nombre, sueldo base y porcentaje de aumento, así que no se pueden registrar con `@Component`. Cada uno se declara en un método `@Bean` de `Configuracion6`.

\- \*\*Clase abstracta con lógica compartida:\*\* `EmpleadoBase` guarda los datos y calcula el sueldo. Las hijas solo definen el cargo.

\- \*\*Polimorfismo:\*\* `Empresa` recorre empleados de tipos distintos usando solo la interfaz `Empleado`.



\## Estructura



\- `Empleado`: interfaz con `getNombre()`, `getCargo()` y `calcularSueldo()`.

\- `EmpleadoBase`: clase abstracta que implementa `Empleado`. El sueldo se calcula como sueldo base más su porcentaje de aumento.

\- `Operario` y `Administrativo`: hijas de `EmpleadoBase`, cada una con su cargo.

\- `Empresa`: componente (`@Component`) que recibe el arreglo de empleados y en `mostrarNomina()` imprime los datos de cada uno y el total.

\- `Configuracion6`: registra tres empleados con `@Bean` y activa `@ComponentScan` para encontrar `Empresa`.

\- `UsoEmpleado`: clase con `main`. Crea el contexto, obtiene `Empresa` y muestra la nómina.



\## Ejemplo de salida



```

Cargo: operario

El nombre del empleado es: Carlos

Sueldo: $3150.0

\----------------

Cargo: operario

El nombre del empleado es: Maria

Sueldo: $4240.0

\----------------

Cargo: administrativo

El nombre del empleado es: Jorge

Sueldo: $5350.0

\----------------

Total nómina: $12740.0

```



\## Cómo ejecutarlo



Requiere Java y la librería `spring-context`. Ejecutar la clase `UsoEmpleado` como aplicación Java.

