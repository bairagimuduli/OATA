
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "imgURL_0.5",
    "imgURL_1",
    "imgURL_2",
    "imgURL_3"
})
@Data
public class ImageBaseUrl {

    @JsonProperty("imgURL_0.5")
    public String imgURL05;
    @JsonProperty("imgURL_1")
    public String imgURL1;
    @JsonProperty("imgURL_2")
    public String imgURL2;
    @JsonProperty("imgURL_3")
    public String imgURL3;

}
