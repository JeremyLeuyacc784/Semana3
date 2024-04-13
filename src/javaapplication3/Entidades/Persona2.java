/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.Entidades;

/**
 *
 * @author Estudiante
 */
public class Persona2 {
    
    PersonaDatosBasicos dataB;
    PersonaDatosContactos dataC;
    PersonaDatosRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosContactos dataC, PersonaDatosRegistro dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public PersonaDatosBasicos getDataB() {
        return dataB;
    }

    public void setDataB(PersonaDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public PersonaDatosContactos getDataC() {
        return dataC;
    }

    public void setDataC(PersonaDatosContactos dataC) {
        this.dataC = dataC;
    }

    public PersonaDatosRegistro getDataR() {
        return dataR;
    }

    public void setDataR(PersonaDatosRegistro dataR) {
        this.dataR = dataR;
    }
    
    
}
