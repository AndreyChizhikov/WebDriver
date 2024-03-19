import net.minidev.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.imageio.IIOException;
import java.io.IOException;

public class RestClientTests {



    @Test
    public void getEmployees() throws IOException
    {
        String url ="https://dummy.restapiexample.com/api/v1/employees";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet getAllEmployees = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(getAllEmployees);

        System.out.println("Status code:" + response.getStatusLine().getStatusCode());
        System.out.println("Status phrase:" + response.getStatusLine().getReasonPhrase());
        HttpEntity entity = response.getEntity();

        String json = EntityUtils.toString(entity);
        System.out.println("Response body:" + json);
    }

    @Test
    public void createEmployee() throws IOException
    {
        JSONObject employee = new JSONObject();
        employee.put("name","John");
        employee.put("salary","1000");
        employee.put("age","19");

        StringEntity requestEntity = new StringEntity(employee.toString(), ContentType.APPLICATION_JSON);
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("https://dummy.restapiexample.com/api/v1/create");
        httpPost.setEntity(requestEntity);
        CloseableHttpResponse response = httpClient.execute(httpPost);

        System.out.println("Status code:" + response.getStatusLine().getStatusCode());
        System.out.println("Status phrase:" + response.getStatusLine().getReasonPhrase());
        HttpEntity entity = response.getEntity();

        String json = EntityUtils.toString(entity);
        System.out.println("Response body:" + json);
    }
}
