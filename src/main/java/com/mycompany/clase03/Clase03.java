/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author porto
 */

public class Clase03 {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de Propulsion del Vehiculo:\n1)Combustion\n2)Electrico");
        int typeCar = scanner.nextInt();
        
        System.out.println("Ingrese el tipo de vehiculo:");
        String tipoVehiculo = scanner.next();
        System.out.println("Ingrese el id del vehiculo:");
        String id = scanner.next();
        System.out.println("Ingrese el año del vehiculo:");
        int anio = scanner.nextInt();
        System.out.println("Ingrese la marca del vehiculo:");
        String marca = scanner.next();
        System.out.println("Ingrese el modelo del vehiculo:");
        String modelo = scanner.next();
        System.out.println("Ingrese el % de gasolina del Vehiculo");
        int cantidadEnergia = scanner.nextInt();
        System.out.println("Ingrese la cantidad de ruedas del Vehiculo:");
        int ruedas = scanner.nextInt();
        
        if (typeCar == 1) {
            VehiculoCombustionTerrestre vehiculo = new VehiculoCombustionTerrestre(cantidadEnergia, tipoVehiculo, ruedas, id, anio, marca, modelo);
            vehiculos.add(vehiculo);
        } else if (typeCar == 2) {
            VehiculoElectricoTerrestre vehiculo = new VehiculoElectricoTerrestre(cantidadEnergia, tipoVehiculo, cantidadEnergia, id, anio, marca, modelo);
            vehiculos.add(vehiculo);
        }
        
        
        
        while (true) {            
            System.out.println("Que deseas hacer con el vehiculo:"
                    + "\n 1)Encender"
                    + "\n 2)Apagar"
                    + "\n 3)Avanzar"
                    + "\n 4)Retroceder"
                    + "\n 5)Girar");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    vehiculos
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
    }
}
