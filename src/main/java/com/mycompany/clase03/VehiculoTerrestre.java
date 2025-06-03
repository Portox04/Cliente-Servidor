/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author porto
 */
public class VehiculoTerrestre extends Vehiculo{
    private String tipoVehiculo;
    private int cantidadRuedas;

    public VehiculoTerrestre(String tipoVehiculo, int cantidadRuedas, String id, int anio, String marca, String modelo) {
        super(id, anio, marca, modelo);
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }
    
        @Override
    public void mostrarDetalles(){
        System.out.println("Vehiculo terrestre");
        System.out.println("ID: " + getId());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Tipo: " + getTipoVehiculo());
        System.out.println("Cantidad de Ruedas: " + getTipoVehiculo());
    }
    
}
