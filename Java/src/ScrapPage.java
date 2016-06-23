import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by salva on 23/06/16.
 */
public abstract class ScrapPage {
    private final String baseUrl = "http://www.wincomparator.com";

    protected void getUrl(String url) {

        try {
            System.out.println(baseUrl + url);
            Document d = Jsoup.connect(baseUrl + url).get();
            setDocument(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract void setDocument(Document doc);
}
