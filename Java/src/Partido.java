import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

/**
 * Created by salva on 23/06/16.
 */
public class Partido extends ScrapPage {
    public String nombre;
    public ArrayList<String> grupos = new ArrayList();

    public Partido(String nombre, String url) {
        this.nombre = nombre;
        getUrl(url);
    }

    @Override
    protected void setDocument(Document doc) {

    }

    @Override
    public String toString() {
        return nombre;
    }
}
