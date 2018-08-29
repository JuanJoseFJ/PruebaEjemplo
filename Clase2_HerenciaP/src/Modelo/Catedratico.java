/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */

public class Catedratico extends Persona{
    
    public Catedratico()
    {
        super(); //para importar todos los ATRIBUTOS Y METODOS GENERALES
    }
    
//se escribern los metodos OBLIGATORIOS que requiere la otra clase que se UTILICEN
    public void BuscarPersona()
    {
        System.out.println("Buscando personas desde Catedratico");
    }
    
    public void EditarPersona()
    {
        System.out.println("Persona Editada");
    }
    
    
}
