import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Delete {
    //@Test
    public void delete(){
       Response res = RestAssured.delete("https://reqres.in/api/users/2");
        System.out.println(res.statusCode());
    }

    @Test
    public void delete1(){
        Response r=given().when().delete("https://reqres.in/api/users/2").then().extract().response();
        System.out.println(r.statusCode());
    }
}
