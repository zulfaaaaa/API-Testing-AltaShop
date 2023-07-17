package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.*;
//import starter.Orders.CreateNewOrders;
//import starter.Orders.GetAllOrders;
import starter.Product.*;
import starter.ProductCategories.CreateACategory;
import starter.ProductCategories.DeleteACaetgory;
import starter.ProductCategories.GetAllCategories;
import starter.ProductCategories.GetCategoryById;

public class UserSteps {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    GetUserInformation getUserInformation;
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    CreateNewProduct createNewProduct;
    @Steps
    GetProductByID getProductByID;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    AssignaProductRating assignaProductRating;
    @Steps
    GetProductRatings getProductRatings;
    @Steps
    CreateACategory createACategory;
    @Steps
    GetAllCategories getAllCategories;
    @Steps
    GetCategoryById getCategoryById;
    @Steps
    DeleteACaetgory deleteACaetgory;
    @Steps
    RegisterInvalidMethod registerInvalidMethod;
    @Steps
    RegisterInvalidEndpoint registerInvalidEndpoint;
    @Steps
    LoginInvalidMethod loginInvalidMethod;
    @Steps
    LoginInvalidEndpoint loginInvalidEndpoint;
    @Steps
    RegisterInvalidEndMeth registerInvalidEndMeth;
    @Steps
    LoginInvalidEndMeth loginInvalidEndMeth;
//    @Steps
//    CreateNewOrders createNewOrders;
//    @Steps
//    GetAllOrders getAllOrders;


    //============================ Register ==============================
    @Given("user is on Register page endpoint")
    public void userIsOnRegisterPageEndpoint() {
        register.userOnRegisterEndpoint();
    }

    @When("user requests the Register endpoint")
    public void userRequestsTheRegisterEndpoint() {
        register.userRequestTheRegisterEndpoint();
    }

    @Then("user success Register status code response 200 ok")
    public void userSuccessRegisterStatusCodeResponseOk() {
        register.TheSystemresponsWithTheStatusCode200();
    }

    //============================ Register Invalid Method ==============================
    @Given("user is on Register page endpoint invalid method")
    public void userIsOnRegisterPageEndpointInvalidMethod() {
        registerInvalidMethod.userOnRegisterEndpoint();
    }

    @When("user requests the Register endpoint invalid method")
    public void userRequestsTheRegisterEndpointInvalidMethod() {
        registerInvalidMethod.userRequestTheRegisterEndpoint();
    }

    @Then("user success Register status code response 405 invalid method")
    public void userSuccessRegisterStatusCodeResponseOkInvalidMethod() {
        registerInvalidMethod.TheSystemresponsWithTheStatusCode200();
    }

    //============================ Register Invalid Endpoint ==============================
    @Given("user is on Register page endpoint invalid endpoint")
    public void userIsOnRegisterPageEndpointInvalidEndpoint() {
        registerInvalidEndpoint.userOnRegisterEndpoint();
    }

    @When("user requests the Register endpoint invalid endpoint")
    public void userRequestsTheRegisterEndpointInvalidEndpoint() {
        registerInvalidEndpoint.userRequestTheRegisterEndpoint();
    }

    @Then("user success Register status code response 404 invalid endpoint")
    public void userSuccessRegisterStatusCodeResponseOkInvalidEndpoint() {
        registerInvalidEndpoint.TheSystemresponsWithTheStatusCode200();
    }

    //============================ Register Invalid Endpoint and Method ==============================
    @Given("user is on Register page endpoint invalid method and endpoint")
    public void userIsOnRegisterPageEndpointInvalidEndMeth() {
        registerInvalidEndMeth.userOnRegisterEndpoint();
    }

    @When("user requests the Register endpoint invalid method and endpoint")
    public void userRequestsTheRegisterEndpointInvalidEndMeth() {
        registerInvalidEndMeth.userRequestTheRegisterEndpoint();
    }

    @Then("user success Register status code response 404 invalid method and endpoint")
    public void userSuccessRegisterStatusCodeResponseOkInvalidEndMeth() {
        registerInvalidEndMeth.TheSystemresponsWithTheStatusCode200();
    }


    //================================ Login ========================================
    @Given("user is on Login page endpoint")
    public void userIsOnLoginPageEndpoint() {
        login.userOnLoginEndpoint();}
    @When("user requests the Login endpoint")
    public void userRequestsTheLoginEndpoint() {
        login.userRequestTheLoginEndpoint();}
    @Then("user success Login status code response 200 ok")
    public void userSuccessLoginStatusCodeResponseOk() {
        login.TheSystemresponsWithTheStatusCode200();}

    //================================ Login Invalid Method ========================================
    @Given("user is on Login page endpoint invalid method")
    public void userIsOnLoginPageEndpointInvalidMethod() {
        loginInvalidMethod.userOnLoginEndpoint();}
    @When("user requests the Login endpoint invalid method")
    public void userRequestsTheLoginEndpointInvalidMethod() {
        loginInvalidMethod.userRequestTheLoginEndpoint();}
    @Then("user success Login status code response 405 ok invalid method")
    public void userSuccessLoginStatusCodeResponseOkInvalidMethod() {
        loginInvalidMethod.TheSystemresponsWithTheStatusCode200();}

    //================================ Login Invalid Endpoint ========================================
    @Given("user is on Login page endpoint invalid endpoint")
    public void userIsOnLoginPageEndpointInvalidEndpoint() {
        loginInvalidEndpoint.userOnLoginEndpoint();}
    @When("user requests the Login endpoint invalid endpoint")
    public void userRequestsTheLoginEndpointInvalidEndpoint() {
        loginInvalidEndpoint.userRequestTheLoginEndpoint();}
    @Then("user success Login status code response 404 invalid endpoint")
    public void userSuccessLoginStatusCodeResponseOkInvalidEndpoint() {
        loginInvalidEndpoint.TheSystemresponsWithTheStatusCode200();}

    //================================ Login Invalid EndMeth ========================================
    @Given("user is on Login page endpoint invalid method and endpoint")
    public void userIsOnLoginPageEndpointInvalidEndMeth() {
        loginInvalidEndMeth.userOnLoginEndpoint();}
    @When("user requests the Login endpoint invalid method and endpoint")
    public void userRequestsTheLoginEndpointInvalidEndMeth() {
        loginInvalidEndMeth.userRequestTheLoginEndpoint();}
    @Then("user success Login status code response 404 invalid method and endpoint")
    public void userSuccessLoginStatusCodeResponseOkInvalidEndMeth() {
        loginInvalidEndMeth.TheSystemresponsWithTheStatusCode200();}


    //============================ Get All Product ==============================
    @Given("user is on the product list page endpoint")
    public void userIsOnTheProductListPageEndpoint() {
        getAllProduct.UserisOnTheProductListPageEndpoint();
    }

    @When("user requests the product list endpoint")
    public void userRequestsTheProductListEndpoint() {
        getAllProduct.UserrequestTheProductListEndpoint();
    }

    @Then("user should receive a list of products")
    public void userShouldReceiveAListOfProducts() {
        getAllProduct.UserShouldReceiveAListOfProduct();
    }

    @And("i receive that the response code is 200 OK")
    public void iReceiveThatTheResponseCodeIsOK() {
        getAllProduct.thatTheRespodeCodeis200OK();
    }

    // ============================CreateNewProduct================================
    @Given("user is on the product POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        createNewProduct.userIsOnTheProductPostPageEndpoint();
    }

    @When("a user makes a request with the POST method on the endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointWithPostData() {
        createNewProduct.UserMakesArequestWithTheOstMethode();

    }

    @Then("the system responds with the status code 200")
    public void theSystemRespondsWithTheStatusCode() {
        createNewProduct.TheSystemresponsWithTheStatusCode200();
    }

    @And("the post add new prodoct that was just created")
    public void thePostAddNewProdoctThatWasJustCreated() {
    }


    // =============================GetProductByID=====================================
    @Given("user is on the product list by ID page endpoint")
    public void userIsOnTheProductListByIDPageEndpoint() {
        getProductByID.userIsOnTheProductListByIdPageEndpoint();
    }

    @When("user requests the product list by ID endpoint")
    public void userRequestsTheProductListByIDEndpoint() {
        getProductByID.userRequestTheProductListbyIDendpoint();
    }

    @Then("i receive that the response code is 200")
    public void iReceiveThatTheResponseCodeIs() {
        getProductByID.SystemGivesaResponseWithStatusCode200();
    }

    @And("user should receive a products by ID")
    public void userShouldReceiveAProductsByID() {
    }
//===============================DeleteProduct=============================
    @Given("user wants to delete post data with valid ID")
    public void userWantsToDeletePostDataWithValidID() {
        deleteProduct.UserWantToDeletePostDataWithValidID();

    }

    @When("a user makes a request with the DELETE method on the endpoint")
    public void aUserMakesARequestWithTheDELETEMethodOnTheEndpoint() {
        deleteProduct.UserMakeArequestWithTheDeleteMethode();
    }

    @Then("the system gives a response with status code 200")
    public void theSystemGivesAResponseWithStatusCode() {
        deleteProduct.theSystemGiveAresponseWithStatusCode200();
    }

    @And("post data with ID 11305 has been deleted")
    public void postDataWithIDHasBeenDeleted() {
    }
//================================AssignAProductRating==================================
    @Given("user is on the page Endpoint")
    public void userIsOnThePageEndpoint() {
        assignaProductRating.prossesEndpointAuth();
        assignaProductRating.KirimEndpointAuth();
    }

    @When("user selects makes a request with the POST method on the endpoint")
    public void userSelectsMakesARequestWithThePOSTMethodOnTheEndpoint() {
        assignaProductRating.setEndpointRatings();
    }

    @Then("the product rating should be assign")
    public void theProductRatingShouldBeAssign() {
        assignaProductRating.sendEndpointCreateRatings();
    }

    @And("the system responds with the status code 200 ok")
    public void theSystemRespondsWithTheStatusCodeOk() {
        assignaProductRating.getStatusCOde();
    }
    //====================GetProductRating=============================
    @Given("user is on the product ratings page endpoint")
    public void userIsOnTheProductRatingsPageEndpoint() {
        getProductRatings.UserrequestTheProductRatingsEndpoint();
    }

    @When("user requests the product ratings endpoint")
    public void userRequestsTheProductRatingsEndpoint() {
        getProductRatings.UserrequestTheProductRatingsEndpoint();
    }

    @Then("user should receive a list of products ratings")
    public void userShouldReceiveAListOfProductsRatings() {
        getProductRatings.UserShouldReceiveAListOfProductRatings();
    }

    @And("i receive response code is 200 OK")
    public void iReceiveResponseCodeIsOK() {
        getProductRatings.TheRespodeCodeis200OK();
    }



    //  ==========================Get User Information ==================================
    @Given("user have endpoint auth")
    public void userHaveEndpointAuth() {
        getUserInformation.setPostEndpointAuth();}
    @When("user send endpoint auth")
    public void userSendEndpointAuth() {
        getUserInformation.sendEndpointAuth();}
    @When("user has endpoint to get user information")
    public void userHasEndpointToGetUserInformation() {
        getUserInformation.setEnpointGet();}
    @And("user get user information")
    public void userGetUserInformation() {
        getUserInformation.sendGetUserInfo();}
    @Then("User get user information status code 200")
    public void userGetUserInformationStatusCode() {
        getUserInformation.UserGetUserInformationStatusCode200();}


    // ============================ Create A Category ================================
    @Given("user is on the product categories page with endpoint and POST method")
    public void userIsOnTheProductCategoriesPageEndpoint() {
        createACategory.userIsOnTheProductCategoriesPageEndpoint();
    }
    @When("a user makes a request with the POST method on the endpoint with post data for create new product categories")
    public void UserMakesARequestWithPostMethodeAndCreateNewCategories() {
        createACategory.UserMakesARequestWithPostMethodeAndCreateNewCategories();

    }
    @Then("the system responds with the status code 200 for create new product categories")
    public void theSystemRespondsWithTheStatusCode200() {
        createACategory.TheSystemresponsWithTheStatusCode200ForCreateNewCategories();
    }

    //============================ Get All Categories ==============================
    @Given("user is on the product categories with endpoint and GET method")
    public void userIsOnTheProductCategoriesListPageEndpoint() {
        getAllCategories.UserisOnTheProductCategoriesListPageEndpoint();
    }
    @When("user requests the product categories list endpoint")
    public void userRequestsTheProductCategoriesListEndpoint() {
        getAllCategories.UserRequestTheProductCategoriesListEndpoint();
    }
    @Then("i receive that the response code is 200 OK for get all product categories")
    public void userShouldReceiveAListOfProductsCategories() {
        getAllCategories.UserShouldReceiveAListOfProductCategories();
    }
    @And("user should receive a list of product categories")
    public void iReceiveThatTheResponseCodeIs200okForGetAllCategories() {
        getAllCategories.thatTheResponCodeis200ForGetAllCategories();
    }

    // =============================Get Product Categories By ID =====================================
    @Given("user is on the product categories list by ID page endpoint")
    public void userIsOnTheProductCategoriesListByIDPageEndpoint() {
        getCategoryById.userIsOnTheProductCategoriesListByIdPageEndpoint();
    }
    @When("user requests the product categories list by ID endpoint")
    public void userRequestsTheProductCategoriesListByIDEndpoint() {
        getCategoryById.userRequestTheProductCategoriesListbyIDendpoint();
    }
    @And("user should receive a product Categories by ID")
    public void userShouldReceiveAProductCategoriesByID() {
    }
    @Then("user receive that the response code is 200 ok for get product categories by Id")
    public void iReceiveThatTheResponseCodeIs200() {
        getCategoryById.SystemGivesaResponseWithStatusCode200ForGetCategoryById();
    }

    //===============================DeleteProduct=============================
    @Given("user wants to delete categories data with valid ID")
    public void userWantsToDeleteCategoryWithValidID() {
        deleteACaetgory.UserWantToDeleteCategoriesWithValidID();
    }
    @When("a user makes a request with the DELETE method on the endpoint for delete categories id 13837")
    public void aUserMakesARequestWithTheDELETEMethodForDeleteCategory() {
        deleteACaetgory.UserMakeARequestWithTheDeleteMethodForDeleteById();
    }
    @Then("the system gives a response status code 200 and categories data with ID 13837 has been deleted")
    public void theSystemGivesAResponseWithStatusCode200ForDeleteCategory() {
        deleteACaetgory.theSystemGiveAresponseWithStatusCode200ForDeleteById();
    }

    // ============================ Create New Orders ================================
//    @Given("user is on the orders page with endpoint and POST method")
//    public void userIsOnTheOrdersPageEndpoint() {
//        createNewOrders.userIsOnTheOrdersPageEndpoint();
//    }
//    @When("a user makes a request with the POST method on the endpoint for create new orders")
//    public void UserMakesARequestWithPostMethodeAndCreateNewOrders() {
//        createNewOrders.UserMakesARequestWithPostMethodeAndCreateNewOrders();
//
//    }
//    @Then("the system responds with the status code 200 for create new orders")
//    public void theSystemRespondsWithTheStatusCode200ForCreateNewOrders() {
//        createNewOrders.TheSystemresponsWithTheStatusCode200ForCreateNewOrders();
//    }

    //============================ Get All Orders ==============================
//    @Given("user is on the orders with endpoint and GET method")
//    public void userIsOnTheOrdersListPageEndpoint() {
//        getAllOrders.UserisOnTheOrdersListPageEndpoint();
//    }
//    @When("user requests the orders list endpoint")
//    public void userRequestsTheOrdersListEndpoint() {
//        getAllOrders.UserRequestTheOrdersListEndpoint();
//    }
//    @And("i receive that the response code is 200 OK for get all orders")
//    public void iReceiveThatTheResponseCodeIs200okForGetAllOrders() {
//        getAllOrders.thatTheResponCodeis200ForGetAllOrders();
//    }
//    @Then("user should receive a list of all orders")
//    public void userShouldReceiveAListOfOrders() {
//        getAllOrders.UserShouldReceiveAListOfOrders();
//    }


}