/*
 * @author Torres Cruz Kevin Alan
 */

package modulos;

public class Administrador extends Usuario 
{

    // Constructor: llama al constructor validado de Usuario
    public Administrador(String nombre, String correo) 
    {
        super(nombre, correo, "Administrador");
    }

    // Implementación del método abstracto
    @Override
    public void mostrarMenu() 
    {
        System.out.println("Menú del Administrador");
        System.out.println("1. Registrar un nuevo Usuario");
        System.out.println("2. Eliminar un Usuario");
        System.out.println("3. Ver Lista de Usuarios");
        System.out.println("4. Ver Lista de Tareas");
        System.out.println("5. Crear nueva Tarea");
        System.out.println("6. Salir");
    }

}
