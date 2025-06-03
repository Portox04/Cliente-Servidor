/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.clase03;

/**
 *
 * @author porto
 */
public interface Conduccion {

    void encender() throws VehiculeException;

    void apagar() throws VehiculeException;

    void avanzar() throws VehiculeException;

    void retroceder() throws VehiculeException;

    void girar(String direccion) throws VehiculeException;
}
