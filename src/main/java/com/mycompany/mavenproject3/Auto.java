/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author PC-07
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + " y el propietario es: " + this.nombrePropietario;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";

        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";

        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
            return retorno;

        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
                return retorno;

            } else {
                if (this.marca.equals("Mercedez")) {
                    retorno = "Alemania";
                    return retorno;

                } else {
                    if (this.marca.equals("Jetsour")) {
                        retorno = "Japon";
                        return retorno;

                    }

                }

            }

        }

    }
}
