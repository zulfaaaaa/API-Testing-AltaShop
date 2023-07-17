//package starter.Orders;
//
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Step;
//import org.json.JSONObject;
//
//import static net.serenitybdd.rest.SerenityRest.lastResponse;
//import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
//
//public class CreateNewOrders {
//
//    public String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ilp1bGZhIE51cnN5YWRpeWFoIiwiRW1haWwiOiJ6dWxmYXNkeWFAZ21haWwuY29tIn0.XsHJkov2K78h-bpn2Enjhwf9iCQlLES89ooz9nrPWYI";
//    protected static String url = "https://altashop-api.fly.dev/api/orders";
//    @Step("user is on the orders page with endpoint and POST method")
//    public String userIsOnTheOrdersPageEndpoint(){
//        return url + "/login";
//    }
//    @Step("a user makes a request with the POST method on the endpoint for create new orders")
//    public void UserMakesARequestWithPostMethodeAndCreateNewOrders(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("product_id","14600");
//        requestBody.put("quantity","4");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheOrdersPageEndpoint());
//        token = lastResponse().getBody().jsonPath().get("data");
//    }
//    @Step("the system responds with the status code 200 for create new orders")
//    public void TheSystemresponsWithTheStatusCode200ForCreateNewOrders(){
//        restAssuredThat(response -> response.statusCode(200));
//    }
//}
