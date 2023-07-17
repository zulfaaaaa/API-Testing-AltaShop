package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteACaetgory {
    protected static String url = "https://altashop-api.fly.dev/api/categories/29376 ";

    @Step("user wants to delete categories data with valid ID")
    public String UserWantToDeleteCategoriesWithValidID(){
        return url;
    }
    @Step("a user makes a request with the DELETE method on the endpoint for delete categories id 13837")
    public void UserMakeARequestWithTheDeleteMethodForDeleteById(){
        SerenityRest.given().delete(UserWantToDeleteCategoriesWithValidID());
    }
    @Step("the system gives a response status code 200 and categories data with ID 13837 has been deleted")
    public void theSystemGiveAresponseWithStatusCode200ForDeleteById(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
