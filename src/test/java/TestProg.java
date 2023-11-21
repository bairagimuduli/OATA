import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpers.base.pojo.xx.Example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProg {
    @Test
    public void testName() throws JsonProcessingException {
        String response = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Leanne Graham\",\n" +
                "    \"username\": \"Bret\",\n" +
                "    \"email\": \"Sincere@april.biz\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"Kulas Light\",\n" +
                "      \"suite\": \"Apt. 556\",\n" +
                "      \"city\": \"Gwenborough\",\n" +
                "      \"zipcode\": \"92998-3874\",\n" +
                "      \"geo\": {\n" +
                "        \"lat\": \"-37.3159\",\n" +
                "        \"lng\": \"81.1496\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"phone\": \"1-770-736-8031 x56442\",\n" +
                "    \"website\": \"hildegard.org\",\n" +
                "    \"company\": {\n" +
                "      \"name\": \"Romaguera-Crona\",\n" +
                "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                "      \"bs\": \"harness real-time e-markets\"\n" +
                "    }\n" +
                "  }\n" +
                "]";
        ObjectMapper objectMapper = new ObjectMapper();
        Example[] examples = objectMapper.readValue(response, Example[].class);
        for (int i = 0; i < examples.length; i++) {
            String email = examples[i].getEmail();
            Assert.assertTrue(emailValidator(email), "email is not valid");

        }


    }
    public boolean emailValidator(String mail){
        boolean validMail = false;
        String[] mailSplits = mail.split("@");
        if (mailSplits[1].contains(".biz")){
            validMail = true;
        }
        return validMail;
    }
}
