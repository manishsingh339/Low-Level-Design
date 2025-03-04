package designpatterns.Interpreter;

import java.util.Map;

public class Context {
    private Map<String, Integer> contextMap = new java.util.HashMap<>();

    public void put(String name, int value) {
        contextMap.put(name, value);
    }

    public int get(String name) {
        return contextMap.get(name);
    }
}
