# Parcial 2 - Construir una API REST con Spring Boot

Profesor Espejo - Alumno : Agustin Nahuel Aciar COM3

---

## Requisitos 

* Listar cursos, profesores y estudiantes
* Crear nuevos cursos con su profesor.
* Asignar estudiantes a un curso.
* Devolver la lista de cursos en los que esta un estudiante.

---

## Modelos y Relaciones

1.  **Profesor**: (id, nombre, email)
2.  **Estudiante**: (id, nombre, matrícula)
3.  **Curso**: (nombre, un profesor asociado, una lista de estudiantes)

* Un Profesor puede tener varios Cursos (`@ManyToOne` desde Curso).
* Un Curso puede tener varios Estudiantes, y un Estudiante puede pertenecer a varios Cursos (`@ManyToMany`).

---

## Pruebas (con Postman)

(Revisar que este corriendo en `localhost:8080`)

### 1. Crear Datos

**Crear un Profesor:**
* `POST` `http://localhost:8080/api/profesores`
* Body (raw/JSON):
    ```json
    {
      "nombre": "Tito Calderon",
      "email": "titocalderon@it.com"
    }
    ```

**Crear un Estudiante:**
* `POST` `http://localhost:8080/api/estudiantes`
* Body (raw/JSON):
    ```json
    {
      "nombre": "Nahuel",
      "matricula": "C-03"
    }
    ```

### 2. Probar Lógica de Negocio

**Crear un Curso (con profesor):**
*(Usar el ID del profesor creado en el paso 1, ej: `profesorId=1`)*
* `POST` `http://localhost:8080/api/cursos?profesorId=1`
* Body (raw/JSON):
    ```json
    {
      "nombre": "Italiano 1"
    }
    ```

**Asignar Estudiante a Curso:**
*(Usar el ID del curso y el ID del estudiante, ej: `/1/estudiantes/1`)*
* `POST` `http://localhost:8080/api/cursos/1/estudiantes/1`

### 3. Probar Consultas (GET)

**Devolver cursos de un estudiante:**
*(Usar el ID del estudiante)*
* `GET` `http://localhost:8080/api/estudiantes/1/cursos`

**Listar todo:**
* `GET` `http://localhost:8080/api/cursos`
* `GET` `http://localhost:8080/api/profesores`
* `GET` `http://localhost:8080/api/estudiantes`

