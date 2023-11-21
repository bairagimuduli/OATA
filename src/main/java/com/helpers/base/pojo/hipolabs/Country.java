
package com.helpers.base.pojo.hipolabs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "web_pages",
    "domains",
    "country",
    "name",
    "state-province",
    "alpha_two_code"
})
@Data
public class Country {

    @JsonProperty("web_pages")
    public List<String> webPages;
    @JsonProperty("domains")
    public List<String> domains;
    @JsonProperty("country")
    public String country;
    @JsonProperty("name")
    public String name;
    @JsonProperty("state-province")
    public String stateProvince;
    @JsonProperty("alpha_two_code")
    public String alphaTwoCode;

}
