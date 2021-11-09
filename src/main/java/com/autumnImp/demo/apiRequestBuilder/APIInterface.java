package com.autumnImp.demo.apiRequestBuilder;

import com.autumnImp.demo.enums.api.commons.ResponseHeaders;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public interface APIInterface {

    RequestPojo getRequestPojo();
    ResponsePojo getResponsePojo();

    Response getApiResponse();

    void setHeaderMap(Map<String,String> m);

    Map<String,String> getHeaderMap();

    void setResponseHeadersMap(List<Header> m);

    String getResponseHeader(ResponseHeaders m);

    void createRequestJsonAndExecute();

    interface ResponsePojo{

        Object getErrorCode();
        Object getErrorMessages();
        Object getMessage();
        Object getDetails();
    }

    interface RequestPojo{

    }

}
