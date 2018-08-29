/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{  // extends proque se EXTIENDE de Persona

    //variables propias de la clase 
    private int Codigo; 

    public Alumno()
    {
        super(); //para llamar todos los metodos y atributos GENERALES 
        //estos metodos ya no se pueden modificar
        
        
        JOptionPane.showMessageDialog(null, "Hola mundo");
        
        
    }
    
    //Metodos OBLIGATORIOS que debemos tener
    public void BuscarPersona()
    {
        System.out.println("Alumno no encontrado"); //esto es POLIMORFISMO
                    //mismo metodo pero con otro uso o CON ALGO EXTRA
    }
    public void EditarPersona()
    {
        
    }

}
