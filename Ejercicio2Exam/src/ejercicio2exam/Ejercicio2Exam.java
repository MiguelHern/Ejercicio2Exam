/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2exam;

/**
 *
 * @author hdezp
 */
public class Ejercicio2Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private static String nombre;
    private static int cantidadUsuarios;
    private static Integer tiempo;
    private static String nivel;
    private static int estrella;
    
    public EjerciciovideoComuniciacion(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella){
        EjerciciovideoComuniciacion.nombre=nombre;
        EjerciciovideoComuniciacion.cantidadUsuarios=cantidadUsuarios;
        EjerciciovideoComuniciacion.estrella=estrella;
        EjerciciovideoComuniciacion.tiempo=tiempo;        
        EjerciciovideoComuniciacion.nivel=nivel;
    }
    /**
     * @param args the command line arguments
     */
    public static int calidad(){
        return cantidadUsuarios*tiempo*estrella;
    }
    public static void main(String[] args) {
        EjerciciovideoComuniciacion miExamen =new EjerciciovideoComuniciacion("meet",40,2,"libre",5);
        System.out.println(calidad());
    }
    
}
