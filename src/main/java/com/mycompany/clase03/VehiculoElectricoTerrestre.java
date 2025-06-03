/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author porto
 */
public class VehiculoElectricoTerrestre extends VehiculoTerrestre implements VehiculoElectrico, Conduccion {

    Timer timer = new Timer();
    private int porcentajeBateria;
    private boolean status = false;
    private String direction = "Recta";
    private int timeStart;

    public VehiculoElectricoTerrestre(int porcentajeBateria, String tipoVehiculo, int cantidadRuedas, String id, int anio, String marca, String modelo) {
        super(tipoVehiculo, cantidadRuedas, id, anio, marca, modelo);
        this.porcentajeBateria = porcentajeBateria;
    }

    @Override
    public void cargarBateria() {
        if (this.porcentajeBateria < 100) {
            this.porcentajeBateria++;
            System.out.println("Cargando..." + this.porcentajeBateria + "%");
            this.cargarBateria();
        }
    }

    @Override
    public int obtenerPorcentaje() {
        return this.porcentajeBateria;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Porcentaje Bateria: " + porcentajeBateria + "%");

    }

    @Override
    public void encender() {
        this.status = true;

        timer = new Timer(); // recrear el Timer por si ya se canceló

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (porcentajeBateria > 0) {
                    porcentajeBateria--;
                    System.out.println("Gasolina actual : " + porcentajeBateria);
                } else {
                    System.out.println("Sin gasolina");
                    timer.cancel();
                    status = false;
                }
            }
        };

        timer.scheduleAtFixedRate(tarea, 0, 10000); // cada 10 segundos
    }

    @Override
    public void apagar() {
        this.status = false;
        timer.cancel();
    }

    @Override
    public void avanzar() {
        if (this.status == true) {
            System.out.println("Vehiculo avanza a " + direction);
            this.porcentajeBateria--;
        } else {
            System.out.println("Prende el vehiculo primeramente");
        }
    }

    @Override
    public void retroceder() {
        if (this.status == true) {
            System.out.println("Vehiculo retocede");
            this.porcentajeBateria--;
        } else {
            System.out.println("Prende el vehiculo primeramente");
        }
    }

}
