/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

import java.io.File;
import java.io.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dfeli
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{
        
        Universidad UN= new Universidad("UNAL");
        
        
        int b=0;
        do{
            Scanner a= new Scanner(System.in);
            System.out.println("\n");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Anadir sede");
            System.out.println("2. Eliminar sede");
            System.out.println("3. Matricular estudiante");
            System.out.println("4. Añadir programas");
            System.out.println("5. Listar sedes");
            System.out.println("6. Salir");
            try{
            
            b=a.nextInt();
            
            if(b==1){
                int c=0;
                do{
                    System.out.println("\n");
                System.out.println("¿Qué tipo de sede quiere anadir?");
                System.out.println("1. Tecnologica");
                System.out.println("2. Profesional");
                System.out.println("3. Educacion continua");
                c=a.nextInt();
                if(c==1){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        int estudiantes=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        System.out.println("Escriba la cantidad de estudiantes:");
                        estudiantes=a.nextInt();
                        
                        
                        UN.añadirTecnologico(nombre, direccion, telefono, AreaConstruida, estudiantes);
                        d=0;
                    }while(d!=0);
                }
                    if(c==2){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        int AltaCalidad=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        System.out.println("Escriba la cantidad de programas de alta calidad:");
                        AltaCalidad=a.nextInt();
                        UN.añadirProfesional(AltaCalidad,nombre, direccion, telefono, AreaConstruida);
                        d=0;
                    }while(d!=0);
                }
                    if(c==3){
                    int d=0;
                    do{
                        String nombre = null;
                        String direccion=null; 
                        int telefono=0;
                        double AreaConstruida=0;
                        System.out.println("Escriba el nombre de la sede:");
                        nombre=a.nextLine();
                        nombre=a.nextLine();
                        System.out.println("Escriba la direccion de la sede:");
                        direccion=a.nextLine();
                        System.out.println("Escriba el telefono de la sede:");
                        telefono=a.nextInt();
                        System.out.println("Escriba el Area Construida:");
                        AreaConstruida=a.nextDouble();
                        
                        UN.añadirEdContinua(nombre, direccion, telefono, AreaConstruida);
                        d=0;
                    }while(d!=0);
                }
                }while(c>3||c<1);
                b=7;
            }
            
            
            if(b==4){
                String nombre=null;
                System.out.println("Ingrese nombre de la sede a la que quiere añadir un programa: ");
                nombre = a.next();
                for (Iterator<Sede> it = UN.sedes.iterator(); it.hasNext();) {
                    Sede h = it.next();
                    if(h.nombre.equals(nombre)){
                        if(h instanceof Tecnologico){
                            System.out.println("Ingrese el nombre del programa: ");
                            String prog = a.next();
                            System.out.println("Ingrese descripcion del programa en una palabra: ");
                            String descrip = a.nextLine();
                            descrip = a.nextLine();
                        ((Tecnologico)h).getProFormacion().add(new ProgramaDeFormacion(prog,descrip));
                        }else if(h instanceof EducacionContinua){
                            System.out.println("Ingrese el nombre del programa: ");
                            String prog = a.next();
                            System.out.println("Ingrese descripcion del programa: ");
                            String descrip = a.nextLine();
                            descrip = a.nextLine();
                            ((EducacionContinua)h).getProgramas().add(new ProgramasEcontinua(prog,descrip));
                        }else if(h instanceof Profesional){
                            
                            System.out.println("1. Programa profesional");
                            System.out.println("2. Programa tecnologico");
                            System.out.println("3. Programa educacion continua");
                            int p=a.nextInt();
                            if(p==1){
                            System.out.println("Ingrese el nombre del programa: ");
                            String prog = a.next();
                            System.out.println("Ingrese descripcion del programa: ");
                            String descrip = a.nextLine();
                            descrip = a.nextLine();
                            ((Profesional)h).getProFormacion().add(new ProgramaDeFormacion(prog,descrip));
                            }
                            if(p==2){
                            System.out.println("Ingrese el nombre del programa: ");
                            String prog = a.next();
                            System.out.println("Ingrese descripcion del programa: ");
                            String descrip = a.nextLine();
                            descrip = a.nextLine();
                            ((Profesional)h).getProTecnicos().add(new ProgramaDeFormacion(prog,descrip));
                            }
                            if(p==3){
                            System.out.println("Ingrese el nombre del programa: ");
                            String prog = a.next();
                            System.out.println("Ingrese descripcion del programa: ");
                            String descrip = a.nextLine();
                            descrip = a.nextLine();
                            ((Profesional)h).getProContinua().add(new ProgramasEcontinua(prog,descrip));
                            }
                        }
                    }
                }
                b=7;
            }
            if(b==5){
                
            UN.ListarSedes();
            b=7;
            }
            if(b==6){
                System.out.println("Salir");
                b=6;
            }
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No escribio un valor correcto");
            }finally{
                System.out.println("Proceso terminado");
                
                
            }
        }while(b>6||b<1);
        try{
            ObjectOutputStream escribir= new ObjectOutputStream(new FileOutputStream(new File("Sedes/Guardado.txt")));
            escribir.writeObject(UN);
            escribir.close();
            ObjectInputStream recuperar= new ObjectInputStream(new FileInputStream(new File("Sedes/Guardado.txt")));
            Universidad UN2 = (Universidad)recuperar.readObject();
            recuperar.close();
            }catch(Exception e){
            e.printStackTrace();
            
        }
    }
            
            
}
