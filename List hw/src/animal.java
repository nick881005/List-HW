import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class animal {
    public static void main(String[] args) {
        List<Map<String, String>> animalList = new ArrayList<>();
        Map<String, String> animalMap = new HashMap<>();
        animalMap.put("shark", "ocean");
        animalMap.put("bear", "land");
        animalMap.put("moose", "land");
        animalMap.put("frog", "swamp");
        animalMap.put("jelly fish", "ocean");
        animalMap.put("heron", "swamp");
        animalMap.put("whale", "ocean");
        animalList.add(animalMap);

        Map<String, List<String>> habitat = new HashMap<>();

        animalList.forEach(m -> {
            m.forEach((key, value) -> {
                if (!habitat.containsKey(value)) {
                    habitat.put(value, new ArrayList<>());
                }
                habitat.get(value).add(key);
            });
        });

        System.out.println();
        habitat.keySet().forEach(m -> {
            System.out.println(m + ": " + String.join(" , ", habitat.get(m)));
        });
        System.out.println();
//------------------------------------------------------------------------

        Map<String, String> Mapping = new HashMap<>();
        Mapping.put("USA", "Washington");
        Mapping.put("Japan", "Tokyo");
        Mapping.put("Thailand", "Bangkok");
        Mapping.put("UK", "London");
        Mapping.put("Australia", "Canberra");
        Mapping.put("Denmark", "Copenhagen");
        Mapping.put("Egypt", "Cairo");
        Mapping.put("Vietnam", "Hanoi");
        Mapping.put("Italy", "Rome");
        Mapping.put("Brazil", "Brasilia");

        for (Map.Entry<String, String> M : Mapping.entrySet()) {
            System.out.println(M.getKey() + " : " + M.getValue());
        }

    }
}
