package apitesting;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiShopTest {
   static Logger log = LogManager.getRootLogger();

   @BeforeMethod
    public void setup(){
       RestAssured.baseURI = "http://shop.bugred.ru/";
   }

   @Step("Check id and name")
   @Test(description = "Test API shop - GET", priority = 3)
    public void testGet(){
       String idCheck = "123";
       String resultName = "Шортики";

       log.info("Check id " +  idCheck + " - " + resultName );

       Response response =
       given()
               .log().all()
               .when()
               .get("http://shop.bugred.ru/api/items/get/?id="+idCheck)
               .then()
               .statusCode(200)
               .assertThat()
               .body("result.name", equalTo(resultName)) //.body("result.id", equalTo("123"))
               .extract()
               .response();
   }
}
