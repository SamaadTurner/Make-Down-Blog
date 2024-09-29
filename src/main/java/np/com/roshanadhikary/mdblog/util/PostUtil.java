
package np.com.roshanadhikary.mdblog.util;

import org.jsoup.Jsoup;

import java.util.List;
import java.util.Optional;

//import static np.com.roshanadhikary.mdblog.util.MdToHtmlRenderer.renderHTML;

public class PostUtil {
    public static String getHtmlContentFromMdLines(List<String> mdLines) {
        Optional<List<String>> mdLinesOpt = Optional.ofNullable(mdLines);
        return mdLinesOpt.isEmpty() ? "" : MdToHtmlRenderer.renderHTML(mdLinesOpt.get());
    }

    public static String getSynopsisFromHtmlContent(String htmlContent) {
        String content = Jsoup.parse(htmlContent).text();
        return content.length() <= 150 ? content : content.substring(0, 149);
    }
}
