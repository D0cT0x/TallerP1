package org.example;

/*
Nombre: César Sánchez
Materia: Programacion II
Intruccion: Generar una aplicacion en java que permita el ingreso de datos de un empleado
**Cedula, Nombre, Género, Fecha de nacimiento, Información de Residencia
**Salario
**Fecha de ingreso
La aplicación debe incluir funciones de: modificar salario, calcular edad, calcular prestaciones(antiguedad*salario/12)
 */

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha_nacimiento =  LocalDate.of(1994,5,15);

        Empleado empleado2 = new Empleado("160894082", "Martin", 'M', fecha_nacimiento);
        empleado2.setFecha_ingreso(new Date("10/10/2020"));


        //Modificar el sueldo
        System.out.println("El sueldo actual es: " + empleado2.getSalario());
        empleado2.setSalario(500);
        System.out.println("El nuevo sueldo es: " + empleado2.getSalario());

        //Calcular la edad
        System.out.println("La edad del empleado es:" + empleado2.calcularEdad());

        //Calcular las prestaciones
        System.out.println("Las prestaciones del empleado 2 son: " + empleado2.Calcular_Prestaciones());

        //ToString
        System.out.println(empleado2.toString());
    }
}