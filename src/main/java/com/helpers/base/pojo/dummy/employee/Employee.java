
package com.helpers.base.pojo.dummy.employee;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "data",
    "message"
})

@Data
public class Employee {

    @JsonProperty("status")
    private String status;
    @JsonProperty("data")
    private List<EmpDetails> data;
    @JsonProperty("message")
    private String message;
}
