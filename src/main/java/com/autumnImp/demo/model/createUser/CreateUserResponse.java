package com.autumnImp.demo.model.createUser;

import com.autumnImp.demo.apiRequestBuilder.APIInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CreateUserResponse implements APIInterface.ResponsePojo{

    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;
    @JsonProperty("id")
    public String id;
    @JsonProperty("createdAt")
    public String createdAt;


    @Override
    public Object getErrorCode() {
        return null;
    }

    @Override
    public Object getErrorMessages() {
        return null;
    }

    @Override
    public Object getMessage() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }
}
