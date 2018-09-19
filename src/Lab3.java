import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(urlToString("https://www.bls.gov/tus/charts/chart9.txt"));
        System.out.println(urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt"));


    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public int wordCount(String toCount) {
        return (toCount.split(" ")).length;
    }

    public int wordCounter(String toCount, String word) {
        String[] wordBase = (toCount.toUpperCase()).split(" ");
        String search = word.toUpperCase();
        int instancesOf = 0;

        for (int i = 0; i < wordBase.length; i++) {
            if (wordBase[i].equals(search)) {
                instancesOf++;
            }
        }

        return instancesOf;
    }

}
