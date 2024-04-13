/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javaapplication3.Entidades.Persona;
import javaapplication3.Entidades.Persona2;
import javaapplication3.Entidades.PersonaDatosBasicos;
import javaapplication3.Entidades.PersonaDatosContactos;
import javaapplication3.Entidades.PersonaDatosRegistro;

/**
 *
 * @author Estudiante
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona();
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("00055555");
        per.setDireccion("");
        per.setTelefono("");
        per.setCorreo("");
        per.setUsuario("");
        per.setContrasena("");
        per.setEmail("");
        
        PersonaDatosBasicos dataB = 
                new PersonaDatosBasicos( "nombre", "apellido", "dni");
        PersonaDatosContactos dataC = 
                new PersonaDatosContactos("telefono", "direccion", "correo");
        PersonaDatosRegistro dataR = 
                new PersonaDatosRegistro("usuario", "contrasena", "email");        
                
        Persona2 per2 = new Persona2(dataB, dataC, dataR); 
        
        Persona carlitos = Persona.Carlos();
        Persona marco = Persona.Marcos();
        Persona juana = Persona.Juana();
    }   
}
