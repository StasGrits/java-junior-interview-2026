package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> filtredList = words.stream()
                .filter(word -> word.length() > 5)
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(filtredList);


        String maxlenghtWord = words.stream().
                max((a, s) -> a.length() - s.length()).get();
        System.out.println(maxlenghtWord);

        List<String> sortedList = words.stream().
                sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
        System.out.println(sortedList);

        int lenghtList = words.stream().mapToInt(String::length).sum();
        System.out.println(lenghtList);

        List<List<Integer>> numberLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Stream <Integer> numbers = numberLists.stream().flatMap(List::stream);
        System.out.println(numbers.toList());
    }
}
