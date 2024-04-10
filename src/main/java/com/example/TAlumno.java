package com.example;

public class TAlumno{
    int cedula;
    String nombre;
    String apellido;

    public TAlumno(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static void main(String[] args) {
        // 1. Crear dos instancias del TDA Conjunto para representar los cursos
        Conjunto<TAlumno> cursoAED1 = new Conjunto<TAlumno>();
        Conjunto<TAlumno> cursoPF = new Conjunto<TAlumno>();

        // 2. Crear varias instancias de TAlumno
        TAlumno alumno1 = new TAlumno(1234, "Juan", "Perez");
        TAlumno alumno2 = new TAlumno(5678, "Maria", "Gomez");
        TAlumno alumno3 = new TAlumno(9012, "Pedro", "Martinez");
/*
        // 3. Asignar alumnos a los cursos
        cursoAED1.insertar(alumno1);
        cursoAED1.insertar(alumno2);
        cursoPF.insertar(alumno2); // Maria está en ambos cursos
        cursoPF.insertar(alumno3);

        // 4. Listado de alumnos en cualquiera de los dos cursos
        Conjunto<TAlumno> alumnosEnCualquierCurso = cursoAED1.union(cursoPF);
        System.out.println("Alumnos en cualquier curso:");
        alumnosEnCualquierCurso.mostrarElementos();

        // 5. Listado de alumnos en ambos cursos
        Conjunto<TAlumno> alumnosEnAmbosCursos = cursoAED1.interseccion(cursoPF);
        System.out.println("Alumnos en ambos cursos:");
        alumnosEnAmbosCursos.mostrarElementos(); */
    }
}
