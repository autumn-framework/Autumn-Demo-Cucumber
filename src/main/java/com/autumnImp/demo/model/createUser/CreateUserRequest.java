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
public class CreateUserRequest implements APIInterface.RequestPojo {
    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;
}
