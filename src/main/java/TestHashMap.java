import java.util.HashMap;

/**
 * Created by jesselim on 13/12/16.
 */
public class TestHashMap {
    static HashMap<String, String> map = new HashMap<String, String>();
    public static void main(String[] args) {

        System.out.println(map.toString());
        System.out.println(canSendAlert("a", "1"));
        System.out.println(canSendAlert("a", "1"));
        System.out.println(canSendAlert("a", "2"));
        System.out.println(canSendAlert("b", "1"));
        System.out.println(map.toString());

    }

    private static boolean canSendAlert(String k, String v) {
        boolean result = false;

        if (map.get(k) == null) {
            map.put(k,v);
            result = true;
        } else {
            if (!map.get(k).equalsIgnoreCase(v)) {
                map.replace(k,v);
                result = true;
            }
        }


        return result;
    }
}
