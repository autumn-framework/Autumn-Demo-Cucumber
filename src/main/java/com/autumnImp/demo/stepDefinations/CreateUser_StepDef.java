package com.autumnImp.demo.stepDefinations;

import com.autumn.reporting.assertions.CustomAssert;
import com.autumn.utils.commonUtil.CommonUtil;
import com.autumnImp.demo.apiRequestBuilder.createUser.CreateUsers;
import com.autumnImp.demo.validators.CommonValidation;
import com.autumnImp.demo.validators.apiStatus.GetUserStatus;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateUser_StepDef {

    CreateUsers createUsers;

    @Given("^Set Create User Api Request$")
    public void setCreateUserApiRequest() {
        createUsers = new CreateUsers(CreateUsers.DEFAULT_CREATE_USER_REQUEST);
    }

    @When("^Update the name value in the Request Body$")
    public void setNameCreateUserApi() {
        String name  = CommonUtil.getInstance().generateRandomString(5);
        createUsers.getRequestPojo().setName(name);
    }

    @And("^Update the job value in the Request Body \"([^\"]*)\"$")
    public void setJobCreateUserApi(String job) {
        createUsers.getRequestPojo().setJob(job);
    }

    @Then("^Execute the Create User Api$")
    public void createJsonAndExecute() {
        createUsers.createRequestJsonAndExecute();
    }

    @And("^validate the createUser api response status code \"([^\"]*)\"$")
    public void validateBasicAssertCreateUser201(GetUserStatus.UserGetParams status)  {
        CommonValidation.getInstance().basicAsserts(createUsers, status);
    }

    @And("^validate the job value of createUser api response \"([^\"]*)\"$")
    public void validateJobValueCreateUserResponse(String job)  {
        CustomAssert.assertEquals(createUsers.getResponsePojo().getJob(), job, "");
    }

}
