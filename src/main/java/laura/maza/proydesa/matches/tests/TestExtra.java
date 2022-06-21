/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laura.maza.proydesa.matches.tests;

/**
 *
 * @author laura
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Extra


Verificador para carga de texto un while
CREAR UN PROGRAMA QUE CARGUE UNA SERIE DE PALABRAs A UNA LISTA
PARA ESTO DEBERAN DESARROLAR UN CARGAR TEXTO(SCANNER)
Y LUEGO HACER UNA FUNCION CON UN CICLO EN DONDE PARA CADA SITUACION DE CARGA
NOSOTROS DEBAMOS INDICAR CON UN "SI" O UN "NO" SI QUEREMOS SEGUIR CARGANDO
HACER VERIFICACION EN CASO DE QUE LA PERSONA NO INGRESs NI SI NI NO 
EN ESE CASO SE DEBE DECIR QUE "INGRESO FUE INCORRECTO"
CUANDO SE SELECCIONE EL NO MOSTRAR LA LISTA CARGADA



*/

public class TestExtra {
    
    public static void main(String[] args) {
        
        List<String> nombres=new ArrayList<>();
        
        cargaLista(nombres);
        
        nombres.forEach(System.out::println);
        
        
        
    }
    
    
    public static boolean verificador(String texto){
        
        //return texto.matches("^(SI){1}$");
        return texto.matches("^(s|S){1}+(i|I){1}$");
        
    
    }
    
    public static String cargarTexto(String texto){
    
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        String retorno=sn.nextLine();
    
        return retorno;
    }
    
    
    public static void cargaLista(List<String> lista){
    
        String opcion;
        while(true){
        
            opcion=cargarTexto("Ingrese (SI) para cargar un nombre o (NO) para salir");        
            
            
            if (verificador(opcion)) {
                
                lista.add(cargarTexto("Ingrese el nombre a cargar:"));
                
            } 
            else if(opcion.equalsIgnoreCase("no")){
                
                System.out.println("Se finalizo la carga");
                break;
                
            }
            else {
                
                System.out.println("Ingrese solo un si o no para continuar");
                
            }
        
        
        }
        
        
        
    
    }
    
}
