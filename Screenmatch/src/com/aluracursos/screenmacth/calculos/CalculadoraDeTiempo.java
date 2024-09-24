package com.aluracursos.screenmacth.calculos;

import com.aluracursos.Screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //METODO PARA INCLUIR PELICULAS Y SERIES
    public void incluye(Titulo titulo){
       this.tiempoTotal += titulo.getDuracionEnMinutos(); //polimorfiso tanto pelicula como serie son lo mismo
        //expresado de otra manera
    }

}
