# Práctica 05 - Escritura/Lectura de Archivos, Polimorfismo y Genéricos

## Objetivo
Extender la implementación de la Práctica 04 incorporando:
- Escritura y lectura de archivos de texto.
- Uso de polimorfismo para manejar diferentes tipos de usuarios.
- Implementación de genéricos para mejorar la escalabilidad y reutilización del código.

## Descripción
En esta práctica se redefine el sistema de usuarios para incluir persistencia en archivos.  
Se implementa la clase `ManejadorArchivos` para centralizar operaciones de entrada/salida, como leer, buscar y escribir en archivos de texto.  
La clase `ManejadorLista` se desarrolla en una de tres versiones posibles (Sobrecarga, Object o Genéricos), permitiendo gestionar listas de empleados y administradores.  
El programa principal (`Main`) recibe un conjunto de nombres, crea objetos `Empleado` y `Administrador`, revierte las listas, las guarda en archivos y añade nuevos usuarios, demostrando el uso de polimorfismo y genéricos.

## Tecnologías utilizadas
- Java
- Eclipse IDE

## Instrucciones de ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/KevinAlanTC/Practica05.git
   ```
2. Verificar la estructura de directorios:
  ```
    Proyecto/
  ├── src/
  │   ├── Main.java
  │   ├── modulos/
  │   │   ├── Usuario.java
  │   │   ├── Administrador.java
  │   │   └── Empleado.java
  │   ├── interfaces/
  │   │   └── ArregloInterface.java
  │   ├── utilidades/
  │   │   └── ManejadorArchivos.java
  │   └── ManejadorLista.java
  ├── BD/
  │   ├── Empleados.txt
  │   └── Administradores.txt
  └── README.txt
  ```

3. Compilar el proyecto desde el directorio raíz:

  ```bash
  javac -d out src/*.java src/modulos/*.java src/interfaces/*.java src/utilidades/*.java
  ```

4. Ejecutar el programa principal con 10 nombres:
  
  ```bash
  java -cp out Main "Juan" "María" "Carlos" "Ana" "Luis" "Laura" "Pedro" "Sofía" "Miguel" "Elena"
  ```
5. Revisar los archivos generados en la carpeta BD/:

- Empleados.txt

- Administradores.txt


