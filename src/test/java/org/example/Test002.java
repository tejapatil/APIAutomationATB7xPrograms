package org.example;

import io.restassured.RestAssured;

public class Test002 {
    public static void main(String[] args) {

        System.out.println("Rest assured Test case");
        System.out.println("Get Request Demo");

        // Gherkins Syntax
//        given() - url, headers, body or paylaod
//        when() - http methods - get, post, patch, put, delete
//        then() - verify the response - er == ar

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1").log().all()
                .when()
                .get()
                .then().log().all()
                        .statusCode(200); //<201> but was <200>



    }
}
