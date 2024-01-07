package systemdesign.designpattern.interpreterdesignpattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Integer> contextMap = new HashMap<>();

    public void put(String stringVariable, int value) {
        contextMap.put(stringVariable, value);
    }

    public int get(String stringVariable) {
        return contextMap.get(stringVariable);
    }
}
