package com.autumnImp.demo.apiRequestBuilder.getUsers;

import com.autumn.api.BaseApi;
import com.autumn.api.ContentType;
import com.autumn.api.MethodType;
import com.autumn.api.jsonProcessor.JacksonJsonImpl;
import com.autumnImp.demo.apiRequestBuilder.APIInterface;
import com.autumnImp.demo.enums.api.commons.ResponseHeaders;
import com.autumnImp.demo.global.APIEndPoints;
import com.autumnImp.demo.global.LocalConfig;
import com.autumnImp.demo.model.getUsers.GetUserResponse;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.*;

public class GetUsers extends BaseApi implements APIInterface {


    private GetUserResponse getUserResponse;
    private Response response;
    private Map<String, String> headerMap = new HashMap<>();
    private String request;
    private String productId;
    Map<String, String> responseHeadersMap = new LinkedHashMap<>();


    @Override
    public void setResponseHeadersMap(List<Header> responseHeaders){
        for(Header header : responseHeaders){
            this.responseHeadersMap.put(header.getName(),header.getValue());
        }
    }

    @Override
    public String getResponseHeader(ResponseHeaders key){
        return responseHeadersMap.get(key.getValue());
    }



    public GetUsers(String pageNumber) {
        setBaseUri(LocalConfig.BaseURL); //setting base URL
        setMethod(MethodType.GET); //setting the method type to execute e.g. GET, POST
        setContentType(ContentType.JSON); //setting the content type application/json
        setBasePath(APIEndPoints.Users.USERS);
        addQueryParam("page",pageNumber);
        System.out.println("------------Get Users ------------");

    }


    @Override
    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return this.headerMap;
    }


    public Response getApiResponse() {
        return response;
    }

    @Override
    public RequestPojo getRequestPojo() {
        return null;
    }

    public ResponsePojo getResponsePojo() {
        return (ResponsePojo) getUserResponse;
    }

    public void createRequestJsonAndExecute() {
        try {
            addHeaders(headerMap); //adding the headers
            response = execute();
            setResponseHeadersMap(new ArrayList<>(response.getHeaders().asList()));
            getUserResponse = JacksonJsonImpl.getInstance().fromJson(response.asString(),
                    GetUserResponse.class); //convert the response to POJO
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}

