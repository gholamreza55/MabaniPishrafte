package collection.map;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class MapTest {
    @Test
    void Should_have_uniqe_keys() {
        Map<String, String> geometrice = new HashMap<>();
        geometrice.put("Mosalas", "germez");
        geometrice.put("mostatil", "zard");
        geometrice.put("sheszeel", "sabz");
        geometrice.put("morabe", "germez");
        geometrice.put("morabe", "germez");

        Set<Map.Entry<String, String>> entries = geometrice.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Key : "+key+" , Value : "+value );
            }
    }
    @Test
    void Should_insertion() {
        Map<String, String> geometrice = new LinkedHashMap<>();
        geometrice.put("Mosalas", "germez");
        geometrice.put("mostatil", "zard");
        geometrice.put("sheszeel", "sabz");
        geometrice.put("morabe", "germez");
        geometrice.put("morabe", "germez");
        Set<Map.Entry<String, String>> entries = geometrice.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key : "+key+" , Value : "+value );
        }
    }
}

