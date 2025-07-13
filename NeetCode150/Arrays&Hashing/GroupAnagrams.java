import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strings) {
        if (strings.length == 0) {
            return new ArrayList<>();
        }

        Map<String, ArrayList<String>> ansMap = new HashMap<>();

        int[] count = new int[26];

        for (String str : strings) {
            Arrays.fill(count, 0);

            for (char c : str.toCharArray()) {
                count[c - 'a'] += 1;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }

            ansMap.get(key).add(str);

        }

        return new ArrayList<>(ansMap.values());
    }

    public static void main(String[] args) {
        GroupAnagrams caller = new GroupAnagrams();

        String[] strings = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> arrayList = caller.groupAnagrams(strings);

        System.out.println(arrayList.toString());
    }
}