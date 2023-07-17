package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginInvalidEndpoint{
    protected static String url = "https://altashop-api.fly.dev/api/auth/loginnnnn";
    @Step("user is on Login page endpoint invalid endpoint")
    public String userOnLoginEndpoint(){
        return url;
    }
    @Step("user requests the Login endpoint invalid endpoint")
    public void userRequestTheLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","sampleregs@mail.com");
        requestBody.put("password","123qwe");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnLoginEndpoint());
    }
    @Step("user success Login status code response 404 invalid endpoint")
    public void TheSystemresponsWithTheStatusCode200(){

        restAssuredThat(response -> response.statusCode(404));

    }
}

