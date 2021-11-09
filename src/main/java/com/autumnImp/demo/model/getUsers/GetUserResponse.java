package com.autumnImp.demo.model.getUsers;

import com.autumnImp.demo.apiRequestBuilder.APIInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class GetUserResponse implements APIInterface.ResponsePojo
{

    @JsonProperty("page")
    public Integer page;
    @JsonProperty("per_page")
    public Integer perPage;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("total_pages")
    public Integer totalPages;
    @JsonProperty("data")
    public List<Datum> data = null;
    @JsonProperty("support")
    public Support support;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    public static class Support {

        @JsonProperty("url")
        public String url;
        @JsonProperty("text")
        public String text;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Datum {
        @JsonProperty("id")
        public Integer id;
        @JsonProperty("email")
        public String email;
        @JsonProperty("first_name")
        public String firstName;
        @JsonProperty("last_name")
        public String lastName;
        @JsonProperty("avatar")
        public String avatar;
    }

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