/*
 * @author Torres Cruz Kevin Alan
 */
package utilidades;

import interfaces.ArreglosInterface;
import modulos.*;

import java.lang.reflect.Array;

public class ManejadorLista<T> implements ArreglosInterface<T> 
{

	private final Class<T> tipo;

    // Constructor: necesitamos la clase para poder crear arreglos genéricos
    public ManejadorLista(Class<T> tipo) 
    {
        this.tipo = tipo;
    }
	
    @Override
    public T[] regresarReversa(T[] arreglo) throws IllegalArgumentException, IllegalStateException 
    {
        if (arreglo == null)
            throw new IllegalArgumentException("El arreglo no puede ser null");
        
        if (arreglo.length == 0)
            throw new IllegalStateException("El arreglo está vacío");
        

        @SuppressWarnings("unchecked")
        T[] reverso = (T[]) Array.newInstance(tipo, arreglo.length);
        for (int i = 0; i < arreglo.length; i++)
            reverso[i] = arreglo[arreglo.length - 1 - i];
        
        return reverso;
    }

    @Override
    public T[] agregarElemento(T[] arreglo, T elemento) throws IllegalArgumentException 
    {
    	if (arreglo == null || elemento == null)
            throw new IllegalArgumentException("El arreglo y el elemento no pueden ser null");        

        @SuppressWarnings("unchecked")
        T[] nuevo = (T[]) Array.newInstance(tipo, arreglo.length + 1);
        for (int i = 0; i < arreglo.length; i++)
            nuevo[i] = arreglo[i];
        
        nuevo[arreglo.length] = elemento;
        return nuevo;
    }

    @Override
    public T buscarElemento(T[] arreglo, int posicion) throws IllegalArgumentException, IndexOutOfBoundsException 
    {
        if (arreglo == null)
            throw new IllegalArgumentException("El arreglo no puede ser null");
        
        if (posicion < 0 || posicion >= arreglo.length)
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        
        return arreglo[posicion];
    }

    @Override
    public T[] eliminarElemento(T[] arreglo, int posicion) throws IllegalArgumentException, IndexOutOfBoundsException 
    {
        if (arreglo == null) 
            throw new IllegalArgumentException("El arreglo no puede ser null");
        
        if (posicion < 0 || posicion >= arreglo.length)
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        

        @SuppressWarnings("unchecked")
        T[] nuevo = (T[]) Array.newInstance(tipo, arreglo.length - 1);
        int j = 0;
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (i != posicion)
                nuevo[j++] = arreglo[i];
        }
        return nuevo;
    }
}
