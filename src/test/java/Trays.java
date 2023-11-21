import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpers.base.pojo.tray.MyVoot;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Trays {
    @Test
    public void testName() throws JsonProcessingException {
        Response response = given().get("https://psapi.voot.com/jio/voot/v1/voot-web/view/my-voot?responseType=common&features=include:buttonsTray&premiumTrays=false");
        ArrayList<String> trayList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        MyVoot myVoot = objectMapper.readValue(response.prettyPrint(), MyVoot.class);
        for (int i = 0; i < myVoot.getTrays().size(); i++) {
            String title = myVoot.getTrays().get(i).getTitle();
            trayList.add(title);
            System.out.println("======================");
            System.out.println(title);
        }
    }
}
