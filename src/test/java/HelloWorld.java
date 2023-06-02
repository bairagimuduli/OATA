import com.helpers.base.Animal;
import com.helpers.base.Helper;
import com.helpers.base.ani.Horse;
import org.testng.annotations.Test;

public class HelloWorld {
    Helper helper = new Helper(); //right to left

    @Test
    public void find2ndLargest() {
        int [] numbers = {1,4,3,5,3,6,54,7,23,6};
        int secondLargest = helper.find2ndLargest(numbers);
        System.out.println(secondLargest);
    }

    @Test
    public void testLogin() {
        helper.login();
    }

    @Test
    public void testInheritance() {
        Animal horse = new Horse(); // upcasting
        horse.swim();
    }
}
