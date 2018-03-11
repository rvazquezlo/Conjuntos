/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.Iterator;

/**
 *
 * @author Regina
 */
public class Conjuntos {

    public static<T> void imprimeConjunto(ConjuntoADT<T> conjunto){
        Iterator<T> iterador;
        
        iterador = conjunto.iterator();
        System.out.println();
        while(iterador.hasNext())
            System.out.print(iterador.next() + " ");   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tiene que ser ADT porque los metodos esperan un conjunto ADT, no A
        ConjuntoADT<Integer> c1 = new ConjuntoA<Integer>();
        ConjuntoADT<Integer> c2 = new ConjuntoA<Integer>();
        ConjuntoADT<Integer> interseccion;
        ConjuntoADT<Integer> union, diferencia;
        int i;
        
        for(i = 0; i < 20; i++)
            c1.add(i);
        for(i = 10; i < 30; i++)
            c2.add(i);
        
        interseccion = c1.interseccion(c2);
        union = c1.union(c2);
        diferencia = c1.diferencia(c2);
        
        imprimeConjunto(c1);
        imprimeConjunto(c2);
        imprimeConjunto(union);
        imprimeConjunto(interseccion);
        imprimeConjunto(diferencia);
        
        
        //Pruebas Escuela
        Escuela escuela;
        
        escuela = new Escuela();
        System.out.println(escuela.altaAlumno("Regina", true, true, 10, 20));
        System.out.println(escuela.altaAlumno("Mirko", false, true, 10, 19));
        System.out.println(escuela.altaAlumno("Fer", true, false, 9.3, 19));
        System.out.println(escuela.altaAlumno("enrique", false, true, 7.3, 20));
        System.out.println(escuela.altaAlumno("MAriana", false, true, 7.8, 21));
        System.out.println(escuela.altaAlumno("MAria", true, false, 8.1, 19));
        System.out.println(escuela.altaAlumno("Carlos", true, false, 9.7, 17));
        System.out.println(escuela.altaAlumno("Regina", false, false, 10, 20));
        
//        System.out.println(escuela.bajaAlumno(-1));
//        System.out.println(escuela.bajaAlumno(3));

        System.out.println(escuela.regresaTodosLosAlumnos());
        System.out.println(escuela.regresaAlumnosIngLic());
        System.out.println(escuela.regresaAlumnosIngOLic());
        System.out.println(escuela.calculaPromedioIngenieria());
        System.out.println(escuela.calculaAlumnosMayoresLicenciatura(18));
    }
    
}
