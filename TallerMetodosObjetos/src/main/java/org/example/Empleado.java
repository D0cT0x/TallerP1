package org.example;


import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Empleado {

    private String cedula;
    public String nombre;
    private char genero;
    private LocalDate fecha_nacimiento;
    public Residencia residencia;
    private double salario;
    private Date fecha_ingreso;
    private int edad;
    private double prestaciones;
    private int antiguedad;

    //CONSTRUCTORES
    //Por defecto
    public Empleado() {
        this.cedula = " ";
        this.nombre = " ";
        this.genero = 'M';
        this.salario = 466;
        this.fecha_ingreso = new Date();
        this.residencia = new Residencia("Direccion 1", "Quito", 166);
    }

    //Constructor por parametros
    public Empleado(String cedula, String nombre, char genero, LocalDate fecha_nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.salario = 466;
        this.fecha_nacimiento = fecha_nacimiento;
        this.residencia = new Residencia("Direccion 1", "Quito", 166);

    }

    //Fin constructores

    //Metodos
    //Getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(this.fecha_nacimiento, fechaActual);
        int edad = period.getYears();
        return edad;
    }

    public int CalcularAntiguedad() {
        int anio_ingreso = this.fecha_ingreso.getYear()+1900;
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);

        return anio_actual - anio_ingreso;
    }

    public double Calcular_Prestaciones(){
        int antiguedad = CalcularAntiguedad();
        double prestaciones = antiguedad*this.salario/12;

        return prestaciones;
    }

    public String toString(){
        return "Nombre: " +this.nombre + ", Cedula: " +this.cedula + ", Genero: " +this.genero;
    }
}
