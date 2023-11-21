package com.helpers.base.services.dummy;

import com.helpers.base.ApiUtil;
import io.restassured.response.Response;

public class EmployeeService {
    ApiUtil apiUtil = new ApiUtil();

    String url = "http://dummy.restapiexample.com/";

    public Response getAllEmployee(){
        String path = "api/v1/employees";
        Response response = apiUtil.get(url + path);
        return response;

    }
}
