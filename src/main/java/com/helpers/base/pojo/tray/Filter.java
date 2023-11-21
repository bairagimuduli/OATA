
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "values",
    "exposed",
    "validValues",
    "preset",
    "propagate",
    "scope"
})
@Data
public class Filter {

    @JsonProperty("key")
    public String key;
    @JsonProperty("values")
    public String values;
    @JsonProperty("exposed")
    public Boolean exposed;
    @JsonProperty("validValues")
    public List<Object> validValues;
    @JsonProperty("preset")
    public Boolean preset;
    @JsonProperty("propagate")
    public Boolean propagate;
    @JsonProperty("scope")
    public String scope;

}
