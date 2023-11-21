
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfCards",
    "gutterWidth",
    "showSelectLabel",
    "selectLabelFontSize",
    "showAssetTitle",
    "showTrayTitle"
})
@Data
public class Web {

    @JsonProperty("numberOfCards")
    public Integer numberOfCards;
    @JsonProperty("gutterWidth")
    public Integer gutterWidth;
    @JsonProperty("showSelectLabel")
    public Boolean showSelectLabel;
    @JsonProperty("selectLabelFontSize")
    public Integer selectLabelFontSize;
    @JsonProperty("showAssetTitle")
    public Boolean showAssetTitle;
    @JsonProperty("showTrayTitle")
    public Boolean showTrayTitle;

}
