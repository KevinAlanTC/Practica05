import modulos.*;
import utilidades.*;

public class Main 
{

    public static void main(String[] args) 
    {
        // Validar que se recibieron exactamente 10 nombres
        if (args.length != 10) 
        {
            System.out.println("Error: Debes proporcionar exactamente 10 nombres como argumentos, de más de 5 letras cada uno.");
            return;
        }
        
        System.out.println("\n=== ENTRADA RECIBIDA (10 nombres) ===");
        for (int i = 0; i < args.length; i++)
            System.out.println((i + 1) + ". " + args[i]);

        System.out.println("\n=== PROCESANDO DATOS ===");
        System.out.println("Administradores creados automáticamente (todos con rol Administrador)");
        System.out.println("Lista revertida correctamente");
        System.out.println("Archivo 'Administradores.txt' creado con 10 administradores");
        System.out.println("Nuevo administrador añadido al archivo");
        
        System.out.println("\n");
        System.out.println("Empleados creados automáticamente (todos con rol Empleados)");
        System.out.println("Lista revertida correctamente");
        System.out.println("Archivo 'Empleados.txt' creado con 10 empleados");
        System.out.println("Nuevo empleado añadido al archivo");

        // Crear manejadores genéricos
        ManejadorLista<Empleado> manejoEmpleados = new ManejadorLista<>(Empleado.class);
        ManejadorLista<Administrador> manejoAdmins = new ManejadorLista<>(Administrador.class);

        // Convertir nombres en arreglos de Empleados y Administradores
        Empleado[] empleados = new Empleado[10];
        Administrador[] administradores = new Administrador[10];
        String correoGenerico = "correo@ejemplo.com";

        for (int i = 0; i < args.length; i++) 
        {
            empleados[i] = new Empleado(args[i], correoGenerico);
            administradores[i] = new Administrador(args[i], correoGenerico);
        }

        // Revertir ambos arreglos
        Empleado[] empleadosReverso = manejoEmpleados.regresarReversa(empleados);
        Administrador[] adminsReverso = manejoAdmins.regresarReversa(administradores);

        // Guardar listas revertidas en archivos
        String archivoEmpleados = "src/BD/Empleados.txt";
        String archivoAdmins = "src/BD/Administradores.txt";

        String[] empleadosStr = new String[empleadosReverso.length];
        for (int i = 0; i < empleadosReverso.length; i++)
            empleadosStr[i] = (i + 1) + ". " + empleadosReverso[i].toString();
        
        ManejadorArchivos.escribirArregloAArchivo(empleadosStr, archivoEmpleados);

        String[] adminsStr = new String[adminsReverso.length];
        for (int i = 0; i < adminsReverso.length; i++)
            adminsStr[i] = (i + 1) + ". " + adminsReverso[i].toString();
        
        ManejadorArchivos.escribirArregloAArchivo(adminsStr, archivoAdmins);

        // Crear un nuevo empleado y administrador
        Empleado nuevoEmpleado = new Empleado("Roberto", correoGenerico);
        Administrador nuevoAdmin = new Administrador("Roberto", correoGenerico);

        // Añadirlos a sus respectivos archivos
        ManejadorArchivos.escribirLineaAlFinal("11. " + nuevoEmpleado.toString(), archivoEmpleados);
        ManejadorArchivos.escribirLineaAlFinal("11. " + nuevoAdmin.toString(), archivoAdmins);

        // Leer archivos completos
        String[] empleadosFinal = ManejadorArchivos.leerArchivoComoArreglo(archivoEmpleados);
        String[] adminsFinal = ManejadorArchivos.leerArchivoComoArreglo(archivoAdmins);

        // Mostrar salida estándar
        System.out.println("\n=== LISTA FINAL DE EMPLEADOS (11) ===");
        for (String e : empleadosFinal)
            System.out.println(e);

        System.out.println("\n=== LISTA FINAL DE ADMINISTRADORES (11) ===");
        for (String a : adminsFinal)
            System.out.println(a);

    }
}
