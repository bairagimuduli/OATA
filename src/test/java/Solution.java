import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static String searchingChallenge(String[] strArr) {
        // code goes here
        HashMap<String, Integer> keyValues =new HashMap<>();

        for (String item : strArr){
            String[] keyValue = item.split(":");
            String key = keyValue[0];
            int value = Integer.parseInt(keyValue[1]);
            keyValues.put(key, keyValues.getOrDefault(key, 0)+ value);

        }
        keyValues.entrySet().removeIf(entry -> entry.getValue()==0);
        List<String> sortedKeys = new ArrayList<>(keyValues.keySet());
        Collections.sort(sortedKeys);

        StringBuilder outPut = new StringBuilder();
        for(String key:sortedKeys){
            outPut.append(key).append(":").append(keyValues.get(key)).append(",");
        }

        return outPut.length() >0 ? outPut.substring(0, outPut.length()-1): "";
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(searchingChallenge(new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}));  // Output: "A:6,B:2"

    }

}