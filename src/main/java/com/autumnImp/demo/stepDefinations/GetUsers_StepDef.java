package com.autumnImp.demo.stepDefinations;

import com.autumnImp.demo.apiRequestBuilder.getUsers.GetUsers;
import com.autumnImp.demo.validators.CommonValidation;
import com.autumnImp.demo.validators.apiStatus.GetUserStatus;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GetUsers_StepDef {

    GetUsers getUsers;

    @Given("^Set Get Users Api Request \"([^\"]*)\"$")
    public void setCreateUserApiRequest(String pageNumber) {
        getUsers = new GetUsers(pageNumber);
    }

    @Then("^Execute the Get User Api$")
    public void createJsonAndExecute() {
        getUsers.createRequestJsonAndExecute();
    }

    @And("^validate the getuser api response status code \"([^\"]*)\"$")
    public void validateBasicAssertCreateUser201(GetUserStatus.UserGetParams status)  {
        CommonValidation.getInstance().basicAsserts(getUsers, status);
    }


}
