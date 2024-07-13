package collections.deitelcap16;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicate {
    public static void main(String[] args) {
        List<String> duplicatedNames = Arrays.asList(
        "Bruce Wayne",
            "Jorge Jorgin",
            "Elis Regina",
            "Summer Scott",
            "Bruce Wayne",
            "Ana Guns",
            "Ana Guns",
            "Jorge Jorgin"
            );

        Set<String> names = new LinkedHashSet<>(duplicatedNames);

        names.forEach(System.out::println);
    }
}
