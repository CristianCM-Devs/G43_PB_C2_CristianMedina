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
public class Principal {
    public static void main(String[] args) {
        //Instancia PersonaClass
        PersonaClass ip = new PersonaClass(1051678, "Cristian", "31255555", 22, true);
        System.out.println(ip.mostrar_informacion());
    }
}
