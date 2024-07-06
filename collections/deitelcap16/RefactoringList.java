package collections.deitelcap16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RefactoringList {
    public static void main(String[] args) {
        String[] colors =
        {"black", "yellow", "green", "blue", "violet", "silver"};

        List<String> list1 = new LinkedList<>(Arrays.asList(colors));

        // Refatorado para inicializar com asList no construtor da LinkedList
        // for (String color : colors) {
        //     list1.add(color);
        // }
        
        String[] colors2 =
            {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>(Arrays.asList(colors2));

        // Refatorado para inicializar com asList no construtor da LinkedList
        // for (String color : colors2) {
        //     list2.add(color);
        // }

        list1.stream().forEach(System.out::println);
        list2.stream().forEach(System.out::println);
    }
}
