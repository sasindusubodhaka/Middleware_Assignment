package org.acme;

import com.example.petstore.Pet;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;

@QuarkusTest
public class PetResourceTest {

//	@Test
//    public void testPetEndpoint() {
//        given()
//          .when().get("/v1/pets")
//          .then()
//             .statusCode(200)
//                .body(hasItem(
// 		            allOf(
//    		                hasEntry("id", "1"),
//    		                hasEntry("petAge", "2"),
//    		                hasEntry("petName", "Tommy"),
//    		                hasEntry("petType", "Dog")
//    		            )
//    		      )
//    		 );
//    }

}