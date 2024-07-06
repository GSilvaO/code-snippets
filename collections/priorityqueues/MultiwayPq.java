import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiwayPq {
    
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);

        List<Integer> lista1 = Arrays.asList(1, 4, 6, 8);
        List<Integer> lista2 = Arrays.asList(2, 5, 6, 9);
        List<Integer> lista3 = Arrays.asList(1, 7, 10, 15);
        List<Integer> lista4 = Arrays.asList(3, 8, 10, 11);

        List<Integer> allListas = Stream.of(lista1, lista2, lista3, lista4)
                                    .flatMap(Collection::stream)
                                    .collect(Collectors.toList());                                

        PriorityQueue<Integer> pq = new PriorityQueue<>(16);
        
        for (Integer number : allListas) {
            pq.add(number);
        }

        while(!pq.isEmpty()) {
            Integer integer = pq.remove();
            System.out.println(integer);
        }
        
        Predicate<Integer> isEven = value -> value % 2 == 0;

        //lista.stream().filter(isEven).forEach(System.out::print);
        
        //lista.stream().sorted().forEach(l -> System.out.print(l));

        
    }
}
