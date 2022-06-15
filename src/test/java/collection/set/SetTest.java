package collection.set;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {


    @Test
    void HasSet_Should_Remove() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");
        Set<String> expectedAnimal = new HashSet<>();
        expectedAnimal.add("Dog");
        expectedAnimal.add("Cat");
        expectedAnimal.add("Rabbit");

        System.out.println(animals.equals(expectedAnimal));
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------------------");
    }
    @Test
    void LinkedSet_Should_Maintain_Tartib() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------------------------");
    }
    @Test
    void TreeSet_Should_Sort() {
        Set<String> animals = new TreeSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
