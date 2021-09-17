/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbprogra2b;

import datos.ClsAlumnoJDBC;
import dominio.ClsAlumno;
import dominio.Clscomisiones;
import java.sql.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ejemploPrincipal {
    
//    public static void main(String[] args) {
//        //ej1();
//        
//        Scanner tecla = new Scanner(System.in);
//        Scanner tecla2 = new Scanner(System.in);
//        Scanner tecla3 = new Scanner(System.in);
//        Scanner tecla4 = new Scanner(System.in);
//        Scanner tecla5 = new Scanner(System.in);
//        
//        int opcion = 0;
//        boolean salir = false;
//        int opcionMenu = 0;
//        
//        ClsAlumnoJDBC alJDBC = new ClsAlumnoJDBC();
//        Clscomisiones nuevo = new Clscomisiones();
//        
//        
//        
//        
//        System.out.println("Bienvenido al programa de lista de comisiones");
//
//        do{
//            
//            System.out.println("Ingresa una opcion porfavor:");
//            System.out.println("1. Ver datos\n2. Ingresar datos\n3. Actualizar un dato\n4. Borrar un dato\n5. Salir");
//            
//            opcionMenu = tecla.nextInt();
//            
//            switch(opcionMenu){
//                
//                case 1:
//                    
//                    System.out.println("Aca estan tus datos: ");
//                    List<Clscomisiones> todos = alJDBC.seleccion();
//        
//                    for(Clscomisiones alumno : todos){
//                        System.out.println("Alumno = "+alumno);
//                    }
//                    
//                    break;
//                case 2:
//                    
//                    System.out.println("Ingresa los datos en orden: ");
//                    System.out.println("Ingresa el nombre: ");
//                    String nombreNuevo = tecla.next();
//                    nuevo.setNombre(nombreNuevo);
//                    System.out.println("Ingresa Enero: ");
//                    int Ene = tecla2.nextInt();
//                    nuevo.setEnero(Ene);
//                    System.out.println("Ingresa Febrero: ");
//                    int Feb = tecla3.nextInt();
//                    nuevo.setFebrero(Feb);
//                    System.out.println("Ingresa marzo: ");
//                    int Mar = tecla4.nextInt();
//                    nuevo.setMarzo(Mar);
//                    System.out.println("Calculando total: ");
//                    int total = Ene+Feb+Mar;
//                    nuevo.setTotal(total);
//                    System.out.println("Calculando promedio: ");
//                    double promedio = total/3;
//                    nuevo.setPromedio(promedio);
//                    alJDBC.insert(nuevo);
//                    
//                    
//                    break;
//                case 3:
//                    
//                    System.out.println("Pon los nuevos datos: ");
//                    System.out.println("Introduce el nuevo nombre: ");
//                    String nombreAct = tecla.next();
//                    nuevo.setNombre(nombreAct);
//                    System.out.println("Introduce la nueva cantidad de enero: ");
//                    int EneAct = tecla.nextInt();
//                    nuevo.setEnero(EneAct);
//                    System.out.println("Introduce la nueva cantidad de febrero: ");
//                    int FebAct = tecla.nextInt();
//                    nuevo.setFebrero(FebAct);
//                    System.out.println("Introduce la nueva cantidad de Marzo: ");
//                    int MarAct = tecla.nextInt();
//                    nuevo.setMarzo(MarAct);
//                    System.out.println("El nuevo total de esta comision esta siendo calculado");
//                    int totalAct = EneAct+FebAct+MarAct;
//                    nuevo.setTotal(totalAct);
//                    System.out.println("El nuevo promedio esta siendo calculado");
//                    double PromAct = totalAct/3;
//                    nuevo.setPromedio(PromAct);
//                    System.out.println("Cual es el codigo de la persona a modificar??\nIntroduce el codigo: ");
//                    int codigoMod = tecla.nextInt();
//                    nuevo.setCodigo(codigoMod);
//                    alJDBC.actualizar(nuevo);
//                    
//                    break;
//                case 4:
//                    
//                    System.out.println("Que dato quieres borrar?? ");
//                    System.out.println("Introduce el codigo de la persona a borrar: ");
//                    int codigoBorrar = tecla.nextInt();
//                    nuevo.setCodigo(codigoBorrar);
//                    System.out.println("Introduce el nombre de la persona a borrar de la base de datos: ");
//                    String nombreBorrar = tecla.next();
//                    nuevo.setNombre(nombreBorrar);
//                    System.out.println("Introduce la cantidad de enero para borrarla: ");
//                    int eneroBorrar = tecla.nextInt();
//                    nuevo.setEnero(eneroBorrar);
//                    System.out.println("Introduce la cantidad de febrero para borrarla: ");
//                    int febreroBorrar = tecla.nextInt();
//                    nuevo.setFebrero(febreroBorrar);
//                    System.out.println("Introduce la cantidad de marzo para borrarla: ");
//                    int marzoBorrar = tecla.nextInt();
//                    nuevo.setMarzo(marzoBorrar);
//                    System.out.println("Borrando el total...");
//                    int totalBorrar = tecla.nextInt();
//                    nuevo.setTotal(totalBorrar);
//                    System.out.println("Borrando el promedio tambien...");
//                    double promBorrar = tecla.nextDouble();
//                    nuevo.setPromedio(promBorrar);
//                    alJDBC.borrar(nuevo);
//                    
//                    break;
//                case 5:
//                    
//                    System.exit(0);
//                    
//                    break;
//                default:
//                    System.out.println("Esa opcion no esta disponible vuelve a intentar");
//                
//            }
//            
//        }while(salir=true);
//        
//        //seleccionar informacion
//        
//        
//    }
}
