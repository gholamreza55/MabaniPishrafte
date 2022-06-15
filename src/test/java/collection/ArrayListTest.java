package collection;
import org.junit.jupiter.api.Test;
import java.util.*;
public class ArrayListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        List<String> list = new LinkedList<>();
    }
    @Test
    void Should_Sort() {
        List<String> animal = new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Cat");
        animal.add("Cat");
        animal.add("Rabbit");
        Collections.sort(animal);
        LinkedList<String> sortanimal = new LinkedList<>();
        sortanimal.add("Dog");
        sortanimal.add("Cat");
        sortanimal.add("Cat");
        sortanimal.add("Cat");
        sortanimal.add("Rabbit");
        System.out.println(animal.equals(sortanimal));
    }
    @Test
    void should_be_innutable() {
        List<String> animal = new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Cat");
        animal.add("Cat");
        animal.add("Rabbit");
        List<String> u = Collections.unmodifiableList(animal);
        animal.add("snake");
    }
    @Test
    void should_reverse_a_list() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");
        Collections.reverse(animals);
        List<String> reverseAnimal = new ArrayList<>();
        reverseAnimal.add("Dog");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Rabbit");
        System.out.println(reverseAnimal.indexOf("Rabbit"));
        System.out.println(animals.equals(reverseAnimal));
        System.out.println(animals.indexOf("Cat"));
        System.out.println(reverseAnimal.contains("Dog"));
    }
    @Test
    void Ginen_an_array_return() {
        int[] arraynumber = {1, 2 ,3 ,4};
        Converter converter = new Converter();
        List<Integer> arraylistnumber = converter.convertoarraylist(arraynumber);
        arraylistnumber.add(4);
        arraylistnumber.add(2);
        arraylistnumber.add(1);
        arraylistnumber.add(111);
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(66);
        expected.add(3);
        expected.add(99);
        expected.add(111);
        System.out.println(arraylistnumber.equals(expected));
        System.out.println(expected);
    }
     class Converter {
        public List<Integer> convertoarraylist(int[] arraynumber) {
            List<Integer> listnumber = new LinkedList<>();
            for (int number : arraynumber) {
                listnumber.add(number);
            }
        return listnumber;
        }
    }
}