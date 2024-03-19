import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class RestAssuredTests {
    @BeforeClass
    public void InitBaseURL()
    {
        RestAssured.baseURI="https://api.github.com/";
    }
    @Test
    public void getGitHubEvents()
    {
    var response = when().get("events").then()
               .statusCode(200)
               .contentType(ContentType.JSON)
               .extract().response();

    System.out.println(response.jsonPath().getList("$"));
    }
}
