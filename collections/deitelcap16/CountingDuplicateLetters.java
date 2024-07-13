package collections.deitelcap16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountingDuplicateLetters {
    public static void main(String[] args) {
        Map<Character, Integer> occurrencyMap = new HashMap<>();
        createOccurrencyMap(occurrencyMap);
        printOcurrencyMap(occurrencyMap);
    }

    private static void createOccurrencyMap(Map<Character, Integer> occurrencyMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] tokens = input.split(" ");
        for(String token: tokens) {
            char[] wordCharSequence = token.toCharArray();
            for(char tokenWordChar : wordCharSequence) {
                if(occurrencyMap.containsKey(tokenWordChar)) {
                   int count =  occurrencyMap.get(tokenWordChar);
                   occurrencyMap.put(tokenWordChar, count + 1);
                }
                else {
                    occurrencyMap.put(tokenWordChar, 1);
                }
            }
        }
    }

    private static void printOcurrencyMap(Map<Character, Integer> occurrencyMap) {
        Set<Character> keys = occurrencyMap.keySet();

        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for(Character key : sortedKeys) 
            System.out.printf("%-10s%10s%n", key, occurrencyMap.get(key));
        
        System.out.printf(
            "%nsize: %d%nisEmpty: %b%n", occurrencyMap.size(),occurrencyMap.isEmpty());
    }
}
