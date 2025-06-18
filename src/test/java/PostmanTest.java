import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanTest {
    @Test
    void shouldData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hello"));
    }
}

