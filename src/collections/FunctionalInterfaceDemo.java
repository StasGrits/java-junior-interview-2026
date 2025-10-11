package collections;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {


        // Проверка на пустоту строк с помощью Predicate
        Predicate<String> isNotEmpty = s -> s != null && s.isEmpty();


        // Узнавание длины строки с помощью Function
        Function<String, Integer> stringLength = s -> s.length();


        // Печать строк в верхнем регистре с помощью Consumer
        Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());

        // Генерация случайных чисел с помощью Supplier
        Supplier<Integer> randomInteger = () -> ThreadLocalRandom.current().nextInt();

    }
}
