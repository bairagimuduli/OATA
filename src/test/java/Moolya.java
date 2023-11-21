import org.testng.annotations.Test;

public class Moolya {

    /**
     * StringA = 'qwertyuiopiopiopui'
     * StringB = 'iop'
     */

    @Test
    public void testName() {
        String a = "qwertyuiopiopiopuiiop";
        String b = "iop";
        int length = b.length();
        int count = 0;

        char[] charArray = a.toCharArray();
        for (int i = 0; i < charArray.length-2; i++) {
            String substring = a.substring(i, i + length);
            if (substring.equalsIgnoreCase(b)){
                count++;
            }
        }
        System.out.println(count);

    }
}
