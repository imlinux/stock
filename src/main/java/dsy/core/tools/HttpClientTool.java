package dsy.core.tools;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;

import static dsy.core.tools.Tool.close;

/**
 * @author dong
 * @since 18-11-2
 */
public class HttpClientTool {
    private static Log LOG = LogFactory.getLog(HttpClientTool.class);

    public static String get(String url, String encoding) throws Exception {

        CloseableHttpClient httpClient = HttpClients
                .custom()
                .setUserAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                .setRetryHandler(new DefaultHttpRequestRetryHandler(3,true))
                .build();

        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpGet);
            HttpEntity entity1 = response.getEntity();

            return IOUtils.toString(entity1.getContent(), encoding);
        } catch (Exception e) {
            throw e;
        } finally {
            close(response);
        }
    }
}
