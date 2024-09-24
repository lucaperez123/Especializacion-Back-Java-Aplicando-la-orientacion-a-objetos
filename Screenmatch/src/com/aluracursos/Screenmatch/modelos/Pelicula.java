package com.aluracursos.Screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
     private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
