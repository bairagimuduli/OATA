import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpers.base.pojo.hipolabs.Country;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Hipolabs {
    @Test
    public void testCountry() throws JsonProcessingException {
        String state = "Gujarat";
        ArrayList<String> universities = new ArrayList<>();
        String response = given().get("http://universities.hipolabs.com/search?country=India").prettyPrint();
        ObjectMapper objectMapper = new ObjectMapper();
        Country[] countries = objectMapper.readValue(response, Country[].class);
        for (int i = 0; i < countries.length; i++) {
            if(state.equalsIgnoreCase(countries[i].getStateProvince())){
                System.out.println(countries[i].getName());
                universities.add(countries[i].getName());
            }
        }

    }
}
