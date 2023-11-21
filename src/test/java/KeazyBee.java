import org.testng.annotations.Test;

import java.util.HashMap;

public class KeazyBee {
    /**
     * Find duplicate characters in the provided String and also find the count of each duplicate character.
     * Bairagi
     */


    @Test
    public void testName() {
        String str = "Bairagi";
        char[] charArray = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            for (int j = i; j < charArray.length ; j++) {
                if (charArray[i] == charArray[j]){
                    count++;
                }
            }
            if (count>1){
                System.out.println(charArray[i]);
                hashMap.put(charArray[i], count);
            }

        }
        System.out.println(hashMap);
    }

}
