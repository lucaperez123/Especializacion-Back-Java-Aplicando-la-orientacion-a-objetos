import com.aluracursos.Screenmatch.modelos.Episodio;
import com.aluracursos.Screenmatch.modelos.Pelicula;
import com.aluracursos.Screenmatch.modelos.Serie;
import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmacth.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); // creando una nueva instancia(espacio) //objeto
        miPelicula.setNombre("Matrix"); // asignandole valores al objeto
        miPelicula.setFechaDeLanzamiento(1998);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.getNombre();
        miPelicula.getDuracionEnMinutos();
        miPelicula.getDuracionEnMinutos();

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones()); // modificando el acceso de el usuario solamente visualizando
        System.out.println(miPelicula.calculaMedia());

        //objeto creado desde la herencia de serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Avengers");
        otraPelicula.setFechaDeLanzamiento(2022);
        otraPelicula.setDuracionEnMinutos(180);


        // nueva instancia objeto
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo nesecario para ver tus titulos favoritos estas vaaciones "+ calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targayen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);


    }
}
