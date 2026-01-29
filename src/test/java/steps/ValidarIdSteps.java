package steps;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class ValidarIdSteps {

    private Response response;

    @Given("consumo el servicio posts con id 2")
    public void consumo_el_servicio_posts_con_id_2() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @When("ejecuto la peticion GET")
    public void ejecuto_la_peticion_get() {
        response = given()
                .when()
                .get("/posts/2");
    }

    @Then("el campo id debe ser igual a 2")
    public void el_campo_id_debe_ser_igual_a_2() {
        int id = response.jsonPath().getInt("id");
        assertEquals("El id no es correcto", 2, id);
    }
}
