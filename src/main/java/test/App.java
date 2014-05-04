package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Doubler toto = (int n) -> {
            return n * 5;
        };

        JeFaisDesTrucs titi;
        titi = () -> {
            System.out.println("I am doing something cool");
            return;
        };

        System.out.println("Hello World! " + toto.atTwices(30));
        titi.doSomething();

        List<String> strings = Arrays.asList("hello", "world", "!");
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
        System.out.println(strings);
    }

    public interface Doubler {
        int atTwices(int n);
    }

    public interface JeFaisDesTrucs {
        void doSomething();
    }
}
