
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "subType",
    "screen",
    "position",
    "layout"
})
@Data
public class AdMeta {

    @JsonProperty("type")
    public String type;
    @JsonProperty("subType")
    public String subType;
    @JsonProperty("screen")
    public String screen;
    @JsonProperty("position")
    public String position;
    @JsonProperty("layout")
    public String layout;

}
