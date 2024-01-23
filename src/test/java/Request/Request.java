package Request;



import Config.config;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Request {

    public Response postMethod (Object obj) throws JsonProcessingException {

        init();

         Response rs = RestAssured.given()
                .header("Content-Type","application/json")
                .body(obj)
                .log().all()
                .when()
                .post(config.personalRecordCreate);



        return rs ;

    }

    public static void init(){

        RestAssured.baseURI = config.BaseURL ;

    }

}
