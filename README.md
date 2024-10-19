[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/9J9TrW2r)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16642564&assignment_repo_type=AssignmentRepo)
# Práctica 2: Introducción al desarrollo. Ponlo en práctica. 

Apoyate en los siguientes recursos para realizar la práctica:

[Descripción de la práctica](https://revilofe.github.io/section3/u01/practica/EDES-U1.-Practica011/)


---

# Título de la Actividad

## Identificación de la Actividad
- **ID de la Actividad:** [ID de la actividad]
- **Módulo:** [Nombre del módulo] (`PROG`, `IS`, `EDES`, etc.)
- **Unidad de Trabajo:** [Número y nombre de la unidad de trabajo]
- **Fecha de Creación:** [Fecha de creación]
- **Fecha de Entrega:** [Fecha de entrega]
- **Alumno(s):** 
  - **Nombre y Apellidos:** [Nombre y Apellidos del alumno o integrantes del grupo]
  - **Correo electrónico:** [Correo electrónico g.educaand.es]
  - **Iniciales del Alumno/Grupo:** [Iniciales del alumno o del grupo]

## Descripción de la Actividad
[Descripción detallada de la actividad, objetivos, y contexto necesario para comprenderla. Explicar en qué consiste la actividad y qué se espera que el alumno desarrolle o implemente.]

## Instrucciones de Compilación y Ejecución
1. **Requisitos Previos:**
   - [Lenguaje de programación y versión]
   - [Entorno de desarrollo o dependencias necesarias]

2. **Pasos para Compilar el Código:**
   ```bash
   [Comando para compilar el código]
   ```

3. **Pasos para Ejecutar el Código:**
   ```bash
   [Comando para ejecutar la aplicación]
   ```

4. **Ejecución de Pruebas:**
   ```bash
   [Comandos para ejecutar pruebas, si las hubiera]
   ```

## Desarrollo de la Actividad
### Descripción del Desarrollo
[Explicación de cómo se ha abordado el desarrollo de la actividad, incluyendo las decisiones de diseño, estructura del código y enfoque de resolución de problemas. Se recomienda adjuntar diagramas o capturas de pantalla si es necesario.]

### Código Fuente
[Aquí se incluirá un enlace directo a los archivos de código fuente en el repositorio, por ejemplo, si se está usando GitHub: `src/main.java` o algún enlace directo.]

### Ejemplos de Ejecución
- **Entrada 1:** Descripción de la entrada y valor de prueba.
- **Salida Esperada 1:** Explicación de la salida esperada y el resultado de la prueba.

### Resultados de Pruebas
[Aquí se detallará cómo se ha verificado la funcionalidad del código, incluyendo resultados de pruebas automatizadas o manuales, en caso de que las haya.]

## Documentación Adicional
- **Manual de Usuario:** [Enlace a la documentación del usuario, si existe]
- **Autorización de Permisos:** Verificar que el profesor tenga permisos de lectura en el repositorio para revisar el código.

## Conclusiones
[Resumen de las conclusiones alcanzadas al desarrollar la actividad, las lecciones aprendidas, y posibles mejoras que se puedan implementar en futuras entregas.]

## Referencias y Fuentes
[Aquí se listarán las fuentes consultadas para el desarrollo de la actividad, tales como documentación oficial, artículos, o cualquier recurso externo relevante.]

### Notas Adicionales:
1. **Nombres de Archivos y Repositorios:**
   - Asegúrate de que el nombre del archivo o repositorio siga la estructura definida: `XXX-idActividad-Iniciales`.
2. **Permisos:**
   - Verifica que el profesor tenga los permisos necesarios para acceder al repositorio o documento.
3. **Formato:**
   - Si se entrega en formato PDF o Google Docs, asegúrate de cumplir con el mínimo y máximo de folios establecidos.
4. **Compilación y Ejecución:**
   - Detalla claramente cómo compilar y ejecutar el código, incluyendo las instrucciones en el archivo `README.md`.

# Dinamica

- Trabajar con tres lenguajes de programación diferentes:
   - Lenguajes interpretados (Python).
   - Lenguajes compilados (C).
   - Lenguajes que generan código intermedio ejecutado en una máquina virtual (Java).

# Tarea

- Escribir un pequeño programa en cada lenguaje y responder a las preguntas.

- El programa que se debe desarrollar es el siguiente:

   - Programa:

   - Escribe un programa básico en cada uno de los tres lenguajes elegidos que:
      
      - Pregunte el nombre del usuario.
      - Muestre un mensaje que diga: "Hola [nombre del usuario]. Este programa está hecho en el lenguaje de  programación: [lenguaje]".

## Python

- Para poder escribir el programa necesitaremos instalar previamente Python en nuestro equipo.

- Empezaremos escribiendo el programita yo en mi caso lo hare desde Visual Studio Code

![Programa en Python](assets\p1.png)

- Despues de escribir el codigo ejecutaremos el codigo usando **Python** en la terminal como podemos ver en la captura.

![Ejecucion en Python](assets\p2.png)

- En el caso de Python es un lenguaje interpretado por lo que gracias a un interprete se ejecuta linea a linea.

- Los lenguajes interpretados no generan codigo objeto o intermedio python genera un codigo intermedio o bytecode y esto lo ejecuta la maquina virtual de python (PVM) Este proceso suele ser invisible para el usuario.

## C

- Para poder escribir el programa necesitaremos un Compilador en mi caso yo voy a elegir MinGW.

- Empezaremos escribiendo el programita yo en mi caso  lo hare desde Visual Studio Code

![Programa en C](assets\c1.png)

- Ahora a partir del codigo fuente lo compilaremos usando gcc -c en la terminal para generar un codigo objeto.

![Compilar programa](assets\c2.png)

- Ahora generamos el archivo ejecutable.

![Generar el ejecutable](assets\c3.png)

- Como podemos ver en la siguiente captura se han generado tanto el codigo objeto como el ejecutable.

![Dir archivos](assets\c4.png)

- Ahora ejecutamos el archivo ejecutable y lo probamos.

![Ejecucion en C](assets\c5.png)

- En el caso de C es un lenguaje compilado y como su propio nombre indica necesitamos compilar el codigo fuente para generar un codigo objeto y este convertirlo en un archivo ejecutable.

## Java

- Para poder escribir el programa necesitaremos instalar JDK (Java Development Kit) tiene todo lo que necesitamos.

- Empezaremos por escribir el programa en Visual Studio Code

![Programa en Java](assets\j1.png)

- Ahora usaremos javac en la terminal para compilar el codigo fuente y transformarlo en un archivo .class

![Compilar en Java](assets\j2.png)

- Hacemos un dir para comprobar que se genero el archivo .class

![Dir archivos](assets\j4.png)

- Ahora ejecutamos el archivo .class con la JVM (Java Virtual Machine)

![Ejecucion en Java](assets\j3.png)

- En el caso de Java es un lenguaje raro ya que contiene un poco de los dos tipos de lenguajes se compila el codigo fuente en un archivo .class y este lo ejecuta en la maquina virtual de java proporcionandole caracteristicas de los lenguajes interpretados.