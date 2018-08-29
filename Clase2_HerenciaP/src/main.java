
import Modelo.Alumno;
import Modelo.Catedratico;
import Modelo.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Persona nuevaPersona = new Persona(); //esto se debe eliminar 
        //para lograrlo colocamos "abstract" a la clase
        
        Catedratico nuevoCatedratico = new Catedratico();
        
        Alumno nuevoAlumno = new Alumno();
        
        
        nuevoAlumno.BuscarPersona();
        nuevoCatedratico.BuscarPersona();
        
        //Podemos axceder a la clase abstract Persona solo por su nombre 
        //pero como solo dejamos "static" un metodo SOLO ese podemos utilizar fuera de el 
        //Persona.EliminarPersona(datos);
    }
    
}
