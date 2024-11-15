package org.example.ex15092024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {
    public static void main(String[] args) {
        // POST Request
        // URL - https://restful-booker.herokuapp.com/auth
        // BODY - PAYLOAD - JSON
        // {
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        // HEADER - Content Type -> application/json

        //  Payload  - String(1%), Hashmap(4%), Classes( 95%)

        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        // Given - Request Spec
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        //when- Response
        Response response=r.when().post();

        // Then - ValidatableResponse
        // Validation

        ValidatableResponse validatableResponse= response.then();
        validatableResponse.statusCode(200);
    }

}
