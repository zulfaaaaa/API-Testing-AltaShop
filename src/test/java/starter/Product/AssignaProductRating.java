package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignaProductRating {
    protected static String email="samplereg@mail.com";
    protected static String password="123qwe";
    public String token ="";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step("I have endpoint auth")
    public String prossesEndpointAuth(){
        return endpointAuth + "/auth/login";
    }

    @Step ("I Send endpoint auth")
    public void KirimEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(prossesEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step ("I set endpoint get ratings")
    public String setEndpointRatings() {
        return endpointAuth + "/products/85217/ratings";
    }

    @Step ("I send POST HTTP Request")
    public void sendEndpointCreateRatings() {
        String count = "3";

        String body = "{\n" +
                "    \"count\":" + count + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).body(reqBody.toString()).post(setEndpointRatings());
    }

    @Step("i see status code 200")
    public void getStatusCOde() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
