package collection;
import org.assertj.core.api.Assertions;
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
    //    Assertions.assertThat(animal).isEmpty();

        LinkedList<String> sortanimal = new LinkedList<>();

        sortanimal.add("Cat");
        sortanimal.add("Cat");
        sortanimal.add("Cat");
        sortanimal.add("Dog");
        sortanimal.add("Rabbit");
        Assertions.assertThat(animal).isEqualTo(sortanimal);
       // System.out.println(animal.equals(sortanimal));
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
        reverseAnimal.add("Rabbit");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Cat");
        reverseAnimal.add("Dog");
        Assertions.assertThat(reverseAnimal.indexOf("Cat")).isEqualTo(1);

     //   System.out.println(reverseAnimal.indexOf("Rabbit"));
        Assertions.assertThat(animals).isEqualTo(reverseAnimal);
       // System.out.println(animals.equals(reverseAnimal));
     //   System.out.println(animals.indexOf("Cat"));
      //  System.out.println(reverseAnimal.contains("Dog"));
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
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(111);
        Assertions.assertThat(arraylistnumber).isEqualTo(expected);
      //  System.out.println(arraylistnumber.equals(expected));
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