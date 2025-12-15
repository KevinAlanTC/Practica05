/*
 * @author Torres Cruz Kevin Alan
 */

package modulos;

public class Empleado extends Usuario 
{

    // Constructor: llama al constructor validado de Usuario
    public Empleado(String nombre, String correo) 
    {
        super(nombre, correo, "Empleado");
    }

    // Implementación del método abstracto
    @Override
    public void mostrarMenu() 
    {
        System.out.println("Menú del Empleado");
        System.out.println("1. Ver lista de tareas");
        System.out.println("2. Finalizar una tarea");
        System.out.println("6. Salir");
    }

}
