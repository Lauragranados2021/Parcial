# Parcial

## Descripción
Este proyecto es una aplicación de gestión de prácticas académicas desarrollada con Spring Boot y Maven.

## Instalación
1. Clona el repositorio:
   ```bash
    git clone https://github.com/Lauragranados2021/Parcial.git
   
    ```

2. Importa el proyecto en tu IDE como un proyecto Maven.
3. Ejecuta el proyecto desde el IDE o desde la línea de comandos con Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Abre un navegador y accede a la siguiente URL:
   ```
    http://localhost:8080/swagger-ui/index.html#/

    ```
5. Recuerda que la rama principal de este repo es master y por tanto el desarrollo se encuentra ahi 
## Como funciona     

5.1 Orden para la creacion de Entidades 
5.1.1 Para Crear una Practica usted Primero deber crear una empresa y un Docente 
5.1.2 Caundo cree estos dos registos use las llaves primarias para colocar las dentro de la practica 
5.1.3 Para crear un estudiante primero debe crear una practica y asignarla al estudiante
### A TENER EN CUENTA 
1. 1.1 Para la creacion de una practica los valores de inicio y fin se llenaran de esta manera "inicio": "2024-07-31T06:31:03.605Z",
   "fin": "2024-07-31T06:31:03.605Z",
2. 1.2 Cuando usted haga una busqueda por periodo de tiempo debe enviar datos debe hacerlo con el siguiente formato :2024-07-31T05:41:20.743+00:00 lo mismo para el campo endDate


## Trabajo Realizado Por Laura Nicol Granados Y Tatiana Lesmes 