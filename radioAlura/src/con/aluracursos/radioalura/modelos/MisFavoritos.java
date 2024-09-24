package con.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "E uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitulo()+ "Tambien es uno de los mas visto");
        }
    }
}
