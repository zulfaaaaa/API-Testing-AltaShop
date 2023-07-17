//package starter.Orders;
//
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Step;
//
//import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
//
//public class GetAllOrders {
//    protected static String url = "https://altashop-api.fly.dev/api/orders";
//    @Step("user is on the orders with endpoint and GET method")
//    public String UserisOnTheOrdersListPageEndpoint(){
//        return url;
//    }
//    @Step("user requests the orders list endpoint")
//    public void UserRequestTheOrdersListEndpoint(){
//        SerenityRest.given().get(UserisOnTheOrdersListPageEndpoint());
//    }
//    @Step("i receive that the response code is 200 OK for get all orders")
//    public void UserShouldReceiveAListOfOrders(){
//        restAssuredThat(response -> response.log().all());
//    }
//    @Step("user should receive a list of all orders")
//    public void thatTheResponCodeis200ForGetAllOrders(){
//        restAssuredThat(response -> response.statusCode(200));
//    }
//}
