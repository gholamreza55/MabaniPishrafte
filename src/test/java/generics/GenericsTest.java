package generics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {
    @Test
    void should_works_but_have_error() {
       List list = new ArrayList<>();
      // List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add("10");
       Assertions.assertThat((Integer) list.get(1)).isNotNull();
    }
}
