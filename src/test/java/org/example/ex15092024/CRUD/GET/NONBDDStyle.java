package org.example.ex15092024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NONBDDStyle {
    static RequestSpecification r= RestAssured.given();

    public static void main(String[] args) {
        //r.useRelaxedHTTPSValidation("TLS""); - HTTPs related issued
        //Rest Assured Provide us the lot of classes.
        r.baseUri("https://api.zippopotam.us");
        testnon_bdd_1();
        testnon_bdd_2();
    }

    private static void testnon_bdd_2(){
        r.basePath("/IN/-1");
        r.when().get();
        r.then().log().all().statusCode(404);
    }

    private static void testnon_bdd_1(){
        r.basePath("/IN/560037");
        r.when().get();
        r.then().log().all().statusCode(200);
    }
}
