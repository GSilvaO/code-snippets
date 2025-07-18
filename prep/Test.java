import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[] {"a"};
        List<List<String>> lista = new ArrayList<>();
        lista.add(Arrays.asList(strs)); 
        System.out.println(new ArrayList<>(Arrays.asList(strs)));
    }
}
