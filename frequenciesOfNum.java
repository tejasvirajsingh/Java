
import java.util.HashMap;
public class frequenciesOfNum {
    public static void main (String[] args)
{
    int[] arr = { 20, 33, 30, 40, 33, 50, 20, 50, 20, 40, 9};
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i<arr.length; i++){
        if (map.containsKey(arr[i]))
        {
            map.put(arr[i],map.get(arr[i]) +1);

        }
        else {
            map.put(arr[i] , 1);

        }
    }
    System.out.print(map);
}
}
