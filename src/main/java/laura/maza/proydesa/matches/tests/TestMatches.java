/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laura.maza.proydesa.matches.tests;

import java.util.ArrayList;
import java.util.List;
import laura.maza.proydesa.matches.clases.Empleado;

/**
 *
 * @author laura
 */
public class TestMatches {
    public static void main(String[] args) {
        // Inicializamos las listas
        List<Empleado> listaEmpleados = new ArrayList<>();
        
    
        //carga de empleados
        listaEmpleados.add(new Empleado("2qwerxcvxcv","Marcos"));
        listaEmpleados.add(new Empleado("as1323sdf","Jere"));
        listaEmpleados.add(new Empleado("@sdfsdf","Jere"));
        listaEmpleados.add(new Empleado("4","Jose"));
        listaEmpleados.add(new Empleado("8","Jeronimo"));
        listaEmpleados.add(new Empleado("7","Jaime"));
        listaEmpleados.add(new Empleado("4","Arian"));
        listaEmpleados.add(new Empleado("1","Fernando"));
    }
    
    public static boolean coincidenciaId(String texto){
        return texto.matches("^[1-9]+[a-z,A-Z]{6,7}$");
    }
    
    public static boolean coincidenciaCelular(String texto){
        return texto.matches("^[54]+[ ]+[351]+[ ]+[1-9]{6}$");
    }
    
    public static boolean coincidenciaEmail(String texto){
        
        if(texto.matches("^[A-Z,a-z]{4}+[1-9]{2}+(@)+(gmail.com)$"))
            return true;
        
        if(texto.matches("^[A-Z,a-z]{4}+[1-9]{2}+(@)+(hotmail.com)$"))
            return true;
        
        if(texto.matches("^[A-Z,a-z]{4}+[1-9]{2}+(@)+(outlook.com)$"))
            return true;
        
        return false;
    }
}
