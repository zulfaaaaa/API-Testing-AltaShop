package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginInvalidEndMeth{
    protected static String url = "https://altashop-api.fly.dev/api/auth/loginnn";
    @Step("user is on Login page endpoint invalid method and endpoint")
    public String userOnLoginEndpoint(){
        return url;
    }
    @Step("user requests the Login endpoint invalid method and endpoint")
    public void userRequestTheLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","sampleregsss@mail.com");
        requestBody.put("password","123qwe");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).get(userOnLoginEndpoint());
    }
    @Step("user success Login status code response 404 invalid method and endpoint")
    public void TheSystemresponsWithTheStatusCode200(){

        restAssuredThat(response -> response.statusCode(404));

    }
}

