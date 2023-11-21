import org.testng.annotations.Test;

public class Games {
    /**
     * Input:   str = “Ab,c,de!$”
     * Output:  str = “ed,c,bA!$”
     */

    @Test
    public void testName() {
        String input= "Ab,c,de!$";
        String output= "ed,c,bA!$";

        String altered ="";

        // 65 -90 97-122

        char[] charArray = input.toCharArray();
        int lastIndex = charArray.length-1;

        if (charArray[lastIndex] > 122) {
            lastIndex = lastIndex -2;
        }
        int start = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (charArray[i] > 122)
            if (charArray[i] == ','|| i == lastIndex -1){
                int end = (i == lastIndex -1) ? i : -1;
                while (start<end){
                    char temp = charArray[start];
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    start++;
                    end--;
                }
                start = i+1;
            }
        }
        int left = 0;
        int right = lastIndex -1;
        while (left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(charArray);
    }

    @Test
    public void testName1() {
        String input= "Ab,c,de!$";
        String output= "ed,c,bA!$";
        String[] split = input.split(",");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : split) {
            int length = split.length;
            for (int i =length -1; i >=0 ;i--) {
                stringBuilder.append(s.charAt(i));
            }
            stringBuilder.append(",");
        }
        int length = split.length;
        if(length > 0){
            stringBuilder.deleteCharAt(length-1);
            stringBuilder.reverse();
        }
        System.out.println(stringBuilder.toString());
    }
}
