package Request;



import Config.config;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class request {

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
