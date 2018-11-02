package dsy.core.tools;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @author dong
 * @since 18-11-2
 */
public class HttpClientTool {


    public static String get(String url, String encoding) throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            HttpEntity entity1 = response.getEntity();

            return IOUtils.toString(entity1.getContent(), encoding);
        } finally {
            response.close();
        }
    }
}
