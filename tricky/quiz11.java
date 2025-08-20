package tricky;
import java.util.HashMap;
public class quiz11 {
    public static void main (String[] aStrings)
    {
        HashMap<String, Integer>map = new HashMap<>();
        map.put("A" , 1);
        map.put("B",2);
        map.put(null, 3);
        map.put("D", null);
        System.out.println(map.size());
    }
}
