package StringManulpulates;

import java.util.Collection;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        
    Map<Integer, Integer> counts =
    numbers.stream().collect(Collectors.toList()).stream()
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    return counts.entrySet().stream()
		.filter(x -> x.equals(1))
		.map(x->x.getValue())
        .collect(Collectors.toList());
        
       
        
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}