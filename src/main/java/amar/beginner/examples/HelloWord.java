package  amar.beginner.examples;

import java.util.*;

public class HelloWord {
    public static void main(String[] args) {
        List<Integer> someNumbers1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            someNumbers1.add(100);
        }
        List<Integer> someNumbers2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            someNumbers2.add(101);
        }
        Set<Integer> someSetNumbers = new HashSet<>(someNumbers1);
        someSetNumbers.addAll(someNumbers2);
        System.out.println(someSetNumbers);
        System.out.println(someNumbers1);
        System.out.println(someNumbers2);
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
    }
}
