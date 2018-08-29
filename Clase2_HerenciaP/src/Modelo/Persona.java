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
public abstract class Persona {   //usamos "abstract" para encapsularlo completamente
    
    //atributoa privados 
    private String apellidos;
    private String nombre;
    private String direccion;
    private String telefono;
    
    //constructor
    public Persona()
    {
        
    }
    
//METODOS    
    public String AgregarPersona(String apellidos, String nombre, String direccion, String telefono)
    {
        //asignacion de valores 
        //usando "this" para diferenciar variables propias de la clase y de las recibidas
        this.apellidos=apellidos;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    
        //enviamos mensaje de verificacion de recibido los datos
        return "Se Agrego la Persona: "+this.nombre+" "+this.apellidos; 
    }

    
//--------------------------------SETER Y GETTER------------------------------------------
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
//-----------------------------------------------------------------------------------
    
    
    public static String EliminarPersona(String datos) //se le coloca "static" para que si se pueda utilizar
    {
        return "Se elimino la Persona: "+datos; //simulacion de eliminacion
    }
    
    
    //Metodos OBLIGATORIOS para todos cuando utilicen la ESTA CLASE
    //pero estos solo se mencionan no se les colocan NADA
    public abstract void BuscarPersona(); 
    public abstract void EditarPersona();
    
    
    
}
