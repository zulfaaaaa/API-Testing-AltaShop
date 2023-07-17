package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("user is on the product categories with endpoint and GET method")
    public String UserisOnTheProductCategoriesListPageEndpoint(){
        return url;
    }
    @Step("user requests the product categories list endpoint")
    public void UserRequestTheProductCategoriesListEndpoint(){
        SerenityRest.given().get(UserisOnTheProductCategoriesListPageEndpoint());
    }
    @Step("i receive that the response code is 200 OK for get all product categories")
    public void UserShouldReceiveAListOfProductCategories(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user should receive a list of product categories")
    public void thatTheResponCodeis200ForGetAllCategories(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
