/*
 * @author Torres Cruz Kevin Alan
 */

package modulos;

public abstract class Usuario 
{
    // Atributos protegidos
    protected String nombre;
    protected String correo;
    protected String rol;

    // Constructor por omisión (sin parámetros)
    public Usuario() 
    {
        this.nombre = "";
        this.correo = "";
        this.rol = "";
    }

    // Constructor con validaciones 
    public Usuario(String nombre, String correo, String rol) {
        // Validación del nombre
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no debe estar vacío");
        
        if (nombre.length() < 5) 
            throw new IllegalArgumentException("El nombre debe contener al menos 5 caracteres");
        

        // Validación del correo
        if (correo == null || !correo.contains("@") || !correo.endsWith(".com"))
            throw new IllegalArgumentException("Formato de correo inválido: debe contener '@' y terminar en '.com'");
        

        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    // Getters
    public String getNombre() 
    {
        return nombre;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public String getRol() 
    {
        return rol;
    }

    // Setters
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public void setRol(String rol)
    {
        this.rol = rol;
    }

    // Método equals para comparar usuarios
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        	return true; // Comparación por referencia
        if (obj == null || getClass() != obj.getClass()) 
        	return false; // Verifica tipo

        Usuario usuario = (Usuario) obj; // Cast del objeto
        return nombre.equals(usuario.nombre) &&
               correo.equals(usuario.correo) &&
               rol.equals(usuario.rol); // Comparación de atributos
    }
    
    // Método toString
    @Override
    public String toString() 
    {
        return "Nombre: " + nombre + ", Correo: " + correo + ", Rol: " + rol;
    }

    // Método abstracto
    public abstract void mostrarMenu();

}
