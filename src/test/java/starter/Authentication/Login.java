package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Login {
    protected static String url = "18.141.56.154:8000/login";
    @Step("user is on Login page endpoint")
    public String userOnLoginEndpoint(){
        return url;
    }
    @Step("user requests the Login endpoint")
    public void userRequestTheLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","admin@gofit.com");
        requestBody.put("password","gofitadmin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnLoginEndpoint());
    }
    @Step("user success Login status code response 200 ok")
    public void TheSystemresponsWithTheStatusCode200(){

        restAssuredThat(response -> response.statusCode(200));

    }
}

