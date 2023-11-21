
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creativeLayout",
    "aspectRatio",
    "height",
    "width",
    "platform",
    "imageBaseUrl"
})
@Data
public class LayoutOptions {

    @JsonProperty("creativeLayout")
    public String creativeLayout;
    @JsonProperty("aspectRatio")
    public String aspectRatio;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("width")
    public Integer width;
    @JsonProperty("platform")
    public Platform platform;
    @JsonProperty("imageBaseUrl")
    public ImageBaseUrl imageBaseUrl;

}
