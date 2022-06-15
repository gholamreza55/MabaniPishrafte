package collection.map;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class TreeMap {
    @Test
    void Should_Sort_Treemap() {
        Map<String, String> geometrice = new java.util.TreeMap<>();
        geometrice.put("Mosalas", "germez");
        geometrice.put("mostatil", "zard");
        geometrice.put("sheszeel", "sabz");
        geometrice.put("morabe", "germez");
        geometrice.put("morabe", "germez");
        Object[] key = geometrice.keySet().toArray();
        System.out.println((key[0]).equals("Mosalas"));
        System.out.println((key[2]).equals("mostatil"));
        System.out.println((key[3]).equals("sheszeel"));
        System.out.println((key[1]).equals("morabe"));
    }
    @Test
    void Should_Sort_Elemntery() {
        Map<String, String> geometrice = new java.util.TreeMap<>(Comparator.reverseOrder());
        geometrice.put("Mosalas", "germez");
        geometrice.put("mostatil", "zard");
        geometrice.put("sheszeel", "sabz");
        geometrice.put("morabe", "germez");
        geometrice.put("morabe", "germez");
        Object[] key = geometrice.keySet().toArray();
        System.out.println((key[3]).equals("Mosalas"));
        System.out.println((key[1]).equals("mostatil"));
        System.out.println((key[0]).equals("sheszeel"));
        System.out.println((key[2]).equals("morabe"));
    }
}
