
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "trayId",
    "layout",
    "apiUrl",
    "title",
    "description",
    "status",
    "filters",
    "sorts",
    "meta",
    "apiPath",
    "layoutOptions",
    "moreLayout",
    "customOptions",
    "addTopPadding",
    "segments",
    "tabId",
    "adMeta"
})
@Data
public class Tray {

    @JsonProperty("id")
    public String id;
    @JsonProperty("trayId")
    public String trayId;
    @JsonProperty("layout")
    public String layout;
    @JsonProperty("apiUrl")
    public String apiUrl;
    @JsonProperty("title")
    public String title;
    @JsonProperty("description")
    public String description;
    @JsonProperty("status")
    public String status;
    @JsonProperty("filters")
    public List<Filter> filters;
    @JsonProperty("sorts")
    public List<Object> sorts;
    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("apiPath")
    public String apiPath;
    @JsonProperty("layoutOptions")
    public LayoutOptions layoutOptions;
    @JsonProperty("moreLayout")
    public String moreLayout;
    @JsonProperty("customOptions")
    public List<Object> customOptions;
    @JsonProperty("addTopPadding")
    public Boolean addTopPadding;
    @JsonProperty("segments")
    public List<Object> segments;
    @JsonProperty("tabId")
    public String tabId;
    @JsonProperty("adMeta")
    public AdMeta adMeta;

}
