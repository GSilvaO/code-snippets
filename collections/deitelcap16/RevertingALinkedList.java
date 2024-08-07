package collections.deitelcap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RevertingALinkedList {
    public static void main(String[] args) {
        String[] letters = new String[]{"a", "b", "c", "d", "e"};
        List<String> linkedListLetters = new LinkedList<>(Arrays.asList(letters));

        // first way of doing it
        // List<String> reversedLinkedListLetters = new LinkedList<>();

        // ListIterator<String> linkedListLettersIterator = 
        //     linkedListLetters.listIterator(linkedListLetters.size());
        
        // while(linkedListLettersIterator.hasPrevious()) {
        //     reversedLinkedListLetters.add(linkedListLettersIterator.previous());
        // }

        // second way of doing it
        List<String> reversedLinkedListLetters = new LinkedList<>(linkedListLetters);
        Collections.reverse(reversedLinkedListLetters);

        reversedLinkedListLetters.forEach(System.out::println);
    }


}
