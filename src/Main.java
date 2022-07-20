import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("A", "B", "C");

        list1.stream().forEach(data -> {

            System.out.println(data);
        });

    }
}