/**
 * Created by salva on 23/06/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("fuck fuck yeah!");
        Liga liga = new Liga("/es-es/cuotas/futbol/brasil/brasileno-serie-b-12/");
        for(Partido partido : liga.fechas) {
            System.out.println(partido);
        }
    }
}
