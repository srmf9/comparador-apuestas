import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

/**
 * Created by salva on 23/06/16.
 */
public class Liga extends ScrapPage {
    public ArrayList<Partido> fechas = new ArrayList();

    public Liga(String url) { getUrl(url); }

    @Override
    protected void setDocument(Document doc) {
        Elements listaMa = doc.getElementsByClass("ma");
        for(Element ma: listaMa) {
            System.out.println("yeah!");
            Element a = ma.select("a").get(0);
            Element team1 = a.select(".label_team1").get(0);
            Element team2 = a.select(".label_team2").get(0);
            fechas.add(new Partido(team1.text() + " - " + team2.text(), a.attr("href")));
        }
    }
}
