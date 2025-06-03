package com.mycompany.clase03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.clase03.VehiculoTerrestre;

import com.mycompany.clase03.VehiculoCombustion;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author porto
 */
public class VehiculoCombustionTerrestre extends VehiculoTerrestre implements VehiculoCombustion, Conduccion {

    Timer timer = new Timer();
    private int tanqueCombustible;
    private boolean status = false;
    private String direction = "Recta";
    private int timeStart;

    public VehiculoCombustionTerrestre(int tanqueCombustible, String tipoVehiculo, int cantidadRuedas, String id, int anio, String marca, String modelo) {
        super(tipoVehiculo, cantidadRuedas, id, anio, marca, modelo);
        this.tanqueCombustible = tanqueCombustible;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vehiculo terrestre");
        System.out.println("ID: " + getId());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Tipo: " + getTipoVehiculo());
        System.out.println("Cantidad de Ruedas: " + getCantidadRuedas());
    }

    @Override
    public void recargarCombustible() {
        if (this.tanqueCombustible < 100) {
            this.tanqueCombustible++;
            System.out.println("Cargando Combustible..." + this.tanqueCombustible + "_+");
            this.recargarCombustible();
        }
    }

    @Override
    public int cantidadDeCombustible() {
        return this.tanqueCombustible;
    }

    @Override
    public void encender() {
        this.status = true;

        timer = new Timer(); // recrear el Timer por si ya se canceló

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (tanqueCombustible > 0) {
                    tanqueCombustible--;
                    System.out.println("Gasolina actual : " + tanqueCombustible);
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
            this.tanqueCombustible--;
        } else {
            System.out.println("Prende el vehiculo primeramente");
        }
    }

    @Override
    public void retroceder() {
        if (this.status == true) {
            System.out.println("Vehiculo retocede");
            this.tanqueCombustible--;
        } else {
            System.out.println("Prende el vehiculo primeramente");
        }
    }

    @Override
    public void girar(String direccion) {

    }

}
