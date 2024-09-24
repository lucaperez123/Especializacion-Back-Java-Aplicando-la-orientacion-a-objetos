package com.aluracursos.radioalura.principal;

import con.aluracursos.radioalura.modelos.MisFavoritos;
import con.aluracursos.radioalura.modelos.Podcast;
import con.aluracursos.radioalura.modelos.cancion;

public class Principal {
    public static void main(String[]args){
        cancion miCancion = new cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Luca Perez");
        miPodcast.setTitulo("Cafe.Tech");

        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total Reproducciones:"+miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta:"+miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
        }
}
