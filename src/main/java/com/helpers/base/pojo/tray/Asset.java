
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "updated",
    "trailerId"
})
@Data
public class Asset {

    @JsonProperty("id")
    public String id;
    @JsonProperty("updated")
    public Integer updated;
    @JsonProperty("trailerId")
    public Object trailerId;

}
