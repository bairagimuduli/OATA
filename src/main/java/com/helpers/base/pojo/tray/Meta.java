
package com.helpers.base.pojo.tray;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "trayType",
    "contentVersions",
    "isPremiumTray",
    "isAvodTray",
    "assets",
    "total",
    "userTray"
})
@Data
public class Meta {

    @JsonProperty("trayType")
    public String trayType;
    @JsonProperty("contentVersions")
    public List<String> contentVersions;
    @JsonProperty("isPremiumTray")
    public Boolean isPremiumTray;
    @JsonProperty("isAvodTray")
    public Boolean isAvodTray;
    @JsonProperty("assets")
    public List<Asset> assets;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("userTray")
    public Boolean userTray;

}
