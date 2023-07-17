package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegisterInvalidMethod {
    protected static String url = "https://altashop-api.fly.dev/api/auth/register";
    @Step("user is on Register page endpoint")
    public String userOnRegisterEndpoint(){
        return url;
    }
    @Step("user requests the Register endpoint")
    public void userRequestTheRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","abcdsd@mail.com");
        requestBody.put("password","abcd");
        requestBody.put("fullname","Zulfa Nursyadiyah");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userOnRegisterEndpoint());
    }
    @Step("user success Register status code response 200 ok")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

