package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegisterInvalidEndMeth {
    protected static String url = "https://altashop-api.fly.dev/api/auth/registerrr";
    @Step("user is on Register page endpoint invalid method and endpoint")
    public String userOnRegisterEndpoint(){
        return url;
    }
    @Step("user requests the Register endpoint invalid method and endpoint ")
    public void userRequestTheRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","abcdsd@mail.com");
        requestBody.put("password","abcd");
        requestBody.put("fullname","Zulfa Nursyadiyah");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userOnRegisterEndpoint());
    }
    @Step("user success Register status code response 404 invalid method and endpoint")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

}

