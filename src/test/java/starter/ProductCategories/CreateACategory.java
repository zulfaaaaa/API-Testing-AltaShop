package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateACategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("user is on the product categories page with endpoint and POST method")
    public String userIsOnTheProductCategoriesPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint with post data for create new product categories")
    public void UserMakesARequestWithPostMethodeAndCreateNewCategories(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","New Product");
        requestBody.put("description","play has no limits");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductCategoriesPageEndpoint());
    }
    @Step("the system responds with the status code 200 for create new product categories")
    public void TheSystemresponsWithTheStatusCode200ForCreateNewCategories(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
