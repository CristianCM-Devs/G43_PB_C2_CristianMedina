/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Cristian C. Medina
 */
public class PersonaClass {
    
    // Atributos
    private int cedula;
    private String nombre;
    private String telefono;
    private int edad;
    private boolean vacunado;

    //Constuctor
    public PersonaClass(int cedula, String nombre, String telefono, int edad, boolean vacunado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.vacunado = vacunado;
    }
    
    // Gets & Sets
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    
    public String mostrar_informacion(){
        return "-------- Informacion de la persona --------\nNombre: " + getNombre() + 
                "\nCedula: " + getCedula() + 
                "\nTelefono: " + getTelefono() + 
                "\nEdad: " + getEdad() + 
                "\n¿Esta vacunado?: " + isVacunado();
    }
    
}
