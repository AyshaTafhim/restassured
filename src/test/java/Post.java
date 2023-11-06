import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


   /* @Test
    public void post1(){
        given()
                .header("content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().all();
                }*/


public class Post {

    @Test
            public void post2(){
            JSONObject res=new JSONObject();
            res.put("name","morpheus");
            res.put("job","leader");
            Response r=given().header("content-Type","application/json")
                    .body(res.toString())
                    .when()
                    .post("https://reqres.in/api/users")
                    .then().assertThat().statusCode(201).extract().response();
            System.out.println(r.body().asPrettyString());

        }


}
