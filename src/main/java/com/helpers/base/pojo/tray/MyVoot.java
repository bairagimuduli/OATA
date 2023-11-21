
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "description",
    "platformId",
    "slug",
    "customizable",
    "editable",
    "default",
    "trays",
    "variant",
    "basePlatform",
    "includeBaseTrays",
    "updated",
    "trayCount",
    "viewConfigUrl"
})
@Data
public class MyVoot {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("platformId")
    public String platformId;
    @JsonProperty("slug")
    public String slug;
    @JsonProperty("customizable")
    public Boolean customizable;
    @JsonProperty("editable")
    public Boolean editable;
    @JsonProperty("default")
    public Boolean _default;
    @JsonProperty("trays")
    public List<Tray> trays;
    @JsonProperty("variant")
    public String variant;
    @JsonProperty("basePlatform")
    public String basePlatform;
    @JsonProperty("includeBaseTrays")
    public Boolean includeBaseTrays;
    @JsonProperty("updated")
    public Integer updated;
    @JsonProperty("trayCount")
    public Integer trayCount;
    @JsonProperty("viewConfigUrl")
    public String viewConfigUrl;

}
