package com.helpers.base;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ApiUtil {
    Gson gson = new Gson();
    public Response get(String url){
        Response response = RestAssured.get(url);
        Assert.assertEquals(response.statusCode(), 200, "Request failed with status code: "+ response.statusCode());
        return response;
    }

    public Response post(RequestSpecification requestSpecification){

        Response response = requestSpecification.post();
        return response;
    }

    public Response post(String url, String body){
        Response response = given().
                contentType(ContentType.JSON).accept(ContentType.JSON).  //headers
                        body(body). //body
                        post(url);//http call
        response.prettyPrint();
        return response;
    }


    public Response post(String url, Object body) {
        Response response = given().
                contentType(ContentType.JSON).accept(ContentType.JSON).  //headers
                        body(body). //body
                        post(url);//http call
        response.prettyPrint();
        return response;
    }
}
