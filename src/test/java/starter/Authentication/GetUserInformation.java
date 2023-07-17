package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetUserInformation {
    protected static String email="samplereg@mail.com";
    protected static String password="123qwe";
    public String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ilp1bGZhIE51cnN5YWRpeWFoIiwiRW1haWwiOiJzYW1wbGVyZWdAbWFpbC5jb20ifQ.VtKfCYfJXKNcW1w8qmkXXNFmN55Qtci7pxE2rTyCu40";
    public String endpointAuth="https://altashop-api.fly.dev/api/auth";
    @Step("I have endpoint auth")
    public String setPostEndpointAuth(){
        return endpointAuth + "/login";
    }

    @Step ("I Send endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("i send endpoint get")
    public String setEnpointGet(){
        return endpointAuth + "/info";
    }

    @Step("i Send GET HTTP Request")
    public void sendGetUserInfo(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEnpointGet());
    }
    @Step("User get user information status code 200")
    public void UserGetUserInformationStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
