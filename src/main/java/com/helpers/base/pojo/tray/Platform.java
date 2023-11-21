
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mobile",
    "tablet",
    "web",
    "tv"
})
@Data
public class Platform {

    @JsonProperty("mobile")
    public Mobile mobile;
    @JsonProperty("tablet")
    public Tablet tablet;
    @JsonProperty("web")
    public Web web;
    @JsonProperty("tv")
    public Tv tv;

}
