import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Patch {
    @Test
    public void patch1(){
        given()
                .header("content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .log().all();
    }

}
