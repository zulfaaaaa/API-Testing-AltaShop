//package starter.Orders;
//
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Step;
//
//import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
//
//public class GetOrderById {
//    protected static String url = "https://altashop-api.fly.dev/api/categories/13861";
//
//    @Step("user is on the product categories list by ID page endpoint")
//    public String userIsOnTheProductCategoriesListByIdPageEndpoint(){
//        return url;
//    }
//    @Step("user requests the product categories list by ID endpoint")
//    public void userRequestTheProductCategoriesListbyIDendpoint(){
//        SerenityRest.given().get(userIsOnTheProductCategoriesListByIdPageEndpoint());
//    }
//
//    @Step("user receive that the response code is 200 ok for get product categories by Id")
//    public void SystemGivesaResponseWithStatusCode200ForGetCategoryById(){
//        restAssuredThat(response -> response.statusCode(200));
//    }
//}
