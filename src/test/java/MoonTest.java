import org.testng.annotations.Test;

public class MoonTest {
    @Test
    public void testName() {
        String [] array = {"leet", "abcd", "loot", "geek", "cool", "for", "peer", "dear",
                "seed", "meet", "noon", "otto", "mess", "loss"};
        String  word = "moon";

        /**
         * 1. check length
         * 2. parttern idf it repeted or anything else
         */

        for (int i = 0; i < array.length; i++) {
            if (word.length() == array[i].length() && isPattern(word, array[i])){
                System.out.println(array[i]);
            }
        }


    }

    public boolean isPattern(String word, String arr){
        boolean flag = false;
        char[] chars = word.toCharArray();
        char[] chars1 = arr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[(chars.length/2)-1] == chars[(chars.length/2)]){
                if(chars1[(chars1.length/2)-1]== chars1[(chars1.length/2)]){
                    flag=  true;
                }
                else flag = false;
            }
        }
        return flag;
    }
}
