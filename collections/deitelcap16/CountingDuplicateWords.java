import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        String phrase = "Hoje não hoje não hoje, mas amanhã porém amanhã então então.";
        String phraseWithoutPunctuation = phrase.replaceAll("[.,;!?]*", "");
        String[] tokens = phraseWithoutPunctuation.split(" ");

        // first version, printing only the number of duplicate words
        System.out.println("=== VERSION 1 ====");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(tokens));
        int numberOfDuplicateWords = tokens.length - uniqueWords.size();
        System.out.println("The number of duplicate words is: " + numberOfDuplicateWords);

        // second version, printing not only the number of duplicate words but what are those words
        System.out.println("=== VERSION 2 ====");
        HashMap<String, Integer> wordsCountMap = new HashMap<>();
        List<String> repeatedWords = new ArrayList<>();
        for(String word : tokens) {
            if(!wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, 1);
            }
            else {
                Integer count = wordsCountMap.get(word);
                wordsCountMap.put(word, count + 1);
                repeatedWords.add(word);
            }
        }

        if(repeatedWords.size() != 0) {
            
            repeatedWords.forEach(word -> {
              Integer repeatedWordCount =  wordsCountMap.get(word);
              System.out.printf("The word %s appeared %d times", word, repeatedWordCount);
              System.out.println(); 
            });
        }
        else {
            System.out.println("There are no repeated words");
        }
    }

}
