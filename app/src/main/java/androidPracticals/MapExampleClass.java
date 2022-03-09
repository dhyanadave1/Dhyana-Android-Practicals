package androidPracticals;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleClass {
    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<Object, String>();

        map.put(1,"Red");
        map.put(5,"Yellow");
        map.put(2,"Green");
        map.put(6,"Blue");

        Set<Map.Entry<Object, String>> set = map.entrySet();

        for (Map.Entry<Object, String> entry : set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
