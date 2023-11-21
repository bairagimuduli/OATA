package com.helpers.base.services.swagger;

import com.helpers.base.ApiUtil;
import com.helpers.base.services.swagger.pojo.CreateUser;
import io.restassured.response.Response;

public class SwaggerService {
    ApiUtil apiUtil = new ApiUtil();

    String url = "https://petstore.swagger.io/";

    public Response createUser(String firstName, String lastName, String emailId, String password, String phone){
        CreateUser createUser = new CreateUser();
        createUser.setFirstName(firstName);
        createUser.setLastName(lastName);
        createUser.setEmail(emailId);
        createUser.setPassword(password);
        createUser.setPhone(phone);

        Response response = createUser(createUser);
        return response;
    }
    public Response createUser(CreateUser user){
        String path = "v2/user";
        Response response = apiUtil.post(url + path, user);
        return response;
    }
}
