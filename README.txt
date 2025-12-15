Torres Cruz Kevin Alan

¿Por qué eligieron esta opción?
Elegí la Versión 3 (Genéricos) porque permite que la interfaz y su implementación sean reutilizables para distintos tipos de objetos, en este caso distintos tipos de usuarios (Empleado o Administrador). De esta forma se puede evitar duplicar código y podemos mantener un tipado fuerte, es decir, el compilador sabe exactamente qué tipo de objeto estamos usando (por ejemplo, Empleado o Administrador) así que no necesitamos hacer conversiones manuales (cast). Con esto se pueden evitar errores en tiempo de ejecución y tener un poco más de seguridad al programar.

De las tres opciones, ¿Cuál brinda mayor escalabilidad y por qué?
Considero que la opción que brinda mayor escalabilidad es la de Genéricos, porque podemos reutilizar la misma interfaz y clase para manejar diferentes tipos de usuarios sin tener que escribir métodos repetidos. En contraste con las otras versiones, la opción de Sobrecarga obliga a duplicar métodos para cada tipo, lo que se vuelve poco práctico si aparecen más clases en el futuro; mientras que la opción de Object sí permite manejar varios tipos, pero pierde seguridad porque todo se trata como Object y hay que hacer conversiones manuales, lo que puede generar errores. Por eso, los genéricos son más escalables y seguros.

¿Cuáles son las principales ventajas de la opción que seleccionaste para implementar?
En mi opinión, las principales ventajas de esta opción son que al usar Genéricos reutilizamos código evitando duplicarlo para cada tipo de usuario. Además el tipado es fuerte, así que el compilador nos ayuda a prevenir errores de tipo porque sabe exactamente qué clase estamos usando. Y finalmente, es más fácil mantener y extender el programa si en el futuro se agregan nuevas clases.

¿Qué desventajas o limitaciones identificas en la opción que implementaste?
Personalmente, la principal desventaja es que todavía no estoy tan familiarizado con los genéricos. He trabajado un poco con POO, pero los genéricos me resultan menos intuitivos al inicio. Además la sintaxis <T> puede parecer confusa y requiere acostumbrarse. Entonces, aunque sé que es una solución más escalable, al principio me cuesta un poco más leer y escribir el código en comparación con las otras opciones que son más directas.