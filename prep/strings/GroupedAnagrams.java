import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedAnagrams {
    public static void main(String[] args) {
        String[] strings = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) throw new NullPointerException();
        if(strs.length == 1) {
            List<List<String>> singleWord = new ArrayList<>();
            singleWord.add(Arrays.asList(strs));
            return singleWord;
        }

        Map<String, List<Integer>> anagramsPosition = new HashMap<String, List<Integer>>();
        StringBuilder mutableString = new StringBuilder();
        char[] stringChars = new char[strs[0].length()];
        
        for(int i = 0; i < strs.length; i++) {
            mutableString.setLength(0);
            stringChars = strs[i].toCharArray();
            Arrays.sort(stringChars);
            mutableString.append(stringChars);
            if(anagramsPosition.containsKey(mutableString.toString())) {
                anagramsPosition.get(mutableString.toString()).add(i);
                continue;
            }
            anagramsPosition.put(mutableString.toString(), 
                new ArrayList<Integer>());
            anagramsPosition.get(mutableString.toString()).add(i);
        }

        List<List<String>> groupedAnagrams = new ArrayList<>();
        List<String> equalWords = new ArrayList<>();

        for(List<Integer> positionsList : anagramsPosition.values()) {
            
            for(Integer position : positionsList) {
                equalWords.add(strs[position]);
            }
            groupedAnagrams.add(new ArrayList<>(equalWords));
            equalWords.clear();
        }

        return groupedAnagrams;
    }
}
