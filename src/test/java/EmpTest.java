import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpers.base.pojo.dummy.employee.EmpDetails;
import com.helpers.base.pojo.dummy.employee.Employee;
import com.helpers.base.services.dummy.EmployeeService;
import com.helpers.base.services.swagger.SwaggerService;
import com.helpers.base.services.swagger.pojo.CreateUser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmpTest {
    EmployeeService employeeService = new EmployeeService();
    SwaggerService swaggerService = new SwaggerService();
//    ApiUtil apiUtil = new ApiUtil();
    String fName = "Bairagi";
    String lName = "Muduli";
    String uName = "MuduliBairagi";
    String phone = "9090908765";
    String email = "xyz@123.com";
    String password = "pass123";
    @Test
    public void testGetEmp() throws JsonProcessingException {
//        Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
//        Response response = apiUtil.get("http://dummy.restapiexample.com/api/v1/employees");
        Response response = employeeService.getAllEmployee();

        ObjectMapper objectMapper = new ObjectMapper(); // Created OM instance
        Employee employee = objectMapper.readValue(response.prettyPrint(), Employee.class); // mapping json to pojo

        for (int i = 0; i < employee.getData().size(); i++) {
            EmpDetails empDetails = employee.getData().get(i);
            System.out.println(empDetails.getId() + " emp name is "+ empDetails.getEmployeeName());
        }

        Assert.assertEquals(response.statusCode(), 200, "wrong status code");
    }

    @Test
    public void testName() {

//        Response response = swaggerService.createUser(fName,lName,email,password,phone);

        Response response = swaggerService.createUser(new CreateUser("bantu", "pass"));


    }
}
