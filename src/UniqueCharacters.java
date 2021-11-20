
import java.util.*;

/**
 * Created: 08.11.2021
 *
 * @author Kilian Baier (20190608)
 */
public class UniqueCharacters {
    private final static Map<String, Integer> uniquename = new HashMap<>();

    static int UniqueCharacters(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        if (name.length() == 0) {
            return 0;
        } else {

            Set<String> list = new HashSet<>();
            if (uniquename.containsKey(name)) {
                return uniquename.get(name);
            } else {
                for (String i : name.split("")) {
                    list.add(i);

                }

            }
            uniquename.put(name, name.length());

        }
        return uniquename.get(name);

    }
}



